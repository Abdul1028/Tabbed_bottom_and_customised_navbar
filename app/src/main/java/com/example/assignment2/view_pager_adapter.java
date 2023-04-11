package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class view_pager_adapter extends FragmentPagerAdapter {
    public view_pager_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new Afragment();
        }
        else if(position == 1){
            return new Bfragment();
        }
        else if (position == 2){
            return new Cfragment();
        }
        else {
            return new Afragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Accessory";
        }
        else if (position == 1) {
            return "Fragrance";
        }

        else{
            return "Inners";
        }
    }
}
