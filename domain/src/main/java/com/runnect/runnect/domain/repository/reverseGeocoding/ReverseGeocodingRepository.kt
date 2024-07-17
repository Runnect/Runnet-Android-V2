package com.runnect.runnect.domain.repository.reverseGeocoding

import com.runnect.runnect.domain.entity.reverseGeocoding.LocationData
import kotlinx.coroutines.flow.Flow

interface ReverseGeocodingRepository {
    suspend fun getLocationInfoUsingLatLng(lat: Double, lon: Double): Flow<Result<LocationData>>
}