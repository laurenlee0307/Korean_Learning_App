package com.example.android.koreanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class daysoftheweek extends AppCompatActivity {

    private CheckBox monday, tuesday, wednesday, thursday, friday, saturday, sunday;
    private Button check;
    private TextView checkResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daysoftheweek);

        monday = findViewById(R.id.monday);
        tuesday = findViewById(R.id.tuesday);
        wednesday = findViewById(R.id.wednesday);
        thursday = findViewById(R.id.thursday);
        friday = findViewById(R.id.friday);
        saturday = findViewById(R.id.saturday);
        sunday = findViewById(R.id.sunday);

        check = findViewById(R.id.check);
        checkResult = findViewById(R.id.checkResult);
        checkResult.setEnabled(false);

        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (monday.isChecked()){
                    monday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    monday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tuesday.isChecked()){
                    tuesday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    tuesday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (wednesday.isChecked()){
                    wednesday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    wednesday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (thursday.isChecked()){
                    thursday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    thursday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (friday.isChecked()){
                    friday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    friday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (saturday.isChecked()){
                    saturday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    saturday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sunday.isChecked()){
                    sunday.setTextColor(getResources().getColor(R.color.colorAccent));
                } else {
                    sunday.setTextColor(getResources().getColor(R.color.colordays));
                }
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(monday.isChecked()){
                    s += "\n wor-yoil";
                }
                if(tuesday.isChecked()){
                    s += "\n haw-yoil";
                }
                if(wednesday.isChecked()){
                    s += "\n su-yoil";
                }
                if(thursday.isChecked()){
                    s += "\n mok-yoil";
                }
                if(friday.isChecked()){
                    s += "\n geum-yoil";
                }
                if(saturday.isChecked()){
                    s += "\n tho-yoil";
                }
                if(sunday.isChecked()){
                    s += "\n il-yoil";
                }
                checkResult.setText(s);
            }
        });
    }
}
