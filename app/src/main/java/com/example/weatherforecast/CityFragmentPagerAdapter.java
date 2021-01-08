package com.example.weatherforecast;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class CityFragmentPagerAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragmentlist;

    public CityFragmentPagerAdapter(FragmentManager fm, List<Fragment>fragmentlist) {
        super(fm);
        this.fragmentlist = fragmentlist;
    }

    int childCount = 0;

    @Override
    public void notifyDataSetChanged() {
        this.childCount = getCount();

        super.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        if(childCount>0){
            childCount--;
            return POSITION_NONE;
        }
        return super.getItemPosition(object);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }
}
