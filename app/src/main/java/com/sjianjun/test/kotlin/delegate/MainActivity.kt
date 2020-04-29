package com.sjianjun.test.kotlin.delegate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.Keep

@Keep
class MainActivity : AppCompatActivity() {
    var delegateTest by DelegateTest()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this::class.java.declaredMethods.forEach {
            Log.e("DelegateTest", it.toString())
        }

        Log.e("DelegateTest ", delegateTest.toString()+DelegateTest::class.java.name)
        delegateTest = 1
        Log.e("DelegateTest ", delegateTest.toString())
    }
}
