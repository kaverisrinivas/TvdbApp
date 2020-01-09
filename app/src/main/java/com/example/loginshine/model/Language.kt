package com.example.loginshine.model

import com.google.gson.annotations.SerializedName

data class Language(
        @SerializedName("episodeName") val episodeName : String,
        @SerializedName("overview") val overview : String
)