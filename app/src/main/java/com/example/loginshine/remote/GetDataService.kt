package com.example.loginshine.remote

import com.example.loginshine.model.BaseResponse
import com.example.loginshine.model.Login
import com.example.loginshine.model.LoginData
import retrofit2.Call
import retrofit2.http.*

interface GetDataService {
  /*  @POST("/login")
    fun createLogin(@Body login: Login): Call<LoginData>*/
    @Headers("Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1Nzg5ODUwNjMsImlkIjoiVFZEQiIsIm9yaWdfaWF0IjoxNTc4MzgwMjYzLCJ1c2VyaWQiOjIyNDU2MDAsInVzZXJuYW1lIjoia2F2ZXJpIG5pdGh5YSJ9.SACKcl2XbZlUnOaGMbdjKgkRBo3cS0AKQuTW-ezWq_TxiH9MeWIu8l5wfINdGRqH9rbeL0SzgWqgPiUK2nqHvo-hcZBbdSYNQKV3t03dc0AzQ_iZ4hkxtPD5PIz7gm7Sr3PlQl-KJQX22OYm5UAVVJrYZVD7bblKABUJQnmWTwJrtNOSsk_lE9PDRiAjaw7zKoqLr-SJmJYCrKDn4Es-r5jI02DJbVgvUyhgvRX-mAXO0oaftgptc-oxOFnWc2d68YHXdUvyxLrWJ5bRMlMtK7EdXjfzpW2u529uUgBrGBbKdVymhJ-6gL8uIZOgsIjvaALri8Cxp1ZvUUd5HBjWJw")
   @GET("/episodes/{id}")
  fun episodeList(@Path ("id") pathId: Int): Call<BaseResponse>
  //  @GET("/languages/{id}")
    //fun singleLanguage(@Path ("id") pathId: Int): Call<>
   /* @GET("/languages")
    fun languageList(): Call<List<LanguageList>>*/
}