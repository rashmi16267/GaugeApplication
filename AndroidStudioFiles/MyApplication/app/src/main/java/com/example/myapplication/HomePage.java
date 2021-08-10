package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class HomePage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void goToMenuFromHome (View view){
        Intent intent = new Intent (this, MenuPage.class);
        startActivity(intent);
    }
    public void ManualPumpToggleButton (View view){
        //code
    }
}
