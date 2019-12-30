/*package com.example.loginshine.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.loginshine.R
import com.example.loginshine.adapters.EpisodeAdapter.EpisodeViewHolder
import com.example.loginshine.model.EpisodeData
import java.util.ArrayList

class EpisodeAdapter : RecyclerView.Adapter<EpisodeViewHolder>() {


    private val list = ArrayList<EpisodeData>()



    fun setList(list: EpisodeData) {
        this.list.clear()
        if (list != null) {
            this.list.addAll(listOf(list))
        }
        notifyDataSetChanged()
    }

    class EpisodeViewHolder(mView: View) : RecyclerView.ViewHolder(mView) {
        var txtTitle: TextView = mView.findViewById(R.id.text_view_episode)
    }

    override fun onBindViewHolder(holder: EpisodeViewHolder, position: Int) {
        holder.txtTitle.text = list[position].getepisodeName()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EpisodeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_episode_list, parent, false)
        return EpisodeViewHolder(view)
    }
    override fun getItemCount(): Int {
        return list.size
    }
}*/



