package com.example.drawingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawingapp.gitScriibleapp.DrawingView


class MainActivity : AppCompatActivity() {

    private var drawingView:DrawingView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawingView = findViewById(R.id.drawing_view)
        drawingView?.setSizeForBrush(20.toFloat())

    }
}
