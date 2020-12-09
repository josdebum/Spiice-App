package com.example.spiiceapp.ui.message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spiiceapp.MessageListAdapter
import com.example.spiiceapp.Messages
import com.example.spiiceapp.R
import kotlinx.android.synthetic.main.fragment_message.*


class MessageFragment : Fragment() {
    private var mAdapter: MessageListAdapter? = null
    private var messageList: ArrayList<Messages>? = arrayListOf()
   // private var layoutManager: RecyclerView.LayoutManager? = null

    private var mLayoutManager: RecyclerView.LayoutManager? = null



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

       // messageList = ArrayList<Messages>()
        mLayoutManager = LinearLayoutManager(this.context)
        mAdapter = this.context?.let { MessageListAdapter(messageList!!, it) }

        return inflater.inflate(R.layout.fragment_message, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        message_recycler.apply {
            layoutManager = mLayoutManager
            adapter = mAdapter
            messageList!!.add(Messages("Alex Marchal", "I have some questions about...", R.drawable.avatar))
            messageList!!.add(Messages("Norma Wilson", "http://www.warephase.com", R.drawable.kylie_avatar))
            messageList!!.add(Messages("Morris Murphy", "Hope it will work in the week...", R.drawable.morris_avatar))
            messageList!!.add(Messages("Kylie Lane", "Thank you! It really shine with...", R.drawable.ted_avatar))
            messageList!!.add(Messages("Ted Steward", "Yes I know", R.drawable.wade_avatar))
            messageList!!.add(Messages("Wade Mccoy", "It will be online in 2 days", R.drawable.norma_avatar))
            messageList!!.add(Messages("Alex Marchal", "I have some questions about...", R.drawable.avatar))
            messageList!!.add(Messages("Norma Wilson", "http://www.warephase.com", R.drawable.kylie_avatar))
            messageList!!.add(Messages("Morris Murphy", "Hope it will work in the week...", R.drawable.morris_avatar))
            messageList!!.add(Messages("Kylie Lane", "Thank you! It really shine with...", R.drawable.ted_avatar))
            messageList!!.add(Messages("Ted Steward", "Yes I know", R.drawable.wade_avatar))
            messageList!!.add(Messages("Wade Mccoy", "It will be online in 2 days", R.drawable.norma_avatar))

        }
    }
}