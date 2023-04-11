package com.example.assignment2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class personalAdapter extends FragmentPagerAdapter {
    private List<Fragment> mTabFragmentList;
    private List<Fragment> mNavFragmentList;

    public personalAdapter(FragmentManager fm, List<Fragment> tabFragmentList, List<Fragment> navFragmentList) {
        super(fm);
        mTabFragmentList = tabFragmentList;
        mNavFragmentList = navFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        if (position < mTabFragmentList.size()) {
            return mTabFragmentList.get(position);
        } else {
            return mNavFragmentList.get(position - mTabFragmentList.size());
        }
    }

    @Override
    public int getCount() {
        return mTabFragmentList.size() + mNavFragmentList.size();
    }
}
