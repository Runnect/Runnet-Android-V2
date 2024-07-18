package com.runnect.runnect.banner.repository

import com.runnect.runnect.banner.datasource.remote.RemoteBannerDataSource
import com.runnect.runnect.domain.entity.banner.DiscoverBanner
import com.runnect.runnect.domain.repository.banner.BannerRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class BannerRepositoryImpl @Inject constructor(
    private val remoteBannerDataSource: RemoteBannerDataSource
) : BannerRepository {
    override suspend fun getDiscoverBanners(): Flow<MutableList<DiscoverBanner>> =
        remoteBannerDataSource.getDiscoverBanners()
}
