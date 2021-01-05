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


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }


    @Override
    public int getCount() {
        return fragmentlist.size();
    }
}
