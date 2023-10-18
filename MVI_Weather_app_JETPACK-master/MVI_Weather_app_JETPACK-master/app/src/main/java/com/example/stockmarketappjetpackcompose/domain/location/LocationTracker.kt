package com.example.stockmarketappjetpackcompose.domain.location

import android.location.Location

interface LocationTracker {

    suspend fun getCurrentLocation(): Location?

}