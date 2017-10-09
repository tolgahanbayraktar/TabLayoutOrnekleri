package com.tbdev.tablayoutornekleri.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tbdev.tablayoutornekleri.R;
import com.tbdev.tablayoutornekleri.adapters.IconTabAdapter;
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

public class IconTab extends AppCompatActivity {
    List<Fragment> fragmentList = new ArrayList<>();
    TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_icon_tab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Icon Tab Örnek");

        tabLayout = (TabLayout) findViewById(R.id.tabs);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        setData(new FragmentOne());
        setData(new FragmentTwo());
        setData(new FragmentThree());
        setData(new FragmentFour());
        setData(new FragmentFive());
        setData(new FragmentSix());



        IconTabAdapter adapter = new IconTabAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

        /****TABLAYOUT*/
        tabLayout.setupWithViewPager(viewPager);
        setTabIcons();
    }

    private void setTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.facebook);
        tabLayout.getTabAt(1).setIcon(R.drawable.googleplus);
        tabLayout.getTabAt(2).setIcon(R.drawable.instagram);
        tabLayout.getTabAt(3).setIcon(R.drawable.linkedin);
        tabLayout.getTabAt(4).setIcon(R.drawable.whatsapp);
        tabLayout.getTabAt(5).setIcon(R.drawable.twitter);
    }

    public void setData(Fragment yeniSayfaFragment) {
        fragmentList.add(yeniSayfaFragment);
    }
}
