package com.webcankaya.mobileappcankaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Handler;
import android.appwidget.*;
import android.widget.Toast;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.content.res.Resources;


public class Time_Table extends Activity
{
    private int count = 0;
    Button Tue, Wed, Thu, Fri;
    GridView Grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);

        Grid = (GridView) findViewById(R.id.grid);

        Tue = (Button) findViewById(R.id.salıbt);
        Wed = (Button) findViewById(R.id.carsbt);
        Thu = (Button) findViewById(R.id.persbt);
        Fri = (Button) findViewById(R.id.cumbt);

        Tue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Time_Table.this, Time_Table_Tue.class);
                startActivity(i);
            }
        });

        Wed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Time_Table.this, Time_Table_Wed.class);
                startActivity(i);
            }
        });

        Thu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Time_Table.this, Time_Table_Thu.class);
                startActivity(i);
            }
        });

        Fri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Time_Table.this, Time_Table_Fri.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onBackPressed() {
        count++;
        if (count >=1) {
        /* If count is greater than 1 ,you can either move to the next
        activity or just quit. */
            Intent intent = new Intent(Time_Table.this, Home_Page.class);
            startActivity(intent);
            finish();
//                overridePendingTransition
//                        (R.anim.push_left_in, R.anim.push_left_out);
            /* Quitting */
            finishAffinity();
        }
        else {
            Toast.makeText(this, "Press back again to Leave!", Toast.LENGTH_SHORT).show();

            // resetting the counter in 2s
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    count = 0;
                }
            }, 2000);
        }
        super.onBackPressed();
    }

}
