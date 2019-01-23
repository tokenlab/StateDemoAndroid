package com.machioni.statedemo

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.main_fragment.*


class MainFragment : Fragment() {

    val stringKey = "stringkey"
    var string: String? = null

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if(savedInstanceState != null) {
            string = savedInstanceState.getString(stringKey)
        }

        button1.setOnClickListener { string = editText.text.toString() }
        button2.setOnClickListener { textView.text = string }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(stringKey, string)
        super.onSaveInstanceState(outState)
    }
}
