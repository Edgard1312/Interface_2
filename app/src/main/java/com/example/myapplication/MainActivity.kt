package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.net.Uri
/*import kotlinx.android.synthetic.main.activity_main.**/



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Configurar evento onClick para textView2

       /* textView2.setOnClickListener {
            val url = "https://accounts.google.com/lifecycle/steps/signup/name?continue=https://myaccount.google.com?utm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&ddm=0&dsh=S-1224332477:1715545449472423&flowEntry=SignUp&flowName=GlifWebSignIn&TL=ALv_Gf8CBUszHGBN1x4NAbxLRAY7ezjqW-AuzRJkOPgN8kiZRlmpxhleLiYnTf8I"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }*/

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

