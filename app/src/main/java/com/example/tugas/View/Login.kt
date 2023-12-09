package com.example.tugas.View

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas.MainActivity
import com.example.tugas.Model.User
import com.example.tugas.R
import com.example.tugas.databinding.ActivityLoginBinding

class Login : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var history:TextView
    private lateinit var binding: ActivityLoginBinding

    val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            result ->
        if(result.resultCode == Activity.RESULT_OK){
            val data:Intent? = result.data
            val returnString:String? = data?.getStringExtra("history")
            history.text = returnString
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        history = findViewById(R.id.history)
        etUsername = findViewById(R.id.username)
        etPassword = findViewById(R.id.passwd)

        val bundle = intent.extras
        if(bundle != null){
            etUsername.setText(bundle.getString("username"))
            etPassword.setText(bundle.getString("password"))
        }

        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v != null) {
            when (v.id) {

                R.id.btnLogin -> {
                    val intent = Intent(this@Login, MainActivity::class.java)
                    startActivity(intent)
                    intent.putExtra("User",User(etUsername.text.toString(),etPassword.text.toString()))
                    resultLauncher.launch(intent)
                }
            }
        }
    }
}
