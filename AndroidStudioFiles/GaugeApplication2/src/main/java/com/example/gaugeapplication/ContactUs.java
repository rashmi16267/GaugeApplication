package com.example.gaugeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus_page);
    }
    public void goToMenuFromContactUs (View view){
        Intent intent = new Intent (this, MenuPage.class);
        startActivity(intent);
    }
    public void submitContactInfoBtn (View view){
        //code for submitting questions for when the user wants to contact you
    }


}
