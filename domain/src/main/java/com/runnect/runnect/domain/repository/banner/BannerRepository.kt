package com.runnect.runnect.domain.repository.banner

import com.runnect.runnect.domain.entity.banner.DiscoverBanner
import kotlinx.coroutines.flow.Flow

interface BannerRepository {
    suspend fun getDiscoverBanners(): Flow<MutableList<DiscoverBanner>>
}