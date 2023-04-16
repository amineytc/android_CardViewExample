package com.example.cardviewexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.cardviewexample.databinding.FragmentFirstBinding

class FirstFragment : Fragment()  {

    private var _binding : FragmentFirstBinding?=null
    private val binding get() = _binding!!

    private lateinit var artArrayList:ArrayList<Art>
    private lateinit var adapter:ArtAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.rvFirst.setHasFixedSize(true)
        binding.rvFirst.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val a1 = Art(1,"Bedroom in Arles","bedroom_in_arles","Vincent Van Gogh")
        val a2 = Art(2,"The Scream","the_scream","Edvard Munch")
        val a3 = Art(3,"Mona Lisa ","mona_lisa","Leonardo Da Vinci")
        val a4 = Art(4,"The Last Supper","the_last_supper","Leonardo Da Vinci")
        val a5 = Art(5,"Study of a Young Woman","study_of_a_young_woman","Johannes Vermeer")
        val a6 = Art(6,"Girl with a Pearl Earring","girl_with_a_pearl_earring","Johannes Vermeer")
        val a7 = Art(7,"The Kiss","the_kiss","Gustav Klimt")
        val a8 = Art(8,"Death and Life ","death_and_life","Gustav Klimt")

        artArrayList = ArrayList<Art>()
        artArrayList.add(a1)
        artArrayList.add(a2)
        artArrayList.add(a3)
        artArrayList.add(a4)
        artArrayList.add(a5)
        artArrayList.add(a6)
        artArrayList.add(a7)
        artArrayList.add(a8)

        adapter = ArtAdapter(requireContext(),artArrayList)
        binding.rvFirst.adapter= adapter

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}