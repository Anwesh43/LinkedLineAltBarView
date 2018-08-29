package com.anwesh.uiprojects.linkedlinealtbarview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linealtbarview.LineAltBarView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineAltBarView.create(this)
    }
}
