package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToHomeFromLogin(view: View?) {
        val intent = Intent(this@MainActivity, HomePage::class.java)
        startActivity(intent)

        //startActivity(intent)
    }

    fun goToSignUpFromLogin(view: View?) {
        val intent = Intent(this, SignUpPage::class.java)
        startActivity(intent)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}