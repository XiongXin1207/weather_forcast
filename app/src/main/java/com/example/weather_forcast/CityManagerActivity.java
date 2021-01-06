package com.example.weather_forcast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class CityManagerActivity extends AppCompatActivity {
    ImageView addIv, backIv, deleteIv;
    ListView cityIv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);
    }
}