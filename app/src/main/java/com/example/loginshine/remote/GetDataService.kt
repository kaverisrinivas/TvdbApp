package com.example.loginshine.remote

import com.example.loginshine.model.EpisodeData
import com.example.loginshine.model.Login
import com.example.loginshine.model.LoginData
import retrofit2.Call
import retrofit2.http.*

interface GetDataService {
/*
    @POST("/login")
    fun createLogin(@Body login: Login): Call<LoginData>*/
    @Headers("Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NzgyOTQ5OTEsImlkIjoiVFZEQiIsIm9yaWdfaWF0IjoxNTc3MTgwMDM5LCJ1c2VyaWQiOjIyNDU2MDAsInVzZXJuYW1lIjoia2F2ZXJpIG5pdGh5YSJ9.AQe-X9J83kii4MQ1aqdEfHidtEePWZbJK4VKBC6kuNk0VmUNg96EeGw8yrpbk3eGPPPq6ZUEP6QfLccPSEIm5aBQbO9cByRtHuwTqPid60YxlWp9727QM7OVKyHxM-pw3Q9YqHIk2XNLyMmCOIx0Pw8C3TxVOPYNbmQ8DQ2aM35LlG8mP9NF9gYuya5Ph2axMtufpSob_sfBWP20lT50Ot8R7iemVhM335m8E6ix55MqKvtG9c0N5itwPepefOgd0uEIhE9u4H1sYSN0gCNE9t8vXnL7gGytsUW66JnBo0W-i-Iqhsi1gxLbX5w6i-UEaJCM5jgN5ZUsEcgfQ1bn2w" )
    @GET("/episodes/{id}")
    fun episodeList(@Path ("id") pathId: Int): Call<EpisodeData>
   // Call<POJO_Class> getExampleMethod(@Header("Authorization") String token, @Query("id") String id)

}