package com.example.tugas.View

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas.R

class Register : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var etConfirmPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.passwd)
        etConfirmPassword = findViewById(R.id.edt_confirm_password)

        val btnRegister: Button = findViewById(R.id.btn_register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_register-> {

                val bundle = Bundle()
                bundle.putString("username",etUsername.text.toString())
                bundle.putString("password",etPassword.text.toString())

                val intent = Intent(this@Register, Login::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }
}
