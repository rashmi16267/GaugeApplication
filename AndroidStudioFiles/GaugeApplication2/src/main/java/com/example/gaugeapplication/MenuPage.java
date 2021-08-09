package com.example.gaugeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
    }
    public void goToHomeFromMenu (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }
    public void goToHome (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }
    public void goToSettings (View view){
        Intent intent = new Intent (this, Settings.class);
        startActivity(intent);
    }
    public void goToContactUs (View view){
        Intent intent = new Intent (this, ContactUs.class);
        startActivity(intent);
    }
    public void goToLoginPage (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
    public void goToWebPage (View view){
        //code containing the link to website
    }

}
