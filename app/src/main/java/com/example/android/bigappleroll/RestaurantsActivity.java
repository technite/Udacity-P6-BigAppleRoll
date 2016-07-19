package com.example.android.bigappleroll;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Daniel on 7/18/2016.
 */
public class RestaurantsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);


        ArrayList<Location> restaurants = new ArrayList<Location>();

        restaurants.add(new Location(getString(R.string.pier_a), getString(R.string.pier_a_addr), getString(R.string.pier_a_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.upstate),getString(R.string.upstate_addr),getString(R.string.upstate_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.amelie),getString(R.string.amelie_addr),getString(R.string.amelie_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.bea),getString(R.string.bea_addr),getString(R.string.bea_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.alcove),getString(R.string.alcove_addr),getString(R.string.alcove_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.traif),getString(R.string.traif_addr),getString(R.string.traif_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.the_greek),getString(R.string.the_greek_addr),getString(R.string.the_greek_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.barn_joo),getString(R.string.barn_joo_addr),getString(R.string.barn_joo_phone_num), R.drawable.dining_image));
        restaurants.add(new Location(getString(R.string.cask),getString(R.string.cask__addr),getString(R.string.cask_phone_num), R.drawable.dining_image));

        LocationAdapter adapter = new LocationAdapter(this, restaurants);

        ListView listview = (ListView) findViewById(R.id.locationList);
        listview.setAdapter(adapter);

    }
}
