package com.mny.learning.kaixue.kotlin.basic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mny.learning.kaixue.R

class BasicTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_two)
        val practice = Practice.getInstance()
        practice.calculateWithArray()
        practice.calculateWithIntArray()
        practice.calculateWithList()
    }
}
