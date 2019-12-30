package com.example.loginshine.model

import com.google.gson.annotations.SerializedName

data class EpisodeData(
        @SerializedName("id")
        var id:Int?=null,
        @SerializedName("airedSeason")
        var airedSeason:Int?=null,
        @SerializedName("airedSeasonID")
        var airedSeasonID:Int?=null,
        @SerializedName("airedEpisodeNumber")
        var airedEpisodeNumber:Int?=null,
        @SerializedName("episodeName")
        var episodeName:String?=null,
        @SerializedName("firstAired")
        var firstAired:Int?=null,
        @SerializedName("overview")
        var overview:String?=null
)  {
    fun getepisodeName(): String? {
        return episodeName
    }
}
