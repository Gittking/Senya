package com.ozproject.senya.data

data class Attraction(
    val description:String = "",
    val facts:List<String> = listOf(),
    val id:String = "",
    val imageUrl:String = "",
    val location:Location = Location(),
    val monthToVisit: String = "",
    val titles:String=""
) {

    data class Location(
        val latitude:String = "",
        val longitude:String = ""
    )
}