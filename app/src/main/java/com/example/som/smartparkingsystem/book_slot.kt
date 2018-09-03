package com.example.som.smartparkingsystem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_book_slot.*

class book_slot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_slot)
        button.setOnClickListener { Toast.makeText(this@book_slot,"Connection incomplete",Toast.LENGTH_LONG).show() }
    }
}
