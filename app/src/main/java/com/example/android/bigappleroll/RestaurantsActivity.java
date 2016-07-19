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

        restaurants.add(new Location("Pier A Harbor House", "22 Battery Pl\nNew York, NY 10004", "(212) 785-0153", R.drawable.dining_image));
        restaurants.add(new Location("Upstate","95 1st Ave \nNew York, NY 10003","(917) 408-3395", R.drawable.dining_image));
        restaurants.add(new Location("Amélie","22 W 8th St \nNew York, NY 10011","(212) 533-2962", R.drawable.dining_image));
        restaurants.add(new Location("Bea","403 W 43rd St \nNew York, NY 10036","(212) 602-1910", R.drawable.dining_image));
        restaurants.add(new Location("The Alcove","41-11 49th Street \nSunnyside, NY 11104","(347) 813-4159", R.drawable.dining_image));
        restaurants.add(new Location("Traif","229 S 4th St \nBrooklyn, NY 11211","(347) 844-9578", R.drawable.dining_image));
        restaurants.add(new Location("The Greek","458 Greenwich St \nNew York, NY 10013","(646) 476-3941", R.drawable.dining_image));
        restaurants.add(new Location("Barn Joo 35","34 W 35th St \nNew York, NY 10001","(212) 564-4430", R.drawable.dining_image));
        restaurants.add(new Location("Cask Bar & Kitchen","167 E 33rd St \nNew York, NY 10016","(212) 300-4924", R.drawable.dining_image));

        LocationAdapter adapter = new LocationAdapter(this, restaurants);

        ListView listview = (ListView) findViewById(R.id.locationList);
        listview.setAdapter(adapter);

    }
}
