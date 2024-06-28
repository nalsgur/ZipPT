package com.example.zippt.ui.main.like

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zippt.databinding.ItemLikeBinding

class LikeRVAdapter (private val dataList: List<String>): RecyclerView.Adapter<LikeRVAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemLikeBinding = ItemLikeBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size


    inner class ViewHolder(val binding: ItemLikeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(string: String){
            binding.nameTv.text = string
            binding.nameTv2.text = string
        }
    }

}