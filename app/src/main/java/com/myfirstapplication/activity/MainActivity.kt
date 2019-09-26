package com.myfirstapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var strData: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener(View.OnClickListener {

            strData = editText.text.toString()

            var myIntent = Intent(this, SecondActivity::class.java)
            myIntent.putExtra("myData", strData)
            startActivity(myIntent)
        })

    }
}
