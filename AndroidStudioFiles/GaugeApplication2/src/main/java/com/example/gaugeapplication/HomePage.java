package com.example.gaugeapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }

        public void goToMenuFromHome (View view) {
            Intent intent = new Intent(this, MenuPage.class);
            startActivity(intent);
        }

        //toggle button for pump manual control needs code


}

