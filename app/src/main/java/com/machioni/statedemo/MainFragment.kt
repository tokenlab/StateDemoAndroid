package com.machioni.statedemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.evernote.android.state.State
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    @State
    var string1: String? = null

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button1.setOnClickListener { string1 = editText.text.toString() }
        button2.setOnClickListener { textView.text = string1 }
    }
}
