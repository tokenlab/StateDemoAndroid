package com.machioni.statedemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //se o bundle nao for null, significa que o android está recriando esta activity, e irá recriar tambem
        // o fragment, portanto nao precisamos adicioná-lo novamente.
        if(savedInstanceState == null)
            supportFragmentManager.beginTransaction().add(R.id.container, MainFragment.newInstance()).commit()
    }
}
