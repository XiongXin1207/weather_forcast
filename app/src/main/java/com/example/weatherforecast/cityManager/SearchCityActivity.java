package com.example.weatherforecast.cityManager;

import androidx.appcompat.app.AppCompatActivity;

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

import com.example.weatherforecast.Base.BaseActivity;
import com.example.weatherforecast.MainActivity;
import com.example.weatherforecast.R;
import com.example.weatherforecast.bean.WeatherBean;
import com.google.gson.Gson;

public class SearchCityActivity extends BaseActivity implements View.OnClickListener {
    EditText searchEt;
    ImageView submitIv;
    GridView searchGv;
    String []hotCities = {"北京","上海","广州","深圳","南京","苏州","南昌","杭州","厦门","三亚","成都","西安","武汉"};
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    String url2 = "&city=";
    String city;
    String province;
    private ArrayAdapter<Object> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        searchEt  = findViewById(R.id.search_et);
        submitIv = findViewById(R.id.search_iv_submit);
        searchGv = findViewById(R.id.search_gv);
        adapter = new ArrayAdapter<>(this, R.layout.item_hotcity,hotCities);
        searchGv.setAdapter(adapter);
        setListener();
    }

    private void setListener() {
        searchGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                city = hotCities[position];
                province = getProvince(city);
                String url = url1+ province + url2 + city;
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
                    //判断是否能找到这个城市
                    province = getProvince(city);
                    String url = url1 + province + url2 + city;
                    loadData(url);
                }
                else{
                    Toast.makeText(this, "输入内容不能为空！", Toast.LENGTH_SHORT).show();
                }
        }
    }

    @Override
    public void onSuccess(String result) {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        if(weatherBean.getData().getAir()!=null){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
            city = province + " " + city;
            intent.putExtra("city",city);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"暂时未收录该城市天气信息!",Toast.LENGTH_SHORT).show();
        }
    }

    private String getProvince(String city) {
        String []cityOfProvinces = {"北京","上海","广州 广东","深圳 广东","南京 江苏",
                "苏州 江苏","南昌 江西","杭州 浙江","厦门 福建","三亚 海南","成都 四川","西安 陕西","武汉 湖北"};
        for(int i = 0; i < cityOfProvinces.length; i++){
            if(cityOfProvinces[i].contains(city)) {
                if (cityOfProvinces[i].split(" ").length > 1) {
                    return cityOfProvinces[i].split(" ")[1];
                }
                else
                    return city;
            }
        }
        return null;
    }
}