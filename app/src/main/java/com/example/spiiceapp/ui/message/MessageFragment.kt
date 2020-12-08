package com.example.spiiceapp.ui.message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spiiceapp.Messages
import com.example.spiiceapp.R
import kotlinx.android.synthetic.main.fragment_message.*


class MessageFragment : Fragment() {
    private var adapter: MessageListAdapter? = null
    private var messageList: ArrayList<Messages>? = null
   // private var layoutManager: RecyclerView.LayoutManager? = null

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: MessageListAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {



        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false)

        messageList = ArrayList<Messages>()
        layoutManager = LinearLayoutManager(this.context)
        adapter = MessageListAdapter(messageList!!, this)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        message_recycler.apply {

            message_recycler.layoutManager = layoutManager
            message_recycler.adapter = adapter
            messageList!!.add(Messages("Adebayo Apercu", "A selection of chicken dishes served together ...", R.drawable.josdebum))
        }
    }
}