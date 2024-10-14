package com.mytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlibrary.MainToastActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainToastActivity().showMessage();
    }
}