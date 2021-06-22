package com.welcome.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlogin: Button =findViewById(R.id.btnlogin)
        val etEmail:EditText=findViewById(R.id.etEmail)
        val etPassword:EditText=findViewById(R.id.etPassword)
        val tverror:TextView =findViewById(R.id.tverror)

        btnlogin.setOnClickListener{
            val userEmail:String = etEmail.text.toString()
            val userPassword:String = etPassword.text.toString()
            if(userEmail.equals("prajunagrale24@gmail.com") && userPassword.equals("prajakta1999"))
            {   tverror.text=""
                Toast.makeText(this,"login successfully !",Toast.LENGTH_LONG).show()
            }
            else
            {   tverror.text="Email or Password is incorrect!"
                Toast.makeText(this,"Invalid Creadential!",Toast.LENGTH_LONG).show()

            }



        }




    }

}