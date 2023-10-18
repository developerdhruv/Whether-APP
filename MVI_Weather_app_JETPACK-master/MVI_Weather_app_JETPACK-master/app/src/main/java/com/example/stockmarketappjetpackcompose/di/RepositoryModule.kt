package com.example.stockmarketappjetpackcompose.di

import com.example.stockmarketappjetpackcompose.data.location.DefaultLocationTracker
import com.example.stockmarketappjetpackcompose.data.repository.WeatherRepositoryImpl
import com.example.stockmarketappjetpackcompose.domain.location.LocationTracker
import com.example.stockmarketappjetpackcompose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {



    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository

}