package com.example.loginshine.model

import com.google.gson.annotations.SerializedName

data class Data(


@SerializedName("id")
val id : Int,
@SerializedName("airedSeason")
val airedSeason : Int,
@SerializedName("airedSeasonID") val airedSeasonID : Int,
@SerializedName("airedEpisodeNumber") val airedEpisodeNumber : Int,
@SerializedName("episodeName") val episodeName : String,
@SerializedName("firstAired") val firstAired : String,
@SerializedName("guestStars") val guestStars : List<String>,
@SerializedName("directors") val directors : List<String>,
@SerializedName("writers") val writers : List<String>,
@SerializedName("overview") val overview : String,
@SerializedName("language") val language : Language,
@SerializedName("productionCode") val productionCode : String,
@SerializedName("showUrl") val showUrl : String,
@SerializedName("lastUpdated") val lastUpdated : Int,
@SerializedName("dvdDiscid") val dvdDiscid : String,
@SerializedName("dvdSeason") val dvdSeason : Int,
@SerializedName("dvdEpisodeNumber") val dvdEpisodeNumber : Int,
@SerializedName("dvdChapter") val dvdChapter : String,
@SerializedName("absoluteNumber") val absoluteNumber : String,
@SerializedName("filename") val filename : String,
@SerializedName("seriesId") val seriesId : Int,
@SerializedName("lastUpdatedBy") val lastUpdatedBy : Int,
@SerializedName("airsAfterSeason") val airsAfterSeason : String,
@SerializedName("airsBeforeSeason") val airsBeforeSeason : String,
@SerializedName("airsBeforeEpisode") val airsBeforeEpisode : String,
@SerializedName("imdbId") val imdbId : String,
@SerializedName("contentRating") val contentRating : String,
@SerializedName("thumbAuthor") val thumbAuthor : Int,
@SerializedName("thumbAdded") val thumbAdded : String,
@SerializedName("thumbWidth") val thumbWidth : Int,
@SerializedName("thumbHeight") val thumbHeight : Int,
@SerializedName("siteRating") val siteRating : Double,
@SerializedName("siteRatingCount") val siteRatingCount : Int,
@SerializedName("isMovie") val isMovie : Int

)

