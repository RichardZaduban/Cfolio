package com.zaduban.cfolio.login.model

import com.google.gson.annotations.SerializedName

data class LoginModel(
    @SerializedName("email")
    var email: String,
    @SerializedName("password")
    val password: String)
