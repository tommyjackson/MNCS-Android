package com.tjackapps.mncs

import android.app.Application
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect

class MncsApplication : Application() {

    val testFlow = MutableSharedFlow<String>()

    private suspend fun collectFlow() {
        testFlow.collect {
            Log.d("TESTING", it)
        }
    }

    val applicationScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    override fun onCreate() {
        super.onCreate()

        Log.d("TESTING", "STARTED")

        applicationScope.launch {
            collectFlow()

            testFlow.emit("one")

            delay(200)

            testFlow.emit("two")
            testFlow.emit("three")

            delay(801)

            testFlow.emit("four")

            delay(801)

            testFlow.emit("five")
        }
    }

}