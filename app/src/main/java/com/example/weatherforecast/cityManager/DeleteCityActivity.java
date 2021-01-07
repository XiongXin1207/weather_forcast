package com.example.weatherforecast.cityManager;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.weatherforecast.R;
import com.example.weatherforecast.db.DBManager;

import java.util.ArrayList;
import java.util.List;

public class DeleteCityActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView errorIv,rightIv;
    ListView deleteLv;
    List<String> mDatas;
    List<String> deleteCities;
    private DeleteCityAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_city);
        errorIv = findViewById(R.id.delete_iv_back);
        rightIv = findViewById(R.id.delete_iv_right);
        deleteLv = findViewById(R.id.delete_lv);
        mDatas = DBManager.queryAllCityName();
        //设置监听事件
        errorIv.setOnClickListener(this);
        rightIv.setOnClickListener(this);
        adapter = new DeleteCityAdapter(this,mDatas,deleteCities);
        deleteLv.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        List<String> cityList = DBManager.queryAllCityName();
//        mDatas.addAll(cityList);
//        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.delete_iv_back:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("提示信息").setMessage("确定要更改吗?").setPositiveButton("舍弃更改", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("取消",null);
                builder.create().show();
                break;
            case R.id.delete_iv_right:
                for (int i = 0;i<deleteCities.size();i++){
                    String city = deleteCities.get(i);
                    // 调用删除城市的函数
                    DBManager.deleteInfoByCity(city);
                }
                finish();
                break;
        }
    }
}