package com.example.assignment2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class points extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        BottomNavigationView bottomNavigationView;

        bottomNavigationView = findViewById(R.id.bottom_view);
        bottomNavigationView.setSelectedItemId(R.id.points);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Points");

        toolbar.setNavigationIcon(R.drawable.baseline_dehaze_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(points.this, "Menu", Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.points:
                        return true;

                    case R.id.services:
                        startActivity(new Intent(getApplicationContext(),Services.class));

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