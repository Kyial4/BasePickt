package com.geektech.BasePict.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.BasePict.databinding.ItemPicksBinding


class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(binding: ItemPicksBinding):RecyclerView.ViewHolder(binding.root){
        fun onBind(picksModel:picksModel){
            itemView.setOnClickListener{
            }
        }
    }
    @SuppressLint("NotifyDataSetChanged")
    private var list= arrayListOf<picksModel>()
    fun addData(list:ArrayList<picksModel>){
        this.list=list
        notifyDataSetChanged()

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(ItemPicksBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
      return list.size
    }
}