package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.view);

        view_pager_adapter adapter = new view_pager_adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Discounts");
        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.baseline_dehaze_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Menu", Toast.LENGTH_SHORT).show();
            }
        });


        bottomNavigationView = findViewById(R.id.bottom_view);
        bottomNavigationView.setSelectedItemId(R.id.discounts);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.points:
                        startActivity(new Intent(getApplicationContext(),points.class));
                        return true;

                    case R.id.services:

                        startActivity(new Intent(getApplicationContext(),Services.class));
                        return true;
                    case R.id.discounts:
                        getSupportActionBar().setTitle("Discounts");
                        return true;
                    case R.id.history:
                        getSupportActionBar().setTitle("History");
                        startActivity(new Intent(getApplicationContext(),History.class));
                        return true;
                }
                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appbar,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.opt1){
            Toast.makeText(this, "Option 1", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.opt2){
            Toast.makeText(this, "Option 2", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.opt3){
            Toast.makeText(this, "Option 3", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.notify){
            Toast.makeText(this, "Notifications", Toast.LENGTH_SHORT).show();
        }
        return true;
    }



}