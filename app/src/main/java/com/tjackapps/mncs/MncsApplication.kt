package com.tjackapps.mncs

import android.app.Application
import com.mncs.initialization.Initializer
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MncsApplication : Application() {

    @Inject
    lateinit var initializer: Initializer

    override fun onCreate() {
        super.onCreate()
        initializer()
    }
}