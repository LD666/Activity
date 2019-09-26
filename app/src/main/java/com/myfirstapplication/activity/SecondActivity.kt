package com.myfirstapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //var thisIntent = Intent(this, MainActivity::class.java)

        var thisStr:String = intent.extras?.getString("myData").toString()

        textView.text = thisStr

    }
}
