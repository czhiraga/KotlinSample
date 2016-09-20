package co.cyberz.fox.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.cyberz.fox.Fox
import co.cyberz.fox.service.FoxEvent

class MainActivity : AppCompatActivity() {

    private val userId = "Garhira"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Fox.trackInstall()

        val event = FoxEvent("会員登録", 5473)
        event.buid = userId
        Fox.trackEvent(event)

    }

    override fun onResume() {
        super.onResume()
        // セッション計測
        Fox.trackSession()
        // リエンゲージメント計測
        Fox.trackDeeplinkLaunch(this)
    }
}
