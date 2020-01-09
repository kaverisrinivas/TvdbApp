package com.example.loginshine

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginshine.model.BaseResponse
import com.example.loginshine.model.Data
import com.example.loginshine.remote.GetDataService
import com.example.loginshine.remote.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyViewModel : ViewModel() {
    val users=  MutableLiveData<BaseResponse>()
    val dataObject = MutableLiveData<Data>()
    var _dataObject : LiveData<Data> = dataObject

    fun loadUsers() {
        val service = RetrofitClientInstance.getRetrofit()?.create(GetDataService::class.java)
        val call = service?.episodeList(pathId = 12)
        call?.enqueue(object : Callback<BaseResponse>{
            override fun onResponse(call: Call<BaseResponse>, response: Response<BaseResponse>) {
                users.postValue(response.body())
                dataObject.postValue(response.body()?.data)
               // Toast.makeText(this,"successful" + response.body()?.episodeName, Toast.LENGTH_LONG).show()
                Log.d("episode", response.body().toString())
            }

            override fun onFailure(call: Call<BaseResponse>, t: Throwable) {
                Log.e("episode", "error",t)
                Log.d("episode","Error - ${t.printStackTrace()}")
            }
        })



    }

}

