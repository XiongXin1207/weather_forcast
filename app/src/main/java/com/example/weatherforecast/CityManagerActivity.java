package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.weatherforecast.db.DatabaseBean;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView addIV,backIv,deleteIV;
    ListView cityLv;
    List<DatabaseBean> mDatas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);
        addIV = findViewById(R.id.city_iv_add);
        backIv = findViewById(R.id.city_iv_back);
        deleteIV = findViewById(R.id.city_iv_delete);
        cityLv =  findViewById(R.id.city_lv);
        mDatas = new ArrayList<>();
        //添加监听事件
        addIV.setOnClickListener(this);
        deleteIV.setOnClickListener(this);
        backIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.city_iv_add:
                Intent intent = new Intent(this,SearchCityActivity.class);
                
                break;
            case R.id.city_iv_back:
                finish();
                break;
            case R.id.city_iv_delete:
                break;
        }
    }
}