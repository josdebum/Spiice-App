package com.example.spiiceapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SalesPitchFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_sales_pitch, container, false)

    companion object {
        fun  newInstance(context: Context) =  Fragment.instantiate(context,SalesPitchFragment::class.java.name)
    }
}