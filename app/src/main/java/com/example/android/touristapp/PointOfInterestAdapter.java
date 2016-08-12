package com.example.android.touristapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        return super.getView(position, convertView, parent);
    }
}
