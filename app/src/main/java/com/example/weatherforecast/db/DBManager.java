package com.example.weatherforecast.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static SQLiteDatabase database;
    public static void initDB(Context context){
        DBHelper dbHelper = new DBHelper(context);
        database = dbHelper.getWritableDatabase();
    }
    public static List<String>queryAllCityName(){
        Cursor cursor = database.query("info",null,null,null,null,null,null);
        List<String>cityList = new ArrayList<>();
        while(cursor.moveToNext()){
            String city = cursor.getString(cursor.getColumnIndex("city"));
            cityList.add(city);
        }
        return cityList;
    }
//    根据城市名称替换信息内容
    public static int updateInfoByCity(String city, String content){
        ContentValues values = new ContentValues();
        values.put("content",content);
        return database.update("info", values, city="?",new String[]{city});
    }
    public static long addCityInfo(String city, String content){
        ContentValues values = new ContentValues();
        values.put("city",city);
        values.put("content",content);
        return database.insert("info",null,values);
    }
    public static String queryInfoByCity(String city){
        Cursor cursor = database.query("info", null, "city=?", new String[]{city}, null, null, null);
        if (cursor.getCount()>0){
            cursor.moveToFirst();
            String content = cursor.getString(cursor.getColumnIndex("content"));
            return content;
        }
        return null;
    }
}
