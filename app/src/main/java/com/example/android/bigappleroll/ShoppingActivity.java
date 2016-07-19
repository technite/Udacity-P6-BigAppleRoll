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

        stores.add(new Location(getString(R.string.blades),getString(R.string.blades_addr),getString(R.string.blades_phone_num), R.drawable.shopping_bag));
        stores.add(new Location(getString(R.string.paragon),getString(R.string.paragon_addr),getString(R.string.paragon_phone_num), R.drawable.shopping_bag));
        stores.add(new Location(getString(R.string.modells),getString(R.string.modells_addr),getString(R.string.modells_phone_num), R.drawable.shopping_bag));


        LocationAdapter adapter = new LocationAdapter(this, stores);

        ListView listview = (ListView) findViewById(R.id.locationList);

        listview.setAdapter(adapter);
    }
}
