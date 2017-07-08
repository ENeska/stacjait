package pl.training.stacjait

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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
    }

}
