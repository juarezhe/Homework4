package com.example.android.homework4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String username;
    private byte tenDollarCount = 0;
    private byte twentyDollarCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usernameField = findViewById(R.id.username);

        final TextView tenDollarCountField = findViewById(R.id.ten_dollar_count);
        tenDollarCountField.setText(String.valueOf(tenDollarCount));

        TextView tenDollarDecrease = findViewById(R.id.ten_dollar_decrease);
        tenDollarDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tenDollarCount = Byte.parseByte(tenDollarCountField.getText().toString());
                if (tenDollarCount > 0)
                    tenDollarCount--;
                else
                    tenDollarCount = 0;
                tenDollarCountField.setText(String.valueOf(tenDollarCount));
            }
        });

        TextView tenDollarIncrease = findViewById(R.id.ten_dollar_increase);
        tenDollarIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tenDollarCount = Byte.parseByte(tenDollarCountField.getText().toString());
                tenDollarCount++;
                tenDollarCountField.setText(String.valueOf(tenDollarCount));
            }
        });

        final TextView twentyDollarCountField = findViewById(R.id.twenty_dollar_count);
        twentyDollarCountField.setText(String.valueOf(twentyDollarCount));

        TextView twentyDollarDecrease = findViewById(R.id.twenty_dollar_decrease);
        twentyDollarDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twentyDollarCount = Byte.parseByte(twentyDollarCountField.getText().toString());
                if (twentyDollarCount > 0)
                    twentyDollarCount--;
                else
                    twentyDollarCount = 0;
                twentyDollarCountField.setText(String.valueOf(twentyDollarCount));
            }
        });

        TextView twentyDollarIncrease = findViewById(R.id.twenty_dollar_increase);
        twentyDollarIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twentyDollarCount = Byte.parseByte(twentyDollarCountField.getText().toString());
                twentyDollarCount++;
                twentyDollarCountField.setText(String.valueOf(twentyDollarCount));
            }
        });

        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = usernameField.getText().toString();

                Intent intent = new Intent(getApplicationContext(), DisplayResult.class);
                intent.putExtra("username", username);
                intent.putExtra("tenDollarCount", String.valueOf(tenDollarCount));
                intent.putExtra("twentyDollarCount", String.valueOf(twentyDollarCount));
                startActivity(intent);
            }
        });
    }
}