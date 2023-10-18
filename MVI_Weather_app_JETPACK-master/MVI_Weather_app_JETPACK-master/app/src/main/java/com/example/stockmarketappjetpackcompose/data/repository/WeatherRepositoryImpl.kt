package com.example.stockmarketappjetpackcompose.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.stockmarketappjetpackcompose.data.mappers.toWeatherInfo
import com.example.stockmarketappjetpackcompose.data.remote.WeatherAPI
import com.example.stockmarketappjetpackcompose.domain.repository.WeatherRepository
import com.example.stockmarketappjetpackcompose.domain.util.Resource
import com.example.stockmarketappjetpackcompose.domain.weather.WeatherInfo
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherAPI
) : WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "Unkown Error")
        }
    }
}