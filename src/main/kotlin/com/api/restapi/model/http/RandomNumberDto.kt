package com.api.restapi.model.http

data class RandomNumberDto(

    var gameCount:String? = null,
    var gameNumberList: MutableList<Int>? = null
)