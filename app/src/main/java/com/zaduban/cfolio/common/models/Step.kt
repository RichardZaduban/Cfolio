package com.zaduban.cfolio.common.models

import com.google.gson.annotations.SerializedName

data class Step(
    @SerializedName("stepName")
    val stepName: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("resourceId")
    val layoutResourceId: Int,

)
