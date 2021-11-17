package com.example.campaign.Camapaign

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.*
import androidx.activity.OnBackPressedCallback
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.fragment.app.DialogFragment
import com.example.campaign.R
import kotlinx.android.synthetic.main.dialog_header.view.*
import kotlinx.android.synthetic.main.dialog_new_campaign.*
import kotlinx.android.synthetic.main.dialog_new_campaign.view.*


class Dialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        getDialog()!!.getWindow()?.setBackgroundDrawableResource(R.drawable.indicator)
        getDialog()?.setCanceledOnTouchOutside(false)
        var view = inflater.inflate(R.layout.dialog_new_campaign, container, false)

        view.New1.setText(R.string.New_Campaign)

        view.cross_delete1.setOnClickListener {
            dialog?.dismiss()
        }

        view.select.setOnClickListener {

            view.reason.isVisible=true
            view.reason1.isVisible=true
            view.select.isVisible=false

        }

        view.select_spinner.setOnClickListener {
            Select_Customers().show(requireFragmentManager(), "Select Customers")
        }
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {

                    // Leave empty do disable back press or
                    // write your code which you want
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(
            this,
            callback
        )

        return view
    }


    override fun onStart() {
        super.onStart()

        //we can
        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
//        val height = (resources.displayMetrics.heightPixels * 1.00).toInt()

        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog!!.window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE or WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)
    }


}
