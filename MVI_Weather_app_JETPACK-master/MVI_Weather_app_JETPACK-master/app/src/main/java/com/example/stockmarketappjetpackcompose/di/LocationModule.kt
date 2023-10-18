package com.example.stockmarketappjetpackcompose.di

import com.example.stockmarketappjetpackcompose.data.location.DefaultLocationTracker
import com.example.stockmarketappjetpackcompose.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {



    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker): LocationTracker

}