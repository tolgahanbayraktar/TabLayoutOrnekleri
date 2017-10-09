package com.tbdev.tablayoutornekleri.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

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

public class CustomTab extends AppCompatActivity {


    List<Fragment> fragmentList = new ArrayList<>();
    List<String> tabBaslikListesi = new ArrayList<>();
    TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_custom_tab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Custom View Tab Örnek");

        tabLayout = (TabLayout) findViewById(R.id.tabs);

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

        setCustomViewForTab(0,"Örnek1","tab1");
        setCustomViewForTab(1,"Örnek2","tab2");
        setCustomViewForTab(2,"Örnek3","tab3");
        setCustomViewForTab(3,"Örnek4","tab4");
        setCustomViewForTab(4,"Örnek5","tab5");
        setCustomViewForTab(5,"Örnek6","tab6");
    }

    private void setCustomViewForTab(int position, String baslik, String altBaslik) {
        View customTabView = LayoutInflater.from(this).inflate(R.layout.tab_item, null);
        TextView tvBaslik = customTabView.findViewById(R.id.tabTextTitle);
        TextView ttvSubTitle = customTabView.findViewById(R.id.tabTextSubTitle);

        tvBaslik.setText(baslik);
        ttvSubTitle.setText(altBaslik);

        tabLayout.getTabAt(position).setCustomView(customTabView);
    }

    public void setData(Fragment yeniSayfaFragment, String baslik) {
        fragmentList.add(yeniSayfaFragment);
        tabBaslikListesi.add(baslik);
    }


}
