package com.example.weatherforecast;

import android.app.Application;


import com.example.weatherforecast.db.DBManager;

import org.xutils.DbManager;
import org.xutils.x;

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DBManager.initDB(this);
    }
}
