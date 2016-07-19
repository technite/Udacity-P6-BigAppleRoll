package com.example.android.bigappleroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MeetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> meetings = new ArrayList<>();

        meetings.add(new Location(getString(R.string.Union_Square), getString(R.string.usq_address), getString(R.string.usq_phone_num)));
        meetings.add(new Location(getString(R.string.battery_park), getString(R.string.battery_park_address), getString(R.string.battery_park_phone_num)));

        LocationAdapter adapter = new LocationAdapter(this, meetings);
        ListView listview = (ListView) findViewById(R.id.locationList);
        listview.setAdapter(adapter);

    }
}
