package com.example.android.touristapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);


        // Find the View that shows the museums category
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the museums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumsActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the theatre category
        TextView theatres = (TextView) findViewById(R.id.theatres);

        // Set a click listener on that View
        theatres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the theatre category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TheatreActivity}
                Intent theatreIntent = new Intent(MainActivity.this, TheatreActivity.class);

                // Start the new activity
                startActivity(theatreIntent);
            }
        });





    }
}
