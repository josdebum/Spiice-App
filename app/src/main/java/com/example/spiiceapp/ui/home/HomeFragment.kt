package com.example.spiiceapp.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spiiceapp.AllProjectActivity
import com.example.spiiceapp.Messages
import com.example.spiiceapp.ProjectActivity
import com.example.spiiceapp.R
import kotlinx.android.synthetic.main.activity_graph.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.fragment_message.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?




    ): View? {




        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)

        rootView.view_all.setOnClickListener(){
            val context= rootView.context
            val intent = Intent( context, AllProjectActivity::class.java)
            context.startActivity(intent)


        }

        rootView.project_card.setOnClickListener(){
            val context= rootView.context
            val intent = Intent( context, ProjectActivity::class.java)
            context.startActivity(intent)


        }




        return rootView
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }}
