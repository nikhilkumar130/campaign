package com.example.campaign.Customer

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import com.example.campaign.R
import kotlinx.android.synthetic.main.add_customer_dialog.*
import kotlinx.android.synthetic.main.add_customer_dialog.view.*
import kotlinx.android.synthetic.main.dialog_header.view.*
import java.text.SimpleDateFormat
import java.util.*

class New_Customer_Dialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.setCanceledOnTouchOutside(false)
        var view = inflater.inflate(R.layout.add_customer_dialog, container, false)

        view.cross_delete1.setOnClickListener {
            dialog?.dismiss()
        }
        view.New1.setText(R.string.Add_customer)

        val cal = Calendar.getInstance()

        val dateListener =
            DatePickerDialog.OnDateSetListener { datePicker, year: Int, month: Int, day: Int ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, month)
                cal.set(Calendar.DAY_OF_MONTH, day)
                val sdf = SimpleDateFormat("dd-MM-yyyy", Locale.US)
                view.DOB_edittext.setText(sdf.format(cal.time))
            }

        view.calendar.setOnClickListener {
            DatePickerDialog(
                view.context,
                dateListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        return view
    }

    override fun onStart() {
        super.onStart()

        //we can
        val width = (resources.displayMetrics.widthPixels * 1.00).toInt()
//        val height = (resources.displayMetrics.heightPixels * 1.00).toInt()

        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog!!.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE or WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)

    }
}
