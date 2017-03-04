package com.example.rent.zapisywaniestanu;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private static final String EDIT_TEXT_STATE_KEY = "edit_text_state_fix";
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text);

        onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState){

        };

    }


}
