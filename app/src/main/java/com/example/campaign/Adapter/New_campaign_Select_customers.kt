package com.example.campaign.Adapter

import android.view.InflateException
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.campaign.R
import com.example.campaign.customer_data
import kotlinx.android.synthetic.main.itemview_select_customers.view.*
import java.util.zip.Inflater

class New_campaign_Select_customers(var store: ArrayList<customer_data>) :
    RecyclerView.Adapter<New_campaign_Select_customers.ViewHolder>() {

    var check:Boolean=false
    fun checkbox(Box:Boolean){
        check=Box
        notifyDataSetChanged()
    }

    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var customer_name = itemview.Customer_name1
        var customer_number = itemview.Customer_number1
        var customer_checkbox=itemview.select_customers_checkbox

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemview_select_customers, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var Customer_Name = store[position].Name
        var Customer_Number=store[position].Number


        holder.customer_name.text=Customer_Name
        holder.customer_number.text=Customer_Number
        holder.customer_checkbox.setChecked(check)

    }

    override fun getItemCount(): Int {
        return store.size
    }
}