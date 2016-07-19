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

        meetings.add(new Location("Union Square", "101 East 14th St \nNew York, NY", "(212) 555-5000"));
        meetings.add(new Location("Battery Park", "399 Albany St \nNew York, NY", "(212) 555-5000"));

        LocationAdapter adapter = new LocationAdapter(this, meetings);
        ListView listview = (ListView) findViewById(R.id.locationList);
        listview.setAdapter(adapter);

    }
}
