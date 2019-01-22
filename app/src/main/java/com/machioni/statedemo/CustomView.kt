package com.machioni.statedemo

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout

class CustomView(context: Context, private val attrs: AttributeSet?) : FrameLayout(context, attrs) {
    init {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.custom_view, this)
    }
}
