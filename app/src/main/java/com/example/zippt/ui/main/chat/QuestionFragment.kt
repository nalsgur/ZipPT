package com.example.zippt.ui.main.chat

import androidx.navigation.fragment.findNavController
import com.example.zippt.BaseFragment
import com.example.zippt.R
import com.example.zippt.databinding.FragmentQuestionBinding


class QuestionFragment(): BaseFragment<FragmentQuestionBinding>(FragmentQuestionBinding::inflate) {
    override fun initAfterBinding() {
        binding.questionBackbtn.setOnClickListener {
            findNavController().navigate(R.id.chatFragment)
        }
    }


}