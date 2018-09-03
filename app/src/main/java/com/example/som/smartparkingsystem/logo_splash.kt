package com.example.som.smartparkingsystem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.timerTask

class logo_splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo_splash)

        val intent1=Intent(this,LoginActivity::class.java)
        Timer().schedule(timerTask{do_this(intent1)},3000)
    }
    fun do_this(intent1:Intent){
        startActivity(intent1)
        finish()
    }
}
