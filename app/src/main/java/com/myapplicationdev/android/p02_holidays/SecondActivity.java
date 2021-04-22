package com.myapplicationdev.android.p02_holidays;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvSecular;
    ArrayAdapter aa;
    ArrayList<Holiday> holidays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvHoliday);
        tvSecular = (TextView) findViewById(R.id.tvSecular);

        Intent i = getIntent();
        String secular = i.getStringExtra("year");
        tvSecular.setText(secular);

        holidays = new ArrayList<Holiday>();

        if (secular == "Secular"){
            holidays.add(new Holiday("New Year's Day", true));
            holidays.add(new Holiday("Labour Day", true));
        }
        aa = new HolidayAdapter(this, R.layout.row, holidays);
        lv.setAdapter(aa);

    }

}