package com.srivatsa.bottomnavigationmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Toast.makeText(this, "Hi, I am Srivatsa Ramesh", Toast.LENGTH_SHORT).show()
    }
}
