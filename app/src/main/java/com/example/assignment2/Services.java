package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Services extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        bottomNavigationView = findViewById(R.id.bottom_view);
        bottomNavigationView.setSelectedItemId(R.id.services);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Services");

        toolbar.setNavigationIcon(R.drawable.baseline_dehaze_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Services.this, "Menu", Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.points:

                        startActivity(new Intent(getApplicationContext(),points.class));

                        return true;

                    case R.id.services:

                        return true;
                    case R.id.discounts:

                        startActivity(new Intent(getApplicationContext(),MainActivity.class));

                        return true;
                    case R.id.history:

                        startActivity(new Intent(getApplicationContext(),History.class));

                        return true;
                }
                return false;
            }
        });

    }
}