package com.sjianjun.test.kotlin.delegate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var delegateTest by DelegateTest()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("DelegateTest ", delegateTest.toString()+DelegateTest::class.java.name)
        delegateTest = 1
        Log.e("DelegateTest ", delegateTest.toString())
    }
}
