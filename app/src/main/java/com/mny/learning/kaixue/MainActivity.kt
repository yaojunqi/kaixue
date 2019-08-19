package com.mny.learning.kaixue

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mny.learning.kaixue.kotlin.basic1.BasicOneActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnKotlinBasicOne.setOnClickListener {
            startActivity(Intent(this, BasicOneActivity::class.java))
        }
    }
}
