package com.example.weather_forcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.weather_forcast.db.DBManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView addCityIv,moreIv;
    LinearLayout pointLayout;
    ViewPager mainVp;
    // 写上ViewPager的数据源
    List<Fragment>fragmentList;
    // 表示需要显示的城市的集合
    List<String>cityList;
    // 表示ViewPager的页数指数器显示集合
    List<ImageView>imgList;
    private CityFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addCityIv = findViewById(R.id.main_iv_add);
        moreIv = findViewById(R.id.main_iv_more);
        pointLayout = findViewById(R.id.main_layout_point);
        mainVp = findViewById(R.id.main_vp);
        // 添加点击事件
        addCityIv.setOnClickListener(this);
        moreIv.setOnClickListener(this);
        fragmentList = new ArrayList<>();
        cityList = DBManager.queryAllCityName();    // 获取数据库包含的城市信息列表
        imgList = new ArrayList<>();

        if(cityList.size()==0){
            cityList.add("北京");
        }
        // 初始化ViewPager页面的方法
        initPager();
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), fragmentList);
        mainVp.setAdapter(adapter);
        // 创建小圆点指示器
        initPoint();
        // 设置最后一个城市信息
        mainVp.setCurrentItem(fragmentList.size()-1);
        // 设置ViewPager页面监听
        setPagerListener();

    }

    private void setPagerListener() {
        // 设置监听事件
        mainVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                for(int i = 0; i < imgList.size(); i++){
                    imgList.get(i).setImageResource(R.mipmap.a2);
                }
                imgList.get(position).setImageResource(R.mipmap.a1);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void initPoint() {
        //创建小圆点 ViewPager页面指示器的函数
        for(int i = 0; i <fragmentList.size(); i++){
            ImageView pIv = new ImageView(this);
            pIv.setImageResource(R.mipmap.a1);
            pIv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) pIv.getLayoutParams();
            lp.setMargins(0, 0, 20, 0);
            imgList.add(pIv);
            pointLayout.addView(pIv);
        }
        imgList.get(imgList.size()-1).setImageResource(R.mipmap.a2);
    }

    private void initPager() {
        // 创建Fragment对象，添加到ViewPager数据源当中
        for(int i = 0; i < cityList.size(); i++){
            CityWeatherFragment cwFrag = new CityWeatherFragment();
            Bundle bundle = new Bundle();
            bundle.putString("city", cityList.get(i));
            cwFrag.setArguments(bundle);
            fragmentList.add(cwFrag);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.main_iv_add:
                intent.setClass(this,CityManagerActivity.class);
                break;
            case R.id.main_iv_more:

                break;
        }
        startActivity(intent);
    }
}