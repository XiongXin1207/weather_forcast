package com.example.weather_forcast.city_manager;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.weather_forcast.MainActivity;
import com.example.weather_forcast.R;
import com.example.weather_forcast.base.BaseActivity;
import com.example.weather_forcast.bean.WeatherBean;
import com.google.gson.Gson;

public class SearchCityActivity extends BaseActivity implements View.OnClickListener{
    EditText searchEt;
    ImageView submitIv;
    GridView searchGv;
    String[]hotCities = {"北京","上海","广州","深圳","珠海","佛山","南京","苏州","厦门",
            "长沙","成都","福州","杭州","武汉","青岛","西安","太原","沈阳","重庆","天津","南宁"};
    private ArrayAdapter<String> adapter;
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    String url2 = "&city=";
    String city;
    String province;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        searchEt = findViewById(R.id.search_et);
        submitIv = findViewById(R.id.search_iv_submit);
        searchGv = findViewById(R.id.search_gv);
        submitIv.setOnClickListener(this);
        // 设置适配器
        adapter = new ArrayAdapter<>(this, R.layout.item_hotcity, hotCities);
        searchGv.setAdapter(adapter);
        setListener();
    }
    //设置监听事件
    private void setListener() {
        searchGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                city = hotCities[position];
                province = getProvince(city);
                String url = url1+province+url2+city;
                loadData(url);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.search_iv_submit:
                city = searchEt.getText().toString();
                if(!TextUtils.isEmpty(city)){
                    // 判断是否能找到这个城市
                    province = getProvince(city);
                    String url = url1 + province + url2 + city;
                    loadData(url);
                }
                else {
                    Toast.makeText(this,"输入内容不能为空!", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onSuccess(String result) {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        if(weatherBean.getData().getIndex().getClothes()!=null){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            city = province + " " + city;
            intent.putExtra("city", city);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"暂时未收入此城市天气信息",Toast.LENGTH_SHORT).show();
        }
    }

    private String getProvince(String city) {
        String[]Cities = {"北京","上海","广东 广州","广东 深圳","广东 珠海","广东 佛山",
                "江苏 南京","江苏 苏州","福建 厦门","湖南 长沙","四川 成都","福建 福州","浙江 杭州",
                "湖北 武汉","山东 青岛","陕西 西安","山西 太原","辽宁 沈阳","重庆","天津","广西 南宁"};
        for(int i=0;i<Cities.length;i++){
            if(Cities[i].contains(city)){
                if(Cities[i].split(" ").length>1)
                {   province =Cities[i].split(" ")[0];
                }
                else
                {
                    province = Cities[i].split(" ")[0];
                }
                return province;
            }
        }
        return null;
    }
}