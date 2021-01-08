package com.example.weather_forcast.city_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.weather_forcast.R;
import com.example.weather_forcast.db.DBManager;
import com.example.weather_forcast.db.DatabaseBean;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView addIv, backIv, deleteIv;
    FloatingActionButton addButton;
    ListView cityIv;
    List<DatabaseBean> mDatas; //显示列表数据源
    private CityManagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);
//        addIv = findViewById(R.id.city_iv_add);
        addButton = findViewById(R.id.city_fb_add);
        backIv = findViewById(R.id.city_iv_back);
        deleteIv = findViewById(R.id.city_iv_delete);
        cityIv = findViewById(R.id.city_lv);
        mDatas = new ArrayList<>();
        // 添加点击监听事件
//        addIv.setOnClickListener(this);
        addButton.setOnClickListener(this);
        deleteIv.setOnClickListener(this);
        backIv.setOnClickListener(this);
        // 设置适配器
        adapter = new CityManagerAdapter(this, mDatas);
        cityIv.setAdapter(adapter);
    }
    // 获取数据库当中真实数据源，添加到原有数据源当中，提示适配器更新
    @Override
    protected void onResume() {
        super.onResume();
        List<DatabaseBean> list = DBManager.queryAllInfo();
        mDatas.clear();
        mDatas.addAll(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.city_fb_add:
                int cityCount = DBManager.getCityCount();
                if(cityCount<5){
                    Intent intent = new Intent(this, SearchCityActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(this,"存储城市数量已达上限，请删除后再增加",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.city_iv_back:
                finish();
                break;
            case R.id.city_iv_delete:
                Intent intent1 = new Intent(this, DeleteCityActivity.class);
                startActivity(intent1);
                break;
        }
    }
}