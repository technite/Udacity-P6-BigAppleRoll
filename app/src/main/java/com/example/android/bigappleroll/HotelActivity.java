package com.example.android.bigappleroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> hotels = new ArrayList<Location>();

        hotels.add(new Location("The Holiday Inn", "99 Washington Street\nNew York, NY 10006", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("The Broome", "431 Broome Street\nNew York City, NY 10013", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("SIXTY SoHo", "60 Thompson Street\nNew York City, NY 10012", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("Crosby Street Hotel", "79 Crosby Street\nNew York City, NY 10012", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("The James New York", "27 Grand St. \nNew York City, NY 10013", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("Soho Grand Hotel", "310 West Broadway \nNew York City, NY 10013-2225", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("NOMO SOHO Hotel", "79 Crosby Street \nNew York City, NY 10012", "(212) 791-2900",R.drawable.hotel_ic));
        hotels.add(new Location("Hampton Inn Manhattan-SoHo", "54 Watts St \nNew York City, NY 10013-1912", "(212) 791-2900",R.drawable.hotel_ic));


        LocationAdapter adapter = new LocationAdapter(this, hotels);

        ListView listview = (ListView) findViewById(R.id.locationList);
        listview.setAdapter(adapter);
    }
}
