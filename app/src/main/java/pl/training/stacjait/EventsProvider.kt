package pl.training.stacjait

import android.util.Log
import java.net.URL

class EventsProvider(val url: String) {

    fun get() {
        val json = URL(url).readText()
        Log.d(javaClass.simpleName, json)
    }

}