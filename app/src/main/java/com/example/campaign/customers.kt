package com.example.campaign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.campaign.Adapter.Customers_adapter
import kotlinx.android.synthetic.main.fragment_customers.view.*

class customers : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view= inflater.inflate(R.layout.fragment_customers, container, false)

        var customer=customer_data("vsk","9642592051")
        var customer1=customer_data("Kiran","9654566378")
        var customer2=customer_data("Guest","98765432136")
        var customer3=customer_data("Krishna","9642592051")
        var customer4=customer_data("Venketesh","9642592051")

        var array=ArrayList<customer_data>()
        array.add(customer)
        array.add(customer1)
        array.add(customer2)
        array.add(customer3)
        array.add(customer4)
        array.add(customer1)
        array.add(customer)
        array.add(customer2)
        array.add(customer3)


        var adpater= Customers_adapter(array)
        view.recyclerview_customer.adapter=adpater

        return view

    }

}