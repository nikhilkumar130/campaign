package com.example.campaign.Customer

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Checkable
import android.widget.Toast
import com.example.campaign.Adapter.Customers_adapter
import com.example.campaign.Data
import com.example.campaign.Data.Companion.customer
import com.example.campaign.Data.Companion.customer1
import com.example.campaign.Data.Companion.customer2
import com.example.campaign.Data.Companion.customer3
import com.example.campaign.Data.Companion.customer4
import com.example.campaign.R
import com.example.campaign.customer_data
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
        var view = inflater.inflate(R.layout.fragment_customers, container, false)

        view.addcustomer.setOnClickListener {
            New_Customer_Dialog().show(requireFragmentManager(), "New Customer")
        }
        view.clear_selection.setOnClickListener {
            Toast.makeText(view.context, "qwertyuiop", Toast.LENGTH_SHORT).show()
            !view.select_all_checkbox_customers.isChecked
        }
        Data.array.add(customer)
        Data.array.add(customer)
        Data.array.add(customer1)
        Data.array.add(customer2)
        Data.array.add(customer3)
        Data.array.add(customer4)
        Data.array.add(customer1)
        Data.array.add(customer)
        Data.array.add(customer2)
        Data.array.add(customer3)
        Data.array.add(customer)
        Data.array.add(customer)
        Data.array.add(customer1)
        Data.array.add(customer2)
        Data.array.add(customer3)
        Data.array.add(customer4)
        Data.array.add(customer1)
        Data.array.add(customer)
        Data.array.add(customer2)
        Data.array.add(customer3)






        var adpater = Customers_adapter(Data.array)
        view.recyclerview_customer.adapter = adpater

        var select = view.select_all_checkbox_customers
//        if(select.isChecked){
//            Customers_adapter(array).dat[0].checkbox.isChecked
//        }


        var FilteredList: ArrayList<customer_data> = arrayListOf()

        view.searchView.addTextChangedListener(object :
            TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                FilteredList.clear()

                if (s!!.isEmpty()) {
                    var adpater = Customers_adapter(Data.array)
                    view.recyclerview_customer.adapter = adpater
                } else {
                    for (obj in Data.array) {
                        if (obj.Name.lowercase().contains(s.toString().lowercase())) {
                            FilteredList.add(obj)
                            var adpater = Customers_adapter(FilteredList)
                            view.recyclerview_customer.adapter = adpater
                        }


                    }
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })

        return view

    }

}