package com.example.android.bigappleroll;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniel on 7/18/2016.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> hotels){
        super(context, 0, hotels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Location currentLocation = getItem(position);


        TextView locationName = (TextView) listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getmLocationName());

        TextView locationAddress = (TextView) listItemView.findViewById(R.id.location_address);
        locationAddress.setText(currentLocation.getmLocationStreetAddress());

        TextView locationPhoneNum = (TextView) listItemView.findViewById(R.id.phone_number);
        locationPhoneNum.setText(currentLocation.getmPhoneNumber());

        ImageView location_image = (ImageView) listItemView.findViewById(R.id.location_image);

        if(currentLocation.hasImage()) {
            location_image.setVisibility(View.VISIBLE);
            location_image.setImageResource(currentLocation.getmImgResourceId());
        }
        else {
            location_image.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
