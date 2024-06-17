package com.example.data

import com.example.data.model.City
import com.example.reisebuero.R

class Datasource {

    fun loadCities(): List<City> {
        return listOf(
            City("New York", R.drawable.city_01),
            City("London", R.drawable.city_02),
            City("Tokyo", R.drawable.city_03),
            City("Paris", R.drawable.city_04),
            City("Berlin", R.drawable.city_05),
            City("Sydney", R.drawable.city_06),
            City("Rome", R.drawable.city_07),
            City("Madrid", R.drawable.random_city),
            City("Moscow", R.drawable.city_01),
            City("Beijing", R.drawable.city_02),
            City("Cairo", R.drawable.city_03),
            City("Istanbul", R.drawable.city_04),
            City("Dubai", R.drawable.city_05),
            City("Toronto", R.drawable.city_06),
            City("S Paulo", R.drawable.city_07),
            City("Mexico City", R.drawable.random_city),
            City("Los Angeles", R.drawable.city_01),
            City("Hg Kong", R.drawable.city_02),
            City("Mumbai", R.drawable.city_03),
            City("Bangkok", R.drawable.city_04),
            City("Ben Aires", R.drawable.city_05),
            City("Ce Town", R.drawable.city_06),
            City("Nairobi", R.drawable.city_07),
            City("Seoul", R.drawable.random_city),
            City("Singapore", R.drawable.city_01),
            City("Vienna", R.drawable.city_02),
            City("Amsterdam", R.drawable.city_03),
            City("Zurich", R.drawable.city_04),
            City("Rio dejaneiro", R.drawable.city_05),
            City("Lisbon", R.drawable.city_06),
            City("KualaLumpur", R.drawable.city_07),
            City("Jakarta", R.drawable.random_city),
            City("Helsinki", R.drawable.city_01),
            City("Dublin", R.drawable.city_02),
            City("Prague", R.drawable.city_03)
        )
    }
}