package com.runnect.runnect.databse

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Singleton
@InstallIn(SingletonComponent::class)
object DatabaseModule{
    @Singleton
    @Provides
    fun provideBannerService() = Firebase.firestore
}