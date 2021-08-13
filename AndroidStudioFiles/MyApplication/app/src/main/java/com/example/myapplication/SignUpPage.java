package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpPage extends Activity {

    private int signInID;
    private String signInPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
    }

    /*
    public SignUpCred() {}
    public SignUpCred(String emailid, String password) {
        this.signInID = emailid;
        this.signInPassword = password;
    }
    public void setID(int emailid) {
        this.signInID = emailid;
    }
    public int getID() {
        return this.signInID;
    }

    public void setPass(String password) {
        this.signInPassword = password;
    }
    public String getPass() {
        return this.signInPassword;
    }

     */

    public void goToHomeFromSignUp (View view){
        Intent intent = new Intent (this, HomePage.class);
        startActivity(intent);
    }

    public void goToLoginFromSignUp (View view){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

}
