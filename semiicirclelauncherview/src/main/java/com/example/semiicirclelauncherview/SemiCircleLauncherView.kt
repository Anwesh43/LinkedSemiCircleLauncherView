package com.example.semiicirclelauncherview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.graphics.RectF
import android.content.Context
import android.app.Activity

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#673AB7",
    "#FF9800",
    "#880E4F",
    "#00C853"
).map {
    Color.parseColor("#BDBDBD")
}.toTypedArray()
val backColor : Int = Color.parseColor("#BDBDBD")
val delay : Long = 20
val strokeFactor : Float = 90f
val sizeFactor : Float = 3.9f
val rFactor : Float = 13.9f
val parts : Int = 4
val scGap : Float = 0.02f / parts
val deg : Float = 180f

