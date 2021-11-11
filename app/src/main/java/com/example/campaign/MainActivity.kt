package com.example.campaign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
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