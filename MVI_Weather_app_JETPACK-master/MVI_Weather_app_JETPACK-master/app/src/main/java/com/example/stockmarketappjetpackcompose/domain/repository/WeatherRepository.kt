package com.example.stockmarketappjetpackcompose.domain.repository

import com.example.stockmarketappjetpackcompose.domain.util.Resource
import com.example.stockmarketappjetpackcompose.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}