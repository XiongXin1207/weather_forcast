package com.example.weatherforecast.cityManager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.weatherforecast.CityWeatherFragment;
import com.example.weatherforecast.R;
import com.example.weatherforecast.bean.WeatherBean;
import com.example.weatherforecast.db.DatabaseBean;
import com.google.gson.Gson;

import java.text.ParseException;
import java.util.List;

public class CityManagerAdapter extends BaseAdapter {
    Context context;
    List<DatabaseBean> mDatas;

    public CityManagerAdapter(Context context, List<DatabaseBean> mDatas) {
        this.context = context;
        this.mDatas = mDatas;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_city_manager,null);
            holder = new ViewHolder(convertView);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        DatabaseBean bean = mDatas.get(position);
        holder.cityTv.setText(bean.getCity());
        WeatherBean weatherBean = new Gson().fromJson(bean.getContent(), WeatherBean.class);
        holder.conTV.setText("天气："+weatherBean.getData().getObserve().getWeather());
        try {
            holder.updateTimeTv.setText("更新时间："+ CityWeatherFragment.changeTime(weatherBean.getData().getObserve().getUpdate_time()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        holder.currentTempTv.setText(weatherBean.getData().getObserve().getDegree()+"℃");
        holder.humidityTv.setText("湿度："+weatherBean.getData().getObserve().getHumidity()+"%");
        return convertView;
    }

    class ViewHolder{
        TextView cityTv,conTV,currentTempTv,humidityTv,updateTimeTv;
        public ViewHolder(View itemView){
            cityTv = itemView.findViewById(R.id.item_city_tv_city);
            conTV = itemView.findViewById(R.id.item_city_tv_condition);
            currentTempTv = itemView.findViewById(R.id.item_city_tv_temp);
            humidityTv = itemView.findViewById(R.id.item_city_humidity);
            updateTimeTv = itemView.findViewById(R.id.item_city_update);
        }
    }
}
