package com.peirr.demo

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import java.text.DecimalFormat

class LabelView : AppCompatTextView {

    var formatter = DecimalFormat("#.##")
    var startWidth = -1
    var startHeight = -1

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun setNumber(value: Float) {
        text = formatter.format(value)
    }

    fun setWidthRatio(value: Float) {
        if (startWidth == -1) {
            startWidth = layoutParams.width
            startHeight = layoutParams.height
        }
        layoutParams.width = (value * startWidth).toInt()
        layoutParams.height = startHeight
    }
}
