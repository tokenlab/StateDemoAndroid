package com.machioni.statedemo

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.custom_view.view.*

class CustomView(context: Context, private val attrs: AttributeSet?) : FrameLayout(context, attrs) {

    private val superStateExtra = "superStateExtra"
    private val switchIdExtra = "switchIdExtra"
    private val checkboxIdExtra = "checboxIdExtra"
    private val seekbarIdExtra = "seekbarIdExtra"

    init {
        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.custom_view, this)

        //para preservar o estado de views internas, é preciso que cada uma tenha um id
        switch1.id = View.generateViewId()
        checkbox1.id = View.generateViewId()
        seekbar1.id = View.generateViewId()

        isSaveEnabled = true
    }

    public override fun onSaveInstanceState(): Parcelable? {
        val bundle = Bundle()
        bundle.putParcelable(superStateExtra, super.onSaveInstanceState())
        bundle.putInt(switchIdExtra, switch1.id)
        bundle.putInt(checkboxIdExtra, checkbox1.id)
        bundle.putInt(seekbarIdExtra, seekbar1.id)
        return bundle
    }

    public override fun onRestoreInstanceState(state: Parcelable) {
        if (state is Bundle) {
            super.onRestoreInstanceState(state.getParcelable(superStateExtra))

            switch1.id = state.getInt(switchIdExtra)
            checkbox1.id  = state.getInt(checkboxIdExtra)
            seekbar1.id = state.getInt(seekbarIdExtra)
        } else {
            super.onRestoreInstanceState(state)
        }
    }
}
