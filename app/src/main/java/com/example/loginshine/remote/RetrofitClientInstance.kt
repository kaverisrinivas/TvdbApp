package com.example.loginshine.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
class RetrofitClientInstance {
    companion object
    {

        private val BASE_URL:String
            get() = "https://api.thetvdb.com"

        fun getRetrofit(): Retrofit? {
            var retrofit:Retrofit?=null
            if (retrofit == null) {

                val interceptor = HttpLoggingInterceptor()
                interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
                val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

                retrofit = retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit
        }   
    }

}
