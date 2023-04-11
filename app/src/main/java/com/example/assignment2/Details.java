package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class Details extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager , viewPagerForDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager_for_details);
        ImageView desc_img;
        desc_img = findViewById(R.id.image_view);
        viewPagerForDetails = findViewById(R.id.view_pager_for_details);

        String name_data = "a";
        String type_data = "b";

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            int id = extras.getInt("offer_img");
            desc_img.setImageResource(id);
            name_data = extras.getString("offer_name");
            type_data = extras.getString("offer_type");
            System.out.println(name_data);
            System.out.println(type_data);


        }

        else{
            desc_img.setImageResource(R.drawable.baseline_dehaze_24);
        }


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Merchant Profile");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        view_pager_adapter_for_details adapter = new view_pager_adapter_for_details(getSupportFragmentManager());
        adapter.setDescData(name_data,type_data);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        int selectedTabIndex = tabLayout.getSelectedTabPosition();
        TabLayout.Tab selectedTab = tabLayout.getTabAt(selectedTabIndex);
        CharSequence selectedTabTitle = selectedTab.getText();
        String selected_category = selectedTabTitle.toString();
        System.out.println(selected_category);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}