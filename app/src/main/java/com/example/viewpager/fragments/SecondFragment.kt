package com.example.viewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewpager.adapters.Person
import com.example.viewpager.R
import com.example.viewpager.adapters.RecyclerViewAdapter


class SecondFragment : Fragment() {

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView = root.findViewById(R.id.recyclerView)
        return root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewAdapter = RecyclerViewAdapter(getData())
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = recyclerViewAdapter

    }

    private fun getData(): List<Person> {

        val persons = ArrayList<Person>()

        persons.add(
            Person(
                1,
                "https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_960_720.png",
                "gela",
                "gelaevichi"
            )
        )

        persons.add(
            Person(
                2,
                "https://static.vecteezy.com/system/resources/previews/001/196/558/original/person-png.png",
                "Guka",
                "Plexanovski"
            )
        )

        persons.add(
            Person(
                3,
                "https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_960_720.png",
                "Nazi",
                "Txlashadze"
            )
        )

        persons.add(
            Person(
                1,
                "https://static.vecteezy.com/system/resources/previews/001/196/558/original/person-png.png",
                "gela",
                "gelaevichi"
            )
        )

        persons.add(
            Person(
                1,
                "https://cdn.pixabay.com/photo/2018/08/28/12/41/avatar-3637425_960_720.png",
                "gela",
                "gelaevichi"
            )
        )

        persons.add(
            Person(
                3,
                "https://static.vecteezy.com/system/resources/previews/001/196/558/original/person-png.png",
                "Nazi",
                "Txlashadze"
            )
        )

        return persons


    }

}