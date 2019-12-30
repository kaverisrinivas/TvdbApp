package com.example.loginshine

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginshine.model.EpisodeData
import com.example.loginshine.remote.GetDataService
import com.example.loginshine.remote.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel : ViewModel() {
    val users=  MutableLiveData<EpisodeData>()

    fun loadUsers() {
        val service = RetrofitClientInstance.getRetrofit()?.create(GetDataService::class.java)
        val call = service?.episodeList(pathId = 12)
        call?.enqueue(object : Callback<EpisodeData>{
            override fun onResponse(call: Call<EpisodeData>, response: Response<EpisodeData>) {
                users.postValue(response.body())
               // Toast.makeText(this,"successful" + response.body()?.episodeName, Toast.LENGTH_LONG).show()
                Log.d("episode", response.body().toString())
            }

            override fun onFailure(call: Call<EpisodeData>, t: Throwable) {
                Log.e("episode", "error",t)
                Log.d("episode","Error - ${t.printStackTrace()}")
            }
        })

    }

}

