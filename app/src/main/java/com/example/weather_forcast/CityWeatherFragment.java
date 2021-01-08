package com.example.weather_forcast;

import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.weather_forcast.base.BaseFragment;
import com.example.weather_forcast.bean.WeatherBean;
import com.example.weather_forcast.db.DBManager;
import com.google.gson.Gson;

import static android.content.Context.MODE_PRIVATE;


public class CityWeatherFragment extends BaseFragment implements View.OnClickListener{
    TextView tempTv, cityTv, conditionTv, windTv, tempRangeTv, dateTv,
            clothIndexTv, carIndexTV, coldIndexTv, sportIndexTv, raysIndexTV, dayIv, umbrellaIv;
    LinearLayout futureLayout;
    ScrollView outLayout;
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    String url2 = "&city=";
    String province;
    String city;
    private WeatherBean.DataDTO.IndexDTO indexList;
    private SharedPreferences pref;
    private int bg;

    // 换壁纸的函数
    public void exchangeBg(){
        pref = getActivity().getSharedPreferences("bg_pref", MODE_PRIVATE);
        bg = pref.getInt("bg", 2);
        switch (bg){
            case 0:
                outLayout.setBackgroundResource(R.mipmap.bg);
                break;
            case 1:
                outLayout.setBackgroundResource(R.mipmap.bg2);
                break;
            case 2:
                outLayout.setBackgroundResource(R.mipmap.bg3);
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
        exchangeBg();
        // 可以通过activity传值获取当前fragment加载的是哪个地方的天气情况
        Bundle bundle = getArguments();
        String province_city = bundle.getString("city");
        if(province_city.split(" ").length>1)
        {
            province =province_city.split(" ")[0];
            city = province_city.split(" ")[1];
        }
        else
        {
            city = province_city.split(" ")[0];
            province = province_city.split(" ")[0];
        }
        String url = url1+province+url2+city;
        // 调用父类获取数据的方法
        loadData(url);
        return view;
    }

    @Override
    public void onSuccess(String result) {
        // 解析并展示数据
        parseShowData(result);
        // 更新数据
        int i = DBManager.updateInfoByCity(city, result);
        if(i<=0){
            // 更新数据库失败,说明没有这条城市信息，增加这个城市记录
            DBManager.addCityInfo(city, result);
        }
    }
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        // 数据库当中查找上一次信息显示在Fragment中
        String s = DBManager.queryInfoByCity(city);
        if(!TextUtils.isEmpty(s)){
            parseShowData(s);
        }
    }
    private void parseShowData(String result) {
        // 使用Gson解析数据
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        WeatherBean.DataDTO resultsBean = weatherBean.getData();
        // 获取指数信息集合列表
        indexList = resultsBean.getIndex();
        // 设置TextView
        dateTv.setText(resultsBean.getForecast24h().get$1().getTime());
        cityTv.setText(city);
        // 获取今天的天气情况
        windTv.setText(resultsBean.getForecast24h().get$1().getDayWindDirection()+" "+resultsBean.getForecast24h().get$1().getDayWindPower()+"级");
        tempRangeTv.setText(resultsBean.getForecast24h().get$1().getMinDegree()+"~"+resultsBean.getForecast24h().get$1().getMaxDegree()+"℃");
        conditionTv.setText(resultsBean.getObserve().getWeather());
        // 获取实时气温
        tempTv.setText(resultsBean.getObserve().getDegree()+"℃");
        // 设置显示的天气情况
        switch (resultsBean.getObserve().getWeather()){
            case "晴": dayIv.setText("☀");break;
            case "阴": dayIv.setText("☁");break;
            case "多云": dayIv.setText("⛅");break;
            case "小雨":
            case "中雨":
            case "大雨": dayIv.setText("🌧");break;
        }
        // 获取未来三天的天气情况,加载到layout当中
        WeatherBean.DataDTO.Forecast24hDTO futureList = resultsBean.getForecast24h();
        // 明天
        View itemView_2 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView_2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView_2);
        TextView dateTv_2 = itemView_2.findViewById(R.id.item_center_tv_date);
        TextView conTv_2 = itemView_2.findViewById(R.id.item_center_tv_con);
        TextView tempRangeTv_2 = itemView_2.findViewById(R.id.item_center_tv_temp);
        TextView center_Iv_2 = itemView_2.findViewById(R.id.item_center_iv);
        dateTv_2.setText(futureList.get$2().getTime()+" "+"明天");
        conTv_2.setText(futureList.get$2().getDayWeather());
        tempRangeTv_2.setText(futureList.get$2().getMinDegree()+"~"+futureList.get$2().getMaxDegree()+"℃");
        switch (futureList.get$2().getDayWeather()){
            case "晴": center_Iv_2.setText("☀");break;
            case "阴": center_Iv_2.setText("☁");break;
            case "多云": center_Iv_2.setText("⛅");break;
            case "小雨":
            case "中雨":
            case "大雨": center_Iv_2.setText("🌧");break;
        }
        // 后天
        View itemView_3 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView_3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView_3);
        TextView dateTv_3 = itemView_3.findViewById(R.id.item_center_tv_date);
        TextView conTv_3 = itemView_3.findViewById(R.id.item_center_tv_con);
        TextView tempRangeTv_3 = itemView_3.findViewById(R.id.item_center_tv_temp);
        TextView center_Iv_3 = itemView_3.findViewById(R.id.item_center_iv);
        dateTv_3.setText(futureList.get$3().getTime()+" "+"后天");
        conTv_3.setText(futureList.get$3().getDayWeather());
        tempRangeTv_3.setText(futureList.get$3().getMinDegree()+"~"+futureList.get$3().getMaxDegree()+"℃");
        switch (futureList.get$3().getDayWeather()){
            case "晴": center_Iv_3.setText("☀");break;
            case "阴": center_Iv_3.setText("☁");break;
            case "多云": center_Iv_3.setText("⛅");break;
            case "小雨":
            case "中雨":
            case "大雨": center_Iv_3.setText("🌧");break;
        }
        // 外天
        View itemView_4 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView_4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView_4);
        TextView dateTv_4 = itemView_4.findViewById(R.id.item_center_tv_date);
        TextView conTv_4 = itemView_4.findViewById(R.id.item_center_tv_con);
        TextView tempRangeTv_4 = itemView_4.findViewById(R.id.item_center_tv_temp);
        TextView center_Iv_4 = itemView_3.findViewById(R.id.item_center_iv);
        dateTv_4.setText(futureList.get$4().getTime()+" "+"外天");
        conTv_4.setText(futureList.get$4().getDayWeather());
        tempRangeTv_4.setText(futureList.get$4().getMinDegree()+"~"+futureList.get$4().getMaxDegree()+"℃");
        switch (futureList.get$4().getDayWeather()){
            case "晴": center_Iv_4.setText("☀");break;
            case "阴": center_Iv_4.setText("☁");break;
            case "多云": center_Iv_4.setText("⛅");break;
            case "小雨":
            case "中雨":
            case "大雨": center_Iv_4.setText("🌧");break;
        }
    }

    private void initView(View view){
        // 用于初始化控件操作
        tempTv = view.findViewById(R.id.frag_tv_currenttemp);
        cityTv = view.findViewById(R.id.frag_tv_city);
        conditionTv = view.findViewById(R.id.frag_tv_condition);
        windTv = view.findViewById(R.id.frag_tv_wind);
        tempRangeTv = view.findViewById(R.id.frag_tv_temprange);
        dateTv = view.findViewById(R.id.frag_tv_date);
        clothIndexTv = view.findViewById(R.id.frag_index_tv_dress);
        carIndexTV = view.findViewById(R.id.frag_index_tv_washcar);
        coldIndexTv = view.findViewById(R.id.frag_index_tv_cold);
        sportIndexTv = view.findViewById(R.id.frag_index_tv_sport);
        raysIndexTV = view.findViewById(R.id.frag_index_tv_rays);
        dayIv = view.findViewById(R.id.frag_iv_today);
        umbrellaIv = view.findViewById(R.id.frag_index_tv_umbrella);
        futureLayout = view.findViewById(R.id.frag_center_layout);
        outLayout = view.findViewById(R.id.out_layout);
        // 设置点击事件监听
        clothIndexTv.setOnClickListener(this);
        carIndexTV.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        raysIndexTV.setOnClickListener(this);
        umbrellaIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        switch (v.getId()){
            case R.id.frag_index_tv_dress:
                builder.setTitle("穿衣指数");
                WeatherBean.DataDTO.IndexDTO.ClothesDTO cloth = indexList.getClothes();
                String msg = cloth.getInfo()+"\n"+cloth.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_washcar:
                builder.setTitle("洗车指数");
                WeatherBean.DataDTO.IndexDTO.CarwashDTO car = indexList.getCarwash();
                msg = car.getInfo()+"\n"+car.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_cold:
                builder.setTitle("感冒指数");
                WeatherBean.DataDTO.IndexDTO.ColdDTO cold = indexList.getCold();
                msg = cold.getInfo()+"\n"+cold.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_sport:
                builder.setTitle("运动指数");
                WeatherBean.DataDTO.IndexDTO.SportsDTO sport = indexList.getSports();
                msg = sport.getInfo()+"\n"+sport.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_rays:
                builder.setTitle("紫外线指数");
                WeatherBean.DataDTO.IndexDTO.UltravioletDTO rays = indexList.getUltraviolet();
                msg = rays.getInfo()+"\n"+rays.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;
            case R.id.frag_index_tv_umbrella:
                builder.setTitle("雨伞指数");
                WeatherBean.DataDTO.IndexDTO.UmbrellaDTO umbrella = indexList.getUmbrella();
                msg = umbrella.getInfo()+"\n"+umbrella.getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定",null);
                break;

        }
        builder.create().show();
    }
}