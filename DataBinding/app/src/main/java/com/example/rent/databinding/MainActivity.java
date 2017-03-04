package com.example.rent.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rent.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setAboutMe(new AboutMe());

        // trzeba usunąć z activity_main: android:text="@{aboutMe.name}"
        // nie trzeba tworzyć obiektu TextView
        binding.name.setText(getString(R.string.my_name, "Tomaszooooooooo"));

    }
}
