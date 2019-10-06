package com.example.moveintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class CaraTanamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_tanam);

//STEP ONE
        // Find the View that shows the numbers category
        TextView step1 = (TextView) findViewById(R.id.step1);

        // Set a click listener on that View
        step1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StepOneActivity}
                Intent stepOneIntent = new Intent(CaraTanamActivity.this, StepOneActivity.class);

                // Start the new activity
                startActivity(stepOneIntent);
            }
        });

        //STEP TWO
        // Find the View that shows the numbers category
        TextView step2 = (TextView) findViewById(R.id.step2);

        // Set a click listener on that View
        step2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StepTwoActivity}
                Intent stepTwoIntent = new Intent(CaraTanamActivity.this, StepTwoActivity.class);

                // Start the new activity
                startActivity(stepTwoIntent);
            }
        });

        //STEP THREE
        // Find the View that shows the numbers category
        TextView step3 = (TextView) findViewById(R.id.step3);

        // Set a click listener on that View
        step3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StepThreeActivity}
                Intent stepThreeIntent = new Intent(CaraTanamActivity.this, StepThreeActivity.class);

                // Start the new activity
                startActivity(stepThreeIntent);
            }
        });

        //STEP FOUR
        // Find the View that shows the numbers category
        TextView step4 = (TextView) findViewById(R.id.step4);

        // Set a click listener on that View
        step4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StepFourActivity}
                Intent stepFourIntent = new Intent(CaraTanamActivity.this, StepFourActivity.class);

                // Start the new activity
                startActivity(stepFourIntent);
            }
        });

        //STEP FIVE
        // Find the View that shows the numbers category
        TextView step5 = (TextView) findViewById(R.id.step5);

        // Set a click listener on that View
        step5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StepFiveActivity}
                Intent stepFiveIntent = new Intent(CaraTanamActivity.this, StepFiveActivity.class);

                // Start the new activity
                startActivity(stepFiveIntent);
            }
        });







//CLOSE
    }

}