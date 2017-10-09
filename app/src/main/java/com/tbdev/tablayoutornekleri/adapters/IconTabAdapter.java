package com.tbdev.tablayoutornekleri.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by developer on 9.10.2017.
 */

public class IconTabAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragmentList;

    public IconTabAdapter(FragmentManager fm, List<Fragment> fragList) {
        super(fm);

        this.fragmentList = fragList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

}
