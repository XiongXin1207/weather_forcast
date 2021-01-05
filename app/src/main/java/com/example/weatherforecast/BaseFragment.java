package com.example.weatherforecast;

import androidx.fragment.app.Fragment;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class BaseFragment extends Fragment implements Callback.CommonCallback<String> {
    public void loadData(String path){
       RequestParams params = new RequestParams(path);
        x.http().get(params,this);
    }


    //  获取数据成功，回调的接口
    @Override
    public void onSuccess(String result) {

    }
    //  获取数据失败，回调的接口
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    @Override
    public void onCancelled(CancelledException cex) {

    }

    @Override
    public void onFinished() {

    }
}
