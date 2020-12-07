package com.example.spiiceapp.ui.home

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
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import kotlinx.android.synthetic.main.activity_graph.*
import kotlinx.android.synthetic.main.fragment_message.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?




    ): View? {




        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_home, container, false)


        return rootView
    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {


                    fun setBarChart() {
                        val entries = ArrayList<BarEntry>()
                        entries.add(BarEntry(8f, 0))
                        entries.add(BarEntry(2f, 1))
                        entries.add(BarEntry(5f, 2))
                        entries.add(BarEntry(20f, 3))
                        entries.add(BarEntry(15f, 4))
                        entries.add(BarEntry(19f, 5))

                        val barDataSet = BarDataSet(entries as List<BarEntry>?, "Cells")

                        val labels = ArrayList<String>()
                        labels.add("18-Jan")
                        labels.add("19-Jan")
                        labels.add("20-Jan")
                        labels.add("21-Jan")
                        labels.add("22-Jan")
                        labels.add("23-Jan")
                        val data = BarData(labels, barDataSet)
                        barChart.data = data // set the data and list of lables into chart

                        barChart.setDescription("Set Bar Chart Description")  // set the description

                        //barDataSet.setColors(ColorTemplate.COLORFUL_COLORS)
                        barDataSet.color = resources.getColor(R.color.colorAccent)

                        barChart.animateY(5000)
                    }



                }
            }


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }
}