package com.example.gaugeapplication;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class HomePage<savedInstanceState> extends Activity {
    override fun onCreate(savedInstanceState: Bundle?) {
        Bundle savedInstanceState;
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
    }
}
