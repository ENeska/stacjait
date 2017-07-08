package pl.training.stacjait

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

class EventsListAdapter(val events: List<String>) : RecyclerView.Adapter<EventsListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = events[position]
    }

    override fun getItemCount() = events.size

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

}