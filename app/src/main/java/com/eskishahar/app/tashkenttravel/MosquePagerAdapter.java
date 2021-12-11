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



public class MosquePagerAdapter extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private MosqueAdapter mFragmentAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        LinearLayout linearLayout = findViewById(R.id.linear_view_pager);
      linearLayout.setBackgroundColor(Color.parseColor("#7EEC89"));

        mFragmentAdapter = new MosqueAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mFragmentAdapter);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private class MosqueAdapter extends FragmentPagerAdapter {
        public MosqueAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new MosqueFragmentOne();

                case 1:
                    return new MosqueFragmentTwo();

                case 2:
                    return new MosqueFragmentThree();

                case 3:
                    return new MosqueFragmentFour();

                case 4:
                    return new MosqueFragmentFive();

                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return getString(R.string.tab_title_khazrati_imam);

                case 1:
                    return getString(R.string.tab_title_sheikh_zayniddin);

                case 2:
                    return getString(R.string.tab_title_minor);
                case 3:
                    return getString(R.string.tab_title_islam_ota);

                case 4:
                    return getString(R.string.tab_title_muhammad_sadyk);

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