package com.example.android.touristapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by charlene on 12/08/16.
 */
public class PointOfInterestAdapter extends ArrayAdapter<PointOfInterest> {

    private int mColourResourceId ;

    public PointOfInterestAdapter(Context context, ArrayList<PointOfInterest> pPointOfInterest, int colourResourceId) {
        super(context, 0, pPointOfInterest);
        mColourResourceId = colourResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check whether a view is being reused otherwise create/inflate view
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get current point of interest
        PointOfInterest currentPointOfInterest = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.pio_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentPointOfInterest.getName());


        // Find the ImageView in the list_item.xml
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if(currentPointOfInterest.hasImage() ){
            // Get the image resource ID from the current word object and
            // set the image to imageView
            imageView.setImageResource(currentPointOfInterest.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }

        // Otherwise hide the visibility
        else{
            imageView.setVisibility(View.GONE);
        }

        // Set the theme for the list colour
        View text_container = listItemView.findViewById(R.id.list);
        //Find colour that the resource ID maps to
        int colour = ContextCompat.getColor(getContext(), mColourResourceId);
        // Set the background colour of the text container view
        text_container.setBackgroundColor(colour);
        // Return the whole list item layout (containing a TextView and ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
