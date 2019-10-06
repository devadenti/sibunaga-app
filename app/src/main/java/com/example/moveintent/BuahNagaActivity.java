package com.example.moveintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class BuahNagaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah_naga);

        //Tentang Buah Naga
        // Find the View that shows about_naga
        TextView about_naga = (TextView) findViewById(R.id.about_naga);

        // Set a click listener on that View
        about_naga.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when about naga is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SABoutNagaActivity}
                Intent aboutNagaIntent = new Intent(BuahNagaActivity.this, AboutNagaActivity.class);

                // Start the new activity
                startActivity(aboutNagaIntent);
            }
        });

        //Jenis-jenis Buah Naga
        // Find the View that shows jenis naga
        TextView jenis_naga = (TextView) findViewById(R.id.jenis_naga);

        // Set a click listener on that View
        jenis_naga.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when jenis_naga category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link JenisNagaActivity}
                Intent jenisNagaIntent = new Intent(BuahNagaActivity.this, JenisNagaActivity.class);

                // Start the new activity
                startActivity(jenisNagaIntent);
            }
        });

        //Manfaat Buah Naga
        // Find the View that shows the numbers category
        TextView manfaat_naga = (TextView) findViewById(R.id.manfaat_naga);

        // Set a click listener on that View
        manfaat_naga.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when manfaat_naga ategory is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ManfaatNagaActivity}
                Intent manfaatNagaIntent = new Intent(BuahNagaActivity.this, ManfaatNagaActivity.class);

                // Start the new activity
                startActivity(manfaatNagaIntent);
            }
        });








//CLOSE
    }

}