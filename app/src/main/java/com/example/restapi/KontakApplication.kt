package com.example.restapi

import android.app.Application
import com.example.restapi.data.AppContainer
import com.example.restapi.data.KontakContainer

class KontakApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = KontakContainer()
    }
}