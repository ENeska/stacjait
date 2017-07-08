package pl.training.stacjait

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    private val eventsUrl = "http://213.32.66.195:8080/events.json"

    private val events = listOf(
            "Python - szybki start",
            "Kotln w praktyce",
            "Excel dla zaawansowanych"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eventsList = events_list
        eventsList.layoutManager = LinearLayoutManager(this)
        eventsList.adapter = EventsListAdapter(events)

        doAsync {
            EventsProvider(eventsUrl).get()
            uiThread {
                toast("Request completed")
            }
        }
    }

}
