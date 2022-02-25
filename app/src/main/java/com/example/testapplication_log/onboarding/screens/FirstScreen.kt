package com.example.testapplication_log.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.testapplication_log.R
import com.example.testapplication_log.databinding.FragmentFirstScreenBinding

class FirstScreen : Fragment() {
    private var _binding: FragmentFirstScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.loginbtn.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view



    }

}