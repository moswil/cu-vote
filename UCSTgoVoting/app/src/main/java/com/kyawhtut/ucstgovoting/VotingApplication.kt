package com.kyawhtut.ucstgovoting

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import cat.ereza.customactivityoncrash.config.CaocConfig
import shortbread.Shortbread
import timber.log.Timber
import timber.log.Timber.DebugTree

class VotingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
        Shortbread.create(this)
        CaocConfig.Builder.create()
                .showErrorDetails(BuildConfig.DEBUG)
                .apply()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

}