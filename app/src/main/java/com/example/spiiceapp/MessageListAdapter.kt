package com.example.spiiceapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spiiceapp.MessageListAdapter.ViewHolder
import com.example.spiiceapp.ui.message.MessageFragment

class MessageListAdapter( private val list: ArrayList<Messages>,
private val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(messages: Messages) {
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView
            var image: ImageView = itemView.findViewById(R.id.profile_picture) as ImageView

            name.text = messages.name
            message.text = messages.message
            image.setImageResource(messages.image)


            itemView.setOnClickListener {

            }

        }}


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                LayoutInflater.from(context).inflate(R.layout.message_recycler_item, parent, false)

            return ViewHolder(view)
        }


        override fun getItemCount(): Int {
            return list.size
        }



    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }


}