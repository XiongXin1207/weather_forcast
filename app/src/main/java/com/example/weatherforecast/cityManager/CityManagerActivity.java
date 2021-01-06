package com.example.weatherforecast.cityManager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.weatherforecast.R;
import com.example.weatherforecast.db.DBManager;
import com.example.weatherforecast.db.DatabaseBean;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView addIV,backIv,deleteIV;
    ListView cityLv;
    List<DatabaseBean> mDatas;
    private CityManagerAdapter adapter;

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
        //  设置适配器
        adapter = new CityManagerAdapter(this, mDatas);
        cityLv.setAdapter(adapter);
    }
    // 获取数据库中真实数据源提示适配器更新
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
            case R.id.city_iv_add:
                int cityCount = DBManager.getCityCount();
                if(cityCount < 6) {
                    Intent intent = new Intent(this, SearchCityActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(this,"存储城市数量已达到上限",Toast.LENGTH_SHORT).show();
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