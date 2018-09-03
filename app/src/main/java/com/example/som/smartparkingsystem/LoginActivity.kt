package com.example.som.smartparkingsystem

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val admin="navin"
        val admin_pass="gg"

        registerButton.setOnClickListener{
            startActivity(Intent(this,register_page::class.java))
        }

        signInButton.setOnClickListener {
            checkAdmin(admin,admin_pass)
        }
    }

    fun checkAdmin(admin:String?,password:String?)
    {
        if (loginName.length() == 0 || loginPassword.length() == 0)
            cl.visibility= View.VISIBLE
        else if(loginName.text.toString()==admin && loginPassword.text.toString()==password)
            startActivity(Intent(this,admin1::class.java))
        else
            startActivity(Intent(this,book_slot::class.java))
    }
}
