package com.example.android.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by djuarez on 09-Mar-18.
 */

public class DisplayResult extends AppCompatActivity{

    String username = getIntent().getStringExtra("EXTRA_USERNAME");
    //byte tenDollarTicketCount = MainActivity.getTenDollarCount();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        final TextView thankYouField = findViewById(R.id.thank_you_field);
        thankYouField.setText("Thank you, " + username);
    }
}
