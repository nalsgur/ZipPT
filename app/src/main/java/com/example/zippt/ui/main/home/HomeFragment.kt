package com.example.zippt.ui.main.home

import android.content.Intent
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zippt.BaseFragment
import com.example.zippt.databinding.FragmentHomeBinding

class HomeFragment(): BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {
    override fun initAfterBinding() {
        val dataList = listOf("트레이너 1", "트레이너 2", "트레이너 3", "트레이너 4", "트레이너 5")

        val adapter = HomeRVAdapter(dataList)
        val recyclerView = binding.homeRv
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter



        adapter.setMyItemClickListener(object : HomeRVAdapter.MyItemClickListener {
            override fun goToDetail() {
                val intent = Intent(requireContext(), TrainerProfileActivity::class.java)
                startActivity(intent)
            }


        })
    }


}