package com.machioni.statedemo

import android.content.Context
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.evernote.android.state.State
import com.evernote.android.state.StateSaver
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView(context: Context, private val attrs: AttributeSet?) : FrameLayout(context, attrs) {

    @State
    var switchId = View.generateViewId()

    @State
    var checkboxId = View.generateViewId()

    @State
    var seekbarId = View.generateViewId()

    init {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.custom_view, this)
        setIds()
    }

    override fun onSaveInstanceState(): Parcelable? {
        return StateSaver.saveInstanceState(this, super.onSaveInstanceState())
    }

    override fun onRestoreInstanceState(state: Parcelable) {
        with(StateSaver.restoreInstanceState(this, state)){
            setIds()
            super.onRestoreInstanceState(this)
        }
    }

    private fun setIds(){
        switch1.id = switchId
        checkbox1.id = checkboxId
        seekbar1.id = seekbarId
    }
}
