package com.example.cardviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.cardviewexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding : FragmentSecondBinding?=null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.button8.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToSeventhFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.button7.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.button6.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFourthFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.button5.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFifthFragment()
            Navigation.findNavController(it).navigate(action)
        }
        binding.button3.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToSixthFragment()
            Navigation.findNavController(it).navigate(action)
        }

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

}