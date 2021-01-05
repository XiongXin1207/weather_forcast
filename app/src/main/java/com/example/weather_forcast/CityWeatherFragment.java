package com.example.weather_forcast;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.weather_forcast.bean.WeatherBean;
import com.google.gson.Gson;


public class CityWeatherFragment extends com.example.weather_forcast.BaseFragment implements View.OnClickListener{
    TextView tempTv, cityTv, conditionTv, windTv, tempRangeTv, dateTv,
            clothIndexTv, carIndexTV, coldIndexTv, sportIndexTv, raysIndexTV, dayIv;
    LinearLayout futureLayout;
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    String url2 = "&city=";;
    private WeatherBean.DataDTO.IndexDTO indexList;
    String province;
    String city;
    Bundle bundle = getArguments();
    String province_city = bundle.getString("city");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_city_weather, container, false);
        initView(view);
        // 可以通过activity传值获取当前fragment加载的是哪个地方的天气情况
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
    }
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
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
        windTv.setText(resultsBean.getObserve().getWindDirection());
        tempRangeTv.setText(resultsBean.getForecast24h().get$1().getMinDegree()+"~"+resultsBean.getForecast24h().get$1().getMaxDegree());
        conditionTv.setText(resultsBean.getObserve().getWeather());
        // 获取实时气温
        tempTv.setText(resultsBean.getObserve().getDegree()+"℃");
        // 设置显示的天气情况
        switch (resultsBean.getObserve().getWeather()){
            case "晴": dayIv.setText("☀");break;
            case "阴": dayIv.setText("☁");break;
            case "多云": dayIv.setText("⛅");break;
        }
        // 获取未来三天的天气情况,加载到layout当中
        WeatherBean.DataDTO.Forecast24hDTO futureList = resultsBean.getForecast24h();
        View itemView_2 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView_2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView_2);
        TextView dateTv_2 = itemView_2.findViewById(R.id.item_center_tv_date);
        TextView conTv_2 = itemView_2.findViewById(R.id.item_center_tv_con);
        TextView tempRangeTv_2 = itemView_2.findViewById(R.id.item_center_tv_temp);
        dateTv_2.setText(futureList.get$2().getTime()+"明天");
        conTv_2.setText(futureList.get$2().getDayWeather());
        tempRangeTv_2.setText(futureList.get$2().getMinDegree()+"~"+futureList.get$2().getMaxDegree()+"℃");

        View itemView_3 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView_3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView_3);
        TextView dateTv_3 = itemView_3.findViewById(R.id.item_center_tv_date);
        TextView conTv_3 = itemView_3.findViewById(R.id.item_center_tv_con);
        TextView tempRangeTv_3 = itemView_3.findViewById(R.id.item_center_tv_temp);
        dateTv_3.setText(futureList.get$3().getTime()+"后天");
        conTv_3.setText(futureList.get$3().getDayWeather());
        tempRangeTv_3.setText(futureList.get$3().getMinDegree()+"~"+futureList.get$3().getMaxDegree()+"℃");

        View itemView_4 = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
        itemView_4.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        futureLayout.addView(itemView_4);
        TextView dateTv_4 = itemView_4.findViewById(R.id.item_center_tv_date);
        TextView conTv_4 = itemView_4.findViewById(R.id.item_center_tv_con);
        TextView tempRangeTv_4 = itemView_4.findViewById(R.id.item_center_tv_temp);
        dateTv_4.setText(futureList.get$4().getTime()+"外天");
        conTv_4.setText(futureList.get$4().getDayWeather());
        tempRangeTv_4.setText(futureList.get$4().getMinDegree()+"~"+futureList.get$4().getMaxDegree()+"℃");


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
        futureLayout = view.findViewById(R.id.frag_center_layout);
        // 设置点击事件监听
        clothIndexTv.setOnClickListener(this);
        carIndexTV.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        raysIndexTV.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.frag_index_tv_dress:

                break;
            case R.id.frag_index_tv_washcar:

                break;
            case R.id.frag_index_tv_cold:

                break;
            case R.id.frag_index_tv_sport:

                break;
            case R.id.frag_index_tv_rays:

                break;
        }
    }
}