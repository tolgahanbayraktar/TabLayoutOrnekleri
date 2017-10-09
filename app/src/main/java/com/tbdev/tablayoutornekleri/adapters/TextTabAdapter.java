package com.tbdev.tablayoutornekleri.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by developer on 9.10.2017.
 */

public class TextTabAdapter extends FragmentStatePagerAdapter {

    List<Fragment> fragmentList;
    List<String> tabBaslikListesi;

    public TextTabAdapter(FragmentManager fm, List<Fragment> fragList, List<String> baslikList) {
        super(fm);

        this.fragmentList = fragList;
        this.tabBaslikListesi = baslikList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabBaslikListesi.get(position);
    }
}
