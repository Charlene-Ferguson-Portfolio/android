package com.example.android.touristapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Created by charlene on 10/08/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_museums);
        } else if (position == 1) {
            return mContext.getString(R.string.category_theatres);
        } else if (position == 2) {
            return mContext.getString(R.string.category_attractions);
        } else {
            return mContext.getString(R.string.category_parks);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new TheatresFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new ParksFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


}
