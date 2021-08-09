package com.example.gaugeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);
    }
    public void goToMenuFromSettings (View view){
        Intent intent = new Intent (this, MenuPage.class);
        startActivity(intent);
    }
    public void goToAccSettings (View view){
        //code to website will work for now(?)
    }
    public void goToConnectMicroprocessor (View view){
        //shammy needs to look this up
    }
    public void goToHelp (View view){
        //code to website or use the code below
        /*
        Intent intent = new Intent (this, ContactUs.class);
        startActivity(intent);
         */
    }
    public void goToFeedback (View view){
        //code to website or use the code below
        /*
        Intent intent = new Intent (this, ContactUs.class);
        startActivity(intent);
         */
    }
    public void goToWebsite (View view) {
        //code to link website
    }
    //notifications toggle button needs code

}
