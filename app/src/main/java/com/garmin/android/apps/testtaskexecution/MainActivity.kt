package com.garmin.android.apps.testtaskexecution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.garmin.android.apps.submodule.SomeJavaClass
import com.garmin.android.apps.submodule.SomeKotlinClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SomeJavaClass().thisIsATest()
        SomeKotlinClass().thisIsSilly()
        MainJavaClass.doNothing()
    }
}
