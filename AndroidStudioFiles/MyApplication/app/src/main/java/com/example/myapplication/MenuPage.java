package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MenuPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupage);
    }

    public void goToHomeFromMenu (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }
    public void goToContactUsFromMenu (View view){
        Intent intent = new Intent (this, ContactUsPage.class);
        startActivity(intent);
    }
    public void goToSettingsFromMenu (View view){
        Intent intent = new Intent (this, SettingsPage.class);
        startActivity(intent);
    }
    public void goToLoginFromMenu (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }
    public void goToHome (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }
    public void goToWebsiteFromMenu (View view){
        Intent intent = new Intent (this, ContactUsPage.class);
        startActivity(intent);
    }
}

