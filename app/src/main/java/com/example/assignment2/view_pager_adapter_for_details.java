package com.example.assignment2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class view_pager_adapter_for_details extends FragmentPagerAdapter {
    private String descriptionData;
    private String termsData;
    private String branchesData;

    private String name ,type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public view_pager_adapter_for_details(@NonNull FragmentManager fm) {
        super(fm);
    }

    private final List<Fragment> fragments = new ArrayList<>();
    private final List<String> fragmentTitles = new ArrayList<>();


    public void setData(String descriptionData, String termsData, String branchesData) {
        this.descriptionData = descriptionData;
        this.termsData = termsData;
        this.branchesData = branchesData;
    }

   // public void setDescData(String descriptionData ) {
     //   this.descriptionData = descriptionData;
    //}

    public void setDescData(String name , String type ) {
        this.name = name;
        this.type = type;
    }


    public String getDescData() {
        return descriptionData ;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            description desc = new description();
            desc.recvData(getDescData());
            desc.setNamee(getName());
            desc.setTypee(getType());
            desc.setCategory("Category1");
            return desc;
        }
        else if(position == 1){
            return new terms();
        }
        else if (position == 2){
            return new branches();
        }
        else {
            return new description();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    //public void addFragment(Fragment fragment, String title) {
      //  fragments.add(fragment);
        //fragmentTitles.add(title);
    //}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Description";
        }
        else if (position == 1) {
            return "Terms";
        }

        else{
            return "Branches";
        }
    }
}
