package com.runnect.runnect.banner

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Singleton
    @Binds
    fun bindBannerRepository(bannerRepositoryImpl: BannerRepositoryImpl): BannerRepository
}