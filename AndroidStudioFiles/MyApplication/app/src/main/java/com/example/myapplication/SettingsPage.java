package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class SettingsPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settingspage);
    }

    public void goToMenuFromSettings (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }
    public void goToAccountSettings (View view){
        Intent intent = new Intent (this, ContactUsPage.class);
        startActivity(intent);
    }
    public void goToNotifications (View v){
        Intent intent = new Intent (this, NotificationsPage.class);
        startActivity(intent);
    }
    public void goToConnectToMicroprocessor (View view){
        Intent intent = new Intent (this, ContactUsPage.class);
        startActivity(intent);
    }
    public void goToHelp (View view){
            Intent intent = new Intent (this, ContactUsPage.class);
            startActivity(intent);
    }
    public void goToFeedback (View view){
        Intent intent = new Intent (this, ContactUsPage.class);
        startActivity(intent);
    }
    public void goToWebsiteFromSettings (View view){
        Intent intent = new Intent (this, ContactUsPage.class);
        startActivity(intent);
    }

}
