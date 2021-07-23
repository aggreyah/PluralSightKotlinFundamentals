package com.aggreyah

import java.util.*

class Meeting{
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>){
    val m = Meeting()
//    m.Title = "Board Meeting"
//    m.When = Date(2017, 1, 1)
//    m.Who.add("Kevin")
    with(m){
        m.Title = "Board Meeting"
        m.When = Date(2017, 1, 1)
        m.Who.add("Kevin")
    }

    m.apply { m.Title = "Board Meeting"
        m.When = Date(2020, 1, 1)
        m.Who.add("Henry")
    }.create()
}