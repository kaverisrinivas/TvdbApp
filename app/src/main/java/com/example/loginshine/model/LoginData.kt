package com.example.loginshine.model

import com.google.gson.annotations.SerializedName

data class LoginData (

    @SerializedName("token")
     var token: String? = null
)