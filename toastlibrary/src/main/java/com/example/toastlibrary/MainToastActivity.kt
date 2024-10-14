package com.example.toastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_toast)

    }



    fun showMessage():String {

        return "Parvesh";
    }
}