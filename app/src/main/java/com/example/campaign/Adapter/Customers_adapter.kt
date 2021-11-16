package com.example.campaign.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.campaign.R
import com.example.campaign.customer_data
import kotlinx.android.synthetic.main.itemview_customers.view.*

class Customers_adapter(var dat: ArrayList<customer_data>) :
    RecyclerView.Adapter<Customers_adapter.ViewHolder>(){



    var isALlselect:Boolean=false

    fun selectall(check:Boolean){
        isALlselect=check
        notifyDataSetChanged()
    }






    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameTv = itemView.Customer_name
        var numberTv = itemView.Customer_number
        var checkbox = itemView.customers_checkbox


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.itemview_customers, parent, false)



        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var nam = dat.get(position).Name
        var num = dat.get(position).Number


        holder.nameTv.text = nam
        holder.numberTv.text = num
        holder.checkbox.setChecked(isALlselect)


    }

    override fun getItemCount(): Int {
        return dat.size
    }
}