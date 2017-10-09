package com.tbdev.tablayoutornekleri.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tbdev.tablayoutornekleri.R;
import com.tbdev.tablayoutornekleri.adapters.TextTabAdapter;
import com.tbdev.tablayoutornekleri.fragments.FragmentFive;
import com.tbdev.tablayoutornekleri.fragments.FragmentFour;
import com.tbdev.tablayoutornekleri.fragments.FragmentOne;
import com.tbdev.tablayoutornekleri.fragments.FragmentSix;
import com.tbdev.tablayoutornekleri.fragments.FragmentThree;
import com.tbdev.tablayoutornekleri.fragments.FragmentTwo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by developer on 9.10.2017.
 */

public class TextTab extends AppCompatActivity {


    List<Fragment> fragmentList = new ArrayList<>();
    List<String> tabBaslikListesi = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_text_tab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Text Tab Örnek");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        setData(new FragmentOne(), "Tab1");
        setData(new FragmentTwo(), "Tab2");
        setData(new FragmentThree(), "Tab3");
        setData(new FragmentFour(), "Tab4");
        setData(new FragmentFive(), "Tab5");
        setData(new FragmentSix(), "Tab6");

        TextTabAdapter adapter = new TextTabAdapter(getSupportFragmentManager(), fragmentList, tabBaslikListesi);
        viewPager.setAdapter(adapter);

        /****TABLAYOUT*/
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setData(Fragment yeniSayfaFragment, String baslik) {
        fragmentList.add(yeniSayfaFragment);
        tabBaslikListesi.add(baslik);
    }
}
