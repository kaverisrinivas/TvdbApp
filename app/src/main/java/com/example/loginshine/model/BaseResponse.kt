package com.example.loginshine.model
import com.google.gson.annotations.SerializedName

data class BaseResponse(
        @SerializedName("data")
        val data : Data
)