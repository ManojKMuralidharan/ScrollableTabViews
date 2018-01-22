package practice.manu.scrollabletabviews;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import practice.manu.scrollabletabviews.Adapters.TabsViewPagerAdapter;

/**
 * Created by manojmuralidharan on 21/01/18.
 */

public class MainActivity extends FragmentActivity {

    ViewPager mViewPager;
    TabLayout mTabLayout;

    public static String[] tabTitles = new String[]{"Sports", "Technologies", "Design", "Politics",
            "Movies", "Books", "Science", "Fashion", "Business"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tab_layout);
        mTabLayout.bringToFront();
        mViewPager = findViewById(R.id.tabs_view_pager);

        for (int i = 0; i < tabTitles.length; i++) {
            TabLayout.Tab tabNames = mTabLayout.newTab();
            mTabLayout.addTab(tabNames.setText(tabTitles[i]));
        }

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                mViewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mTabLayout.setupWithViewPager(mViewPager);

        mViewPager.setAdapter(new TabsViewPagerAdapter(getSupportFragmentManager(),
                mTabLayout.getTabCount()));

    }

}
