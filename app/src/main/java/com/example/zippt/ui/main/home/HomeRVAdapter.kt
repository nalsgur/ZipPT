package com.example.zippt.ui.main.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zippt.databinding.ItemHomeBinding

class HomeRVAdapter (private val dataList: List<String>): RecyclerView.Adapter<HomeRVAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemHomeBinding = ItemHomeBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.askButton.setOnClickListener {
        }
        holder.binding.detailButton.setOnClickListener {

        }
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size


    inner class ViewHolder(val binding: ItemHomeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(string: String){
            binding.trainerName.text = string
        }
    }

}