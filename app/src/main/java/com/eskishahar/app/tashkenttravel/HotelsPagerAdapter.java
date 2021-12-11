package com.eskishahar.app.tashkenttravel;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;


public class HotelsPagerAdapter extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private HotelsAdapter mFragmentAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        LinearLayout linearLayout = findViewById(R.id.linear_view_pager);
        linearLayout.setBackgroundColor(Color.parseColor("#A0FDAA"));

        mFragmentAdapter = new HotelsAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mFragmentAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private class HotelsAdapter extends FragmentPagerAdapter {
        public HotelsAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new HotelsFragmentOne();

                case 1:
                    return new HotelsFragmentTwo();

                case 2:
                    return new HotelsFragmentThree();

                case 3:
                    return new HotelsFragmentFour();

                case 4:
                    return new HotelsFragmentFive();

                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.tab_title_hyatt_regency);

                case 1:
                    return getString(R.string.tab_title_hilton);

                case 2:
                    return getString(R.string.tab_title_ichan_qala);
                case 3:
                    return getString(R.string.tab_title_wyndham);

                case 4:
                    return getString(R.string.tab_title_city_palace);

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