package com.geektech.BasePict.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.geektech.BasePict.Const.load
import com.geektech.BasePict.databinding.ItemPicksBinding
import com.geektech.BasePict.ui.Image
import com.geektech.BasePict.ui.picksModel

class MainAdapter:
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    private var list = arrayListOf<picksModel>()
    val selectedList = ArrayList<String>()


    inner class ViewHolder (private var binding: ItemPicksBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun Bind(picksModel: picksModel) {
            fun bind(image: Image) = with(binding) {
                imageviewPics.load(image.image)
                itemView.setOnClickListener {
                    if (image.bool) {
                        image.bool = false
                        background.isVisible = true
                        selectedList.add(image.image)
                    } else {
                        image.bool = true
                        background.isVisible = false
                        selectedList.remove(image.image)
                    }
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPicksBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.Bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size

    }
    fun addList(list: ArrayList<picksModel>) {
        this.list = list
        notifyDataSetChanged()
    }

}



