package practice.manu.scrollabletabviews.Adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import practice.manu.scrollabletabviews.Fragments.BooksFragment;
import practice.manu.scrollabletabviews.Fragments.BusinessFragment;
import practice.manu.scrollabletabviews.Fragments.DesignFragment;
import practice.manu.scrollabletabviews.Fragments.FashionFragment;
import practice.manu.scrollabletabviews.Fragments.MoviesFragment;
import practice.manu.scrollabletabviews.Fragments.PoliticsFragment;
import practice.manu.scrollabletabviews.Fragments.ScienceFragment;
import practice.manu.scrollabletabviews.Fragments.SportsFragment;
import practice.manu.scrollabletabviews.Fragments.TechnologiesFragment;
import practice.manu.scrollabletabviews.MainActivity;

/**
 * Created by manojmuralidharan on 21/01/18.
 */

public class TabsViewPagerAdapter extends FragmentPagerAdapter {

    Fragment fragment = null;
    private int tabCount;

    public TabsViewPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.tabCount = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                fragment = new SportsFragment();
                break;
            case 1:
                fragment = new TechnologiesFragment();
                break;
            case 2:
                fragment = new DesignFragment();
                break;
            case 3:
                fragment = new PoliticsFragment();
                break;
            case 4:
                fragment = new MoviesFragment();
                break;
            case 5:
                fragment = new BooksFragment();
                break;
            case 6:
                fragment = new ScienceFragment();
                break;
            case 7:
                fragment = new FashionFragment();
                break;
            case 8:
                fragment = new BusinessFragment();
                break;
            default:
                fragment = new SportsFragment();
                break;
        }

        return fragment;

    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return MainActivity.tabTitles[position];
    }

}
