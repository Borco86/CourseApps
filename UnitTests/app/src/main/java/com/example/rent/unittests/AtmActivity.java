package com.example.rent.unittests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atm);

        Button getBalanceButton = (Button) findViewById(R.id.get_balance_button);
        getBalanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button depositButton = (Button) findViewById(R.id.deposit_button);
        depositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button withdrawButton = (Button) findViewById(R.id.withdraw_button);
        withdrawButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        TextView atmTextView = (TextView) findViewById(R.id.atm_console_text_view);
        atmTextView.setText("placeholder");

        EditText atmEditText = (EditText) findViewById(R.id.atm_console_edit_text);


    }
}
