package com.example.campaign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.campaign.Adapter.recyclerAdapter
import kotlinx.android.synthetic.main.fragment_campaign.view.*

class campaign : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_campaign, container, false)
        var array:ArrayList<String> = arrayListOf("Filter","Filter1","Filter2","Filter3","Filter4")

        var SPINNER=view.spinner
        var adapaterspinner=ArrayAdapter<String>(view.context,android.R.layout.simple_spinner_item)

        adapaterspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)


        val data=campaign_data("Diwilisale","2","1","06:02 pm, 21 Oct 2019")
        val data1=campaign_data("Dusara","1","0","01:03 pm, 18 Oct 2018")
        val data2=campaign_data("R","1","0","11:27 am, 18 Oct 2018")
        val data3=campaign_data("R","1","0","11:27 am, 18 Oct 2018")


        var a=ArrayList<campaign_data>()
        a.add(data)
        a.add(data1)
        a.add(data2)
        a.add(data3)
        a.add(data)
        a.add(data1)
        a.add(data2)
        a.add(data3)
        a.add(data2)
        a.add(data3)
        a.add(data)
        a.add(data1)
        a.add(data)
        a.add(data1)
        a.add(data2)
        a.add(data3)


        var adpater=recyclerAdapter(a)
        view.recyclerview_campaign.adapter=adpater




        return view
    }


}
