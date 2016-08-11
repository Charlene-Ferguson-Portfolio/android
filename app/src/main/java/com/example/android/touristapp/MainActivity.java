package com.example.android.touristapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


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
