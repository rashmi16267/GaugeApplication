package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class ContactUsPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactuspage);
    }

    public void goToMenuFromContactUs (View view){
        Intent intent = new Intent (this, MenuPage.class);
        startActivity(intent);
    }
    public void SubmitContactUsInfo (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }

}
