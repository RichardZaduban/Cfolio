package com.zaduban.cfolio.register.model

import com.google.gson.annotations.SerializedName

data class RegisterModel(
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("email")
    val description: String,
    @SerializedName("password")
    val answer: String
)
