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


public class MuseumZooPagerAdapter extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    private MuseumsZooAdapter mFragmentAdapter;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);
        LinearLayout linearLayout = findViewById(R.id.linear_view_pager);
        linearLayout.setBackgroundColor(Color.parseColor("#DCFADF"));

        // Get the ViewPager and apply the PagerAdapter
        mFragmentAdapter = new MuseumsZooAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mViewPager.setAdapter(mFragmentAdapter);

        // link the tabLayout and the viewpager together
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private class MuseumsZooAdapter extends FragmentPagerAdapter {
        public MuseumsZooAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new MuseumsZooFragmentOne();

                case 1:
                    return new MuseumsZooFragmentTwo();

                case 2:
                    return new MuseumsZooFragmentThree();

                case 3:
                    return new MuseumsZooFragmentFour();

                case 4:
                    return new MuseumsZooFragmentFive();

                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                   return getString(R.string.tab_title_museum_nature);

                case 1:
                    return getString(R.string.tab_title_tashkent_zoo);

                case 2:
                    return getString(R.string.tab_title_victory_park);

                case 3:
                    return getString(R.string.tab_title_amir_temur_museum);

                case 4:
                    return getString(R.string.tab_title_railway_museum);

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