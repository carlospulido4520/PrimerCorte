package com.pulido.carlos.primercorte

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonutb = findViewById<Button>(R.id.botoncito)
        botonutb.setOnClickListener{
            val vinculo = Intent(this,Main2Activity::class.java)
            startActivity(vinculo)

            }



    }
}
