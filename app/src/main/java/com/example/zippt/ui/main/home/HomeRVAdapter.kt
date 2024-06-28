package com.example.zippt.ui.main.home

import android.annotation.SuppressLint
import android.content.Intent
import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zippt.databinding.ItemHomeBinding
import android.content.Context


class HomeRVAdapter (private val dataList: List<String>): RecyclerView.Adapter<HomeRVAdapter.ViewHolder>() {

    interface MyItemClickListener{
        fun goToDetail()
    }
    private lateinit var mItemClickListener : MyItemClickListener

    fun setMyItemClickListener(itemClickListener: MyItemClickListener){
        mItemClickListener = itemClickListener
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemHomeBinding = ItemHomeBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.askButton.setOnClickListener {
        }
        holder.binding.detailButton.setOnClickListener {
            mItemClickListener.goToDetail()
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