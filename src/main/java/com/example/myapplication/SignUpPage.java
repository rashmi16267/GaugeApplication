package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
    }

    public void goToHomeFromSignUp (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }

    public void goToLoginFromSignUp (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
