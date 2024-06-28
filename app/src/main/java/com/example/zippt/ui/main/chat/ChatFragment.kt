package com.example.zippt.ui.main.chat

import androidx.navigation.fragment.findNavController
import com.example.zippt.BaseFragment
import com.example.zippt.R
import com.example.zippt.databinding.FragmentChatBinding
import com.example.zippt.databinding.FragmentProfileBinding


class ChatFragment(): BaseFragment<FragmentChatBinding>(FragmentChatBinding::inflate) {
    override fun initAfterBinding() {
        binding.chatAccountName1.setOnClickListener {
            findNavController().navigate(R.id.questionFragment)
        }
    }
}