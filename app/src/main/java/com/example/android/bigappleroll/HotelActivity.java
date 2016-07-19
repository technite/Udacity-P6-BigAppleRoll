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

        hotels.add(new Location(getString(R.string.holiday_inn), getString(R.string.holiday_inn_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.broome), getString(R.string.broome_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.sixty_soho), getString(R.string.sixty_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.crosby_street_hotel), getString(R.string.crosby_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.the_james), getString(R.string.the_james_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.soho_grand), getString(R.string.soho_grand_addr),getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.nomo_soho), getString(R.string.nomo_soho_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));
        hotels.add(new Location(getString(R.string.hampton_inn), getString(R.string.hampton_inn_addr), getString(R.string.hotel_phone_nums),R.drawable.hotel_ic));


        LocationAdapter adapter = new LocationAdapter(this, hotels);

        ListView listview = (ListView) findViewById(R.id.locationList);
        listview.setAdapter(adapter);
    }
}
