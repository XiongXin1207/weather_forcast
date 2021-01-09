package com.example.weather_forcast.city_manager;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.weather_forcast.R;
import com.example.weather_forcast.bean.WeatherBean;
import com.example.weather_forcast.db.DatabaseBean;
import com.google.gson.Gson;

import java.util.List;

public class CityManagerAdapter extends BaseAdapter {
    Context context;
    List<DatabaseBean> mDatas;

    public CityManagerAdapter(Context context, List<DatabaseBean> mDatas){
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
        // 有无复用
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_city_manager, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder) convertView.getTag();
        }
        DatabaseBean bean = mDatas.get(position);
        holder.cityTv.setText(bean.getCity());
        WeatherBean weatherBean = new Gson().fromJson(bean.getContent(), WeatherBean.class);
        // 获取今日天气情况
        holder.conTv.setText(weatherBean.getData().getObserve().getWeather());
        holder.currentTempTv.setText(weatherBean.getData().getObserve().getDegree()+"℃");
        holder.windTv.setText(weatherBean.getData().getForecast24h().get$1().getDayWindDirection()+weatherBean.getData().getForecast24h().get$1().getDayWindPower()+"级");
        holder.tempRangeTv.setText(weatherBean.getData().getForecast24h().get$1().getMinDegree()+"~"+weatherBean.getData().getForecast24h().get$1().getMaxDegree()+"℃");
        return convertView;
    }

    class ViewHolder{
        TextView cityTv, conTv, currentTempTv, windTv, tempRangeTv;
        public ViewHolder(View itemView){
            cityTv = itemView.findViewById(R.id.item_city_tv_city);
            conTv = itemView.findViewById(R.id.item_city_tv_condition);
            currentTempTv = itemView.findViewById(R.id.item_city_tv_temp);
            windTv = itemView.findViewById(R.id.item_city_wind);
            tempRangeTv = itemView.findViewById(R.id.item_city_temprange);
        }
    }
}
