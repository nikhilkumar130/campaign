package com.example.campaign.Camapaign

import android.content.DialogInterface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.DialogFragment
import com.example.campaign.Adapter.New_campaign_Select_customers
import com.example.campaign.Data
import com.example.campaign.R
import com.example.campaign.customer_data
import kotlinx.android.synthetic.main.dialog_header.view.*
import kotlinx.android.synthetic.main.dialog_new_campaign.view.*
import kotlinx.android.synthetic.main.select_customers.view.*

class Select_Customers : DialogFragment() {

    lateinit var selected_customers: New_campaign_Select_customers

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.setCanceledOnTouchOutside(false)
        val view = inflater.inflate(R.layout.select_customers, container, false)


        selected_customers = New_campaign_Select_customers(Data.array)
        


        view.recyclerview_Select_Customers.adapter = selected_customers

        view.New1.setText(R.string.Select_customers)


        var select = view.select_all_checkbox
        select.setOnClickListener {
            if (select.isChecked) {
                selected_customers.checkbox(select.isChecked)
            } else {
                selected_customers.checkbox(false)
            }
        }

        var clear_selection = view.clear_selections_customers
        clear_selection.setOnClickListener {
            if (select.isChecked) {
                select.toggle()
                selected_customers.checkbox(false)
            }
        }


        //textWatcher
        var text: ArrayList<customer_data> = arrayListOf()
        view.searchView_customers.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                text.clear()
                if (s!!.isEmpty()) {
                    selected_customers = New_campaign_Select_customers(Data.array)
                    view.recyclerview_Select_Customers.adapter = selected_customers
                } else {
                    for (a in Data.array) {
                        if (a.Name.lowercase().contains(s.toString().lowercase())) {
                            text.add(a)
                            selected_customers = New_campaign_Select_customers(text)
                            view.recyclerview_Select_Customers.adapter = selected_customers

                        }
                    }
                }

            }

            override fun afterTextChanged(s: Editable?) {}

        })


        view.cross_delete1.setOnClickListener {
            dialog?.dismiss()
        }
        return view
    }


    override fun onStart() {
        super.onStart()

        //we can
//        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
//        val height = (resources.displayMetrics.heightPixels * 1.00).toInt()
//
//        dialog!!.window?.setLayout(width,height)
        dialog!!.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE or WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)
    }

}
