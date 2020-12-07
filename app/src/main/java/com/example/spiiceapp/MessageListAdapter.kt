package com.example.spiiceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spiiceapp.ui.message.MessageFragment

class MessageListAdapter(private val list: ArrayList<Messages>,
                         private val context: MessageFragment
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



        init {
            var name: TextView = itemView.findViewById(R.id.name) as TextView
            var message: TextView = itemView.findViewById(R.id.message) as TextView
            var image: ImageView = itemView.findViewById(R.id.profile_picture) as ImageView



            itemView.setOnClickListener {

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}

