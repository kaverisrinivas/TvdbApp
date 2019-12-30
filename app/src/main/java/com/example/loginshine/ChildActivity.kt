package com.example.loginshine

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginshine.model.LoginData
import com.example.loginshine.remote.GetDataService
import com.example.loginshine.model.Login
import com.example.loginshine.remote.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.loginshine.adapters.EpisodeAdapter
import com.example.loginshine.adapters.OnNoteClickListener
import com.example.loginshine.model.EpisodeData
import kotlinx.android.synthetic.main.fragment_title_screen.*
import org.w3c.dom.Text


class ChildActivity : AppCompatActivity() {

    /*  private var editText: EditText? = null
    var editText1: EditText? = null
    var loginbutton: Button? = null*/

   // private var episodeAdapter: EpisodeAdapter = EpisodeAdapter()
  //  private var recyclerView: RecyclerView? = null
    private var textView: TextView? = null
    private var textView2:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_title_screen)
        textView=findViewById(R.id.tv_text_title)
        textView2=findViewById(R.id.tv_chapter_goal_name)

      //  recyclerView = findViewById(R.id.recycler_view)
      //  recyclerView?.adapter = episodeAdapter
       // recyclerView?.setHasFixedSize(true)
      //  recyclerView?.layoutManager = LinearLayoutManager(this)
        val model = ViewModelProviders.of(this)[MyViewModel::class.java]
        model.loadUsers()
        model.users.observe(this, Observer<EpisodeData> { item ->
                    item.getepisodeName()
                  // episodeAdapter?.setList(list)
                    Log.d("users", "value posted")
                }
        )

        /*val sharedPreference = getSharedPreferences("MySharedPref", Context.MODE_PRIVATE)
        val editor = sharedPreference.edit()
        editor.putString("token", "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1Nzc3ODQ4MzksImlkIjoiVFZEQiIsIm9yaWdfaWF0IjoxNTc3MTgwMDM5LCJ1c2VyaWQiOjIyNDU2MDAsInVzZXJuYW1lIjoia2F2ZXJpIG5pdGh5YSJ9.Cr71V6oatvAauO6qndaLX0m4nhKUL19F8-fhbEXoCR4cu3M91xFEnntQQBgMGFSB-f9mgC4MJ5GRToOAPEJzA-KKxcz5F7Z4WwU-EbSasCWUJeEOu8OoPKnIdPJidBw-lHJ7yYtOYshnqL_6zgM1QtY32q4MXOcd1qnGlQf4ZQsLHUfjKSAp0YyD8BnjJ-SgG6E6oH9_3IISvzTm2L-0jwHalab3Htp_-ILwLCmFFDE9B3o54jObn76qW5q9wpIdA2_dz3mfCqR9haOplMk5JoKS6p9LH6Fl33C7TkkAd0yaNJOhDF6UjoJQ5CAlpkO1ReGwmWMIYrpgP_LUzIgRug")
        editor.commit()*/
    }
}
        /* editText = findViewById(R.id.edit_text)
        editText1 = findViewById(R.id.edit_text2)*/
        /*    loginbutton = findViewById(R.id.login_button)*/
        /*  loginbutton?.setOnClickListener {
                val login = Login("282a106112656704ffe7888b260d9dd1", "kaveri nithya", "5DFC6538F3EF22.29811054")
                val service = RetrofitClientInstance.getRetrofit()?.create(GetDataService::class.java)
                val call = service?.createLogin(login)
                call?.enqueue(object : Callback<LoginData> {
                    override fun onResponse(call: Call<LoginData>, response: Response<LoginData>) {
                        Toast.makeText(applicationContext, "successful" + response.body()?.token, Toast.LENGTH_LONG).show()
                        Log.d("token", response.body()?.token ?: "")
                    }

                    override fun onFailure(call: Call<LoginData>, t: Throwable) {
                        Toast.makeText(this@ChildActivity, "something wrong", Toast.LENGTH_LONG).show()
                    }
                })
            }*/




        /* setupSharedPreferences()
         setupNetworkPermissions()*/








