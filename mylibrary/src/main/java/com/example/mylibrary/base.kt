package com.example.mylibrary

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class base : AppCompatActivity() {

    companion object {
        @JvmStatic
        fun getIntent(context: Context) : Intent {
            var intent= Intent(context,base::class.java)
            return intent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }


}
