package com.example.stockmarketappjetpackcompose.presentation

import com.example.stockmarketappjetpackcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
