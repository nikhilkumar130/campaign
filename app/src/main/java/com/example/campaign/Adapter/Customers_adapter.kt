package com.example.campaign.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.campaign.R
import com.example.campaign.customer_data
import kotlinx.android.synthetic.main.itemview_customers.view.*

class Customers_adapter(var dat:ArrayList<customer_data>):RecyclerView.Adapter<Customers_adapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var NAME=itemView.Customer_name
        var NUMBER=itemView.Customer_number

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.itemview_customers,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var nam=dat.get(position).Name
        var num=dat.get(position).Number

        holder.NAME.text=nam
        holder.NUMBER.text=num
    }

    override fun getItemCount(): Int {
        return dat.size
    }
}