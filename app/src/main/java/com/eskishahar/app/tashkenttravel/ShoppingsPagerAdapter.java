package com.eskishahar.app.tashkenttravel;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class ShoppingsPagerAdapter extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private ShoppingsAdapter mFragmentAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        LinearLayout linearLayout = findViewById(R.id.linear_view_pager);
        linearLayout.setBackgroundColor(Color.parseColor("#BDFAC3"));

        mFragmentAdapter = new ShoppingsAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mFragmentAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private class ShoppingsAdapter extends FragmentPagerAdapter {
        public ShoppingsAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ShoppingsFragmentOne();

                case 1:
                    return new ShoppingsFragmentTwo();

                case 2:
                    return new ShoppingsFragmentThree();

                case 3:
                    return new ShoppingsFragmentFour();

                case 4:
                    return new ShoppingsFragmentFive();

                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.tab_title_samarkand_darvoza);

                case 1:
                    return getString(R.string.tab_title_chorsu_bazaar);

                case 2:
                    return getString(R.string.tab_title_Yangiobod_market);

                case 3:
                    return getString(R.string.tab_title_next);

                case 4:
                    return getString(R.string.tab_title_megaplanet);

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}