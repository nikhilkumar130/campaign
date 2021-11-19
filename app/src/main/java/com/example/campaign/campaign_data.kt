package com.example.campaign


data class campaign_data(
    var name: String,
    var credits: String,
    var customers: String,
    var date: String
)

data class customer_data(var Name: String, var Number: String)

class Data {


    companion object {
        var customer = customer_data("vsk", "1")
        var customer1 = customer_data("Kiran", "2")
        var customer2 = customer_data("Guest", "3")
        var customer3 = customer_data("Krishna", "4")
        var customer4 = customer_data("Venketesh", "5")
        var array = ArrayList<customer_data>()


    }

}


