package com.mny.learning.kaixue.kotlin.basic1

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mny.learning.kaixue.R
import kotlinx.android.synthetic.main.activity_basic_one.*

class BasicOneActivity : AppCompatActivity() {
    companion object {
        const val TAG = "BasicOneActivity"
    }

    private lateinit var mTvHomework: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_one)
        mTvHomework = findViewById(R.id.tvHomework)
        setBg(mTvHomework)
        test(mTvHomework)

        test(imgLaunch)
    }

    private fun setBg(view: View?) {
        view?.setBackgroundColor(Color.YELLOW)
    }

    private fun test(view: View) {
        try {
            val textView = view as? TextView
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? 转换为 TextView，是否为空 = ${textView == null}")
        } catch (e: Exception) {
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? 转换为 TextView，转换出现异常 ${e}")
            e.printStackTrace()
        }
        try {
            val textView = view as TextView?
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as TextView? 转换为 TextView，是否为空 = ${textView == null}")
        } catch (e: Exception) {
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as TextView? 转换为 TextView，转换出现异常 ${e}")
            e.printStackTrace()
        }
        try {
            val textView = view as? TextView
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? TextView? 转换为 TextView，是否为空 = ${textView == null}")
        } catch (e: Exception) {
            Log.d(TAG, "${view.javaClass.canonicalName} 通过 as? TextView? 转换为 TextView，转换出现异常 ${e}")
            e.printStackTrace()
        }
    }

    // 可以修改
    public override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }


}
