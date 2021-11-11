package com.example.campaign.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.campaign.R
import com.example.campaign.campaign_data
import kotlinx.android.synthetic.main.itemview_campaign.view.*

class recyclerAdapter(var data:ArrayList<campaign_data>): RecyclerView.Adapter<recyclerAdapter.ViewHolder>() {
    class ViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        val nam=itemview.data1
        val credit=itemview.data2
        val customer=itemview.data3
        val dat=itemview.data4


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.itemview_campaign,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var one=data.get(position).name
        var two=data.get(position).credits
        var three=data.get(position).customers
        var four=data.get(position).date

        holder.nam.text=one
        holder.credit.text=two
        holder.customer.text=three
        holder.dat.text=four


    }

    override fun getItemCount(): Int {
        return data.size
    }
}