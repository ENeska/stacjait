package pl.training.stacjait

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var textView = findViewById(R.id.message) as TextView
        //textView.text = "Kotlin"

        message.text = "Kotlin"
        val text = message.text
    }
}
