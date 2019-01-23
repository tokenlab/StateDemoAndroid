package com.machioni.statedemo

import android.app.Application
import com.evernote.android.state.StateSaver

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        StateSaver.setEnabledForAllActivitiesAndSupportFragments(this, true)
    }
}