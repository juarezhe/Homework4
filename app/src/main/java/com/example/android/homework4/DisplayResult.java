package com.example.android.homework4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by djuarez on 09-Mar-18.
 */

public class DisplayResult extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        Intent intent = getIntent();

        String username = intent.getStringExtra("username");
        byte tenDollarCount = Byte.parseByte(intent.getStringExtra("tenDollarCount"));
        byte twentyDollarCount = Byte.parseByte(intent.getStringExtra("twentyDollarCount"));
        int total = 10 * tenDollarCount + 20 * twentyDollarCount;

        String textToSet = "Thank you, " + username + ". Your total for (" + tenDollarCount + ") $10 ticket(s) and (" + twentyDollarCount + ") $20 ticket(s) is $" + total + ".";

        final TextView thankYouField = findViewById(R.id.thank_you_field);
        thankYouField.setText(textToSet);
    }
}
