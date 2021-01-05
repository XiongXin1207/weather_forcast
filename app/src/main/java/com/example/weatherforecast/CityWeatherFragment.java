package com.example.weatherforecast;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weatherforecast.bean.WeatherBean;
import com.example.weatherforecast.db.DBManager;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;
import org.xutils.DbManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {
    TextView tempTv,cityTv,conditionTv,windTv,temperatureRangeTv,dateTv,clothIndexTv,carIndexTV,coldTv,sportTv,raysTv;
    ImageView dayIv;
    LinearLayout futureLayout;
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    String url2 = "&city=";
    String province;
    String city;
    private WeatherBean.DataDTO.IndexDTO index; //index类
    private SharedPreferences pref; //
    private int bgNum;  //
    private WeatherBean.DataDTO.Forecast24hDTO._$1DTO today;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        // Inflate the layout for this fragment
        initView(view);
        Bundle bundle = getArguments();
        String province_city = bundle.getString("city");
        city = bundle.getString("city");
        if(province_city.split(" ").length > 1){
            province = province_city.split(" ")[0];
            city = province_city.split(" ")[1];
        }
        else {
            province = city = province_city.split(" ")[0];
        }
        String url = url1 + province + url2 + city;
        loadData(url);
        return view;
    }

    @Override
    public void onSuccess(String result) {
        //解析并展示数据
            parseShowData(result);
        int i= DBManager.updateInfoByCity(city,result);
        if(i <= 0) {
            //更新数据库失败，需要增加城市记录
            DBManager.addCityInfo(city,result);
        }
    }

    private void parseShowData(String result) {
        //使用Gson解析数据
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        WeatherBean.DataDTO data = weatherBean.getData();//获取data对象
        today = data.getForecast_24h().get_$1();
        dateTv.setText("日期：" + data.getForecast_24h().get_$1().getTime());
        cityTv.setText(city);
        conditionTv.setText(data.getObserve().getWeather());
        temperatureRangeTv.setText(today.getMin_degree()+"~"+today.getMax_degree()+"℃");
        windTv.setText( "风力：" + today.getDay_wind_direction() + today.getDay_wind_power()+"级");
        tempTv.setText(data.getObserve().getDegree()+"℃");

        //设置显示的天气情况图片

        //设置未来三天天气情况
        WeatherBean.DataDTO.Forecast24hDTO futurelist = weatherBean.getData().getForecast_24h();
        View itemview = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center,null);
        itemview.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemview);
        //      获取对应城市未来三天的天气情况
        TextView idateTv = itemview.findViewById(R.id.item_center_tv_data);
        TextView iconTv = itemview.findViewById(R.id.item_center_tv_con);
        TextView itemperangeTv = itemview.findViewById(R.id.item_center_tv_temp);
        TextView iwindTv = itemview.findViewById(R.id.item_center_tv_winddirection);
        idateTv.setText(futurelist.get_$2().getTime());
        iconTv.setText(futurelist.get_$2().getDay_weather());
        iwindTv.setText(futurelist.get_$2().getDay_wind_direction());
        itemperangeTv.setText(futurelist.get_$2().getMin_degree()+"~"+futurelist.get_$2().getMax_degree()+"℃");
        //
        View itemview2 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center,null);
        itemview2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemview2);
        TextView idateTv2 = itemview2.findViewById(R.id.item_center_tv_data);
        TextView iconTv2 = itemview2.findViewById(R.id.item_center_tv_con);
        TextView itemprangeTv2 = itemview2.findViewById(R.id.item_center_tv_temp);
        TextView iwind2 = itemview2.findViewById(R.id.item_center_tv_winddirection);
        idateTv2.setText(futurelist.get_$3().getTime());
        iconTv2.setText(futurelist.get_$3().getDay_weather());
        iwind2.setText(futurelist.get_$3().getDay_wind_direction());
        itemprangeTv2.setText(futurelist.get_$3().getMin_degree()+"~"+futurelist.get_$3().getMax_degree()+"℃");
        // 第三天
        View itemview3 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center,null);
        futureLayout.addView(itemview3);
        TextView idateTv3 = itemview3.findViewById(R.id.item_center_tv_data);
        TextView iconTv3 = itemview3.findViewById(R.id.item_center_tv_con);
        TextView itemprangeTv3 = itemview3.findViewById(R.id.item_center_tv_temp);
        TextView iwindTv3 = itemview3.findViewById(R.id.item_center_tv_winddirection);
        idateTv3.setText(futurelist.get_$4().getTime());
        iconTv3.setText(futurelist.get_$4().getDay_weather());
        iwindTv3.setText(futurelist.get_$4().getDay_wind_direction());
        itemprangeTv3.setText(futurelist.get_$4().getMin_degree()+"~"+futurelist.get_$4().getMax_degree()+"℃");
    }

    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        // 查找上一次的天气情况
        String s = DBManager.queryInfoByCity(city);
        if(!TextUtils.isEmpty(s)){
            parseShowData(s);
        }
    }

    private String changeTime(String update_time) throws ParseException {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMddHHmm");
        SimpleDateFormat sf2 =new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String sfstr = "";
        sfstr = sf2.format(sf1.parse(update_time));
        return sfstr;
    }


    private void initView(View view) {  //初始化视图
        tempTv = view.findViewById(R.id.frag_tv_currenttemp);
        cityTv = view.findViewById(R.id.frag_tv_city);
        conditionTv = view.findViewById(R.id.farg_tv_condition);
        windTv = view.findViewById(R.id.frag_tv_wind);
        temperatureRangeTv = view.findViewById(R.id.frag_tv_temperatureRange);
        dateTv = view.findViewById(R.id.frag_tv_date);
        clothIndexTv = view.findViewById(R.id.frag_index_tv_dress);
        carIndexTV = view.findViewById(R.id.frag_index_tv_car);
        coldTv = view.findViewById(R.id.frag_index_tv_cold);
        sportTv = view.findViewById(R.id.frag_index_tv_sport);
        raysTv = view.findViewById(R.id.frag_index_tv_ray);
        futureLayout = view.findViewById(R.id.frag_center_layout);
        clothIndexTv.setOnClickListener(this);
        carIndexTV.setOnClickListener(this);
        coldTv.setOnClickListener(this);
        sportTv.setOnClickListener(this);
        raysTv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        switch(v.getId()){
            case R.id.frag_index_tv_dress:
                builder.setTitle("穿衣指数");
                WeatherBean.DataDTO.IndexDTO.ClothesDTO cloth = index.getClothes();
                String msg = cloth.getInfo() + "\n" + cloth.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_car:
                builder.setTitle("洗衣指数");
                WeatherBean.DataDTO.IndexDTO.CarwashDTO car = index.getCarwash();
                msg = car.getInfo() + "\n" + car.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_sport:
                builder.setTitle("运动指数");
                WeatherBean.DataDTO.IndexDTO.SportsDTO sports = index.getSports();
                msg = sports.getInfo() + "\n" + sports.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_ray:
                builder.setTitle("紫外线指数");
                WeatherBean.DataDTO.IndexDTO.UltravioletDTO rays = index.getUltraviolet();
                msg = rays.getInfo() + "\n" + rays.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_cold:
                builder.setTitle("感冒指数");
                WeatherBean.DataDTO.IndexDTO.ColdDTO cold = index.getCold();
                msg = cold.getInfo() + "\n" + cold.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
        }
    }
}