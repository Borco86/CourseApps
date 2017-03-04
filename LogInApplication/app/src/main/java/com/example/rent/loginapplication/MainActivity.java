package com.example.rent.loginapplication;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText loginEditText = (EditText) findViewById(R.id.edit_text_login);
        final EditText passwordEditText = (EditText) findViewById(R.id.edit_text_password);
        final TextInputLayout loginInputLayout = (TextInputLayout) findViewById(R.id.login_input_layout);
        final TextInputLayout passwordInputLayout = (TextInputLayout) findViewById(R.id.password_input_layout);



        final Button logInButton = (Button) findViewById(R.id.button_login);
        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!loginEditText.getText().toString().contains("@")|| loginEditText.getText().toString().isEmpty()){
                    loginInputLayout.setError("Zły format email");

                }else if(passwordEditText.getText().toString().isEmpty()){
                    passwordInputLayout.setError("Hasło musi zawierać znaki");
                }
                else{
                    logInButton.setText("Zalogowano!");
                    Snackbar.make(v,"ggggggggggggg", Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                        }
                    }).show();
                }
            }
        });

    }
}
