package com.example.android.bigappleroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hotelButton = (Button) findViewById(R.id.hotels);
        hotelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelIntent);
            }
        });

        Button restaurantsButton = (Button) findViewById(R.id.restaurants);
        restaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        Button storesButton = (Button) findViewById(R.id.stores);
        storesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storesIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(storesIntent);
            }
        });

        Button meetingsButton = (Button) findViewById(R.id.meetings);
        meetingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent meetingsIntent = new Intent(MainActivity.this, MeetingActivity.class);
                startActivity(meetingsIntent);
            }
        });
    }
}
