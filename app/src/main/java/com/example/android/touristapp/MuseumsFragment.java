package com.example.android.touristapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class MuseumsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.interest_list, container, false);

        final ArrayList<PointOfInterest> interests = new ArrayList<>();

        interests.add(new PointOfInterest("British Museum", R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("Science Museum",R.mipmap.ic_launcher ));
        interests.add(new PointOfInterest("Natural History Museum", R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("Victoria and Albert Museum", R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("Tate Modern", R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("London Transport Museum", R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("National Gallery",  R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("Design Museum", R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("Churchill War Rooms",  R.mipmap.ic_launcher));
        interests.add(new PointOfInterest("Charles Dickens", R.mipmap.ic_launcher));

        // Create an adapter whose data source is a list of musuems. The
        // adapter knows how to create list items for each item in the list.
        PointOfInterestAdapter adapter = new PointOfInterestAdapter(getActivity(), interests, R.color.category_museums);

        //Create a list view
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //
        listView.setAdapter(adapter);

        return rootView;
    }


}
