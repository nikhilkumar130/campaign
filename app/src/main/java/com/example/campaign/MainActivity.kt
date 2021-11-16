package com.example.campaign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.campaign.Camapaign.campaign
import com.example.campaign.Customer.customers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var adapter=Adpater(supportFragmentManager)
        adapter.addfragments(campaign(),"Campaign")
        adapter.addfragments(customers(),"Customers")
        viewpager.adapter=adapter
        tablayout.setupWithViewPager(viewpager)

    }
}