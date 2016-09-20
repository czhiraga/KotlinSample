package co.cyberz.fox.kotlin

import android.app.Application
import android.os.Bundle
import co.cyberz.fox.FoxConfig

/**
 * Created by Garhira on 2016/09/20.
 */
class KotlinApplication : Application() {

    private val FOX_APP_ID = 12345
    private val FOX_APP_KEY = "APP_KEY"
    private val FOX_APP_SALT = "APP_SALT"

    override fun onCreate() {
        super.onCreate()

        FoxConfig(this, FOX_APP_ID, FOX_APP_KEY, FOX_APP_SALT)
                .addDebugOption(true)
                .addDebugOption(BuildConfig.DEBUG)
                .activate()
    }
}