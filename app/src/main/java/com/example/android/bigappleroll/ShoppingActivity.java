package com.example.android.bigappleroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Location> stores = new ArrayList<>();

        stores.add(new Location("Blades","659 Broadway \nNew York, NY 10012","(212) 477-7350", R.drawable.shopping_bag));
        stores.add(new Location("Paragon","867 Broadway \nNew York, NY 10003","(800) 961-3030", R.drawable.shopping_bag));
        stores.add(new Location("Modell's Sporting Goods","607 Ave of Americas \nNew York, NY","(212) 989-1110", R.drawable.shopping_bag));


        LocationAdapter adapter = new LocationAdapter(this, stores);

        ListView listview = (ListView) findViewById(R.id.locationList);

        listview.setAdapter(adapter);
    }
}
