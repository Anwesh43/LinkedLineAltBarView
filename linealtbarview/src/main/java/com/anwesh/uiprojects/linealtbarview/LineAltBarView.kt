package com.anwesh.uiprojects.linealtbarview

/**
 * Created by anweshmishra on 30/08/18.
 */

import android.graphics.Paint
import android.graphics.Canvas
import android.view.View
import android.view.MotionEvent
import android.content.Context
import android.graphics.Color
import android.graphics.RectF

val nodes : Int = 5

fun Canvas.drawLABNode(i : Int, scale : Float, paint : Paint) {
    val w : Float = width.toFloat()
    val h : Float = height.toFloat()
    val gap : Float = w / nodes
    paint.strokeWidth = Math.min(w, h) / 60
    paint.strokeCap = Paint.Cap.ROUND
    paint.color = Color.parseColor("#1E88E5")
    val index : Int = i % 2
    val factor : Int = 1 - 2 * index
    val sc : Float = Math.min(0.5f, Math.max(scale - 0.5f, 0f)) * 2
    val size : Float = gap / 4
    val y : Float = (-2 * size + 2 * size * index) * (1 - index) * sc
    save()
    translate(i * gap, h / 2)
    drawLine(0f, 0f, gap * scale, 0f, paint)
    save()
    translate(gap/2, 0f)
    drawRect(RectF(-size/2, y, size/2,2 * size * (index) * sc), paint)
    restore()
    restore()
}

class LineAltBarView(ctx : Context) : View(ctx) {

    private val paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)

    override fun onDraw(canvas : Canvas) {

    }

    override fun onTouchEvent(event : MotionEvent) : Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {

            }
        }
        return true
    }
}