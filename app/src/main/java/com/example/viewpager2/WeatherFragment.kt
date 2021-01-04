package com.example.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_weather.*

class WeatherFragment : Fragment() {
    private var weatherList: ArrayList<String> = arrayListOf("Card a", "Card b", "Card c")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_weather, container, false)

        var rvWeather = view.findViewById<RecyclerView>(R.id.rv_weather)
        rvWeather.adapter = WeatherAdapter(weatherList)
        rvWeather.layoutManager = LinearLayoutManager(activity)
        rvWeather.setHasFixedSize(true)

        return view
    }

}