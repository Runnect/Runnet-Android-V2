package com.runnect.runnect.common

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.runnect.runnect.BuildConfig
import com.runnect.runnect.application.ApplicationClass
import com.runnect.runnect.data.network.calladapter.ResultCallAdapterFactory
import com.runnect.runnect.data.network.interceptor.ResponseInterceptor
import com.runnect.runnect.data.repository.*
import com.runnect.runnect.data.service.*
import com.runnect.runnect.data.source.remote.*
import com.runnect.runnect.domain.*
import com.runnect.runnect.util.ApiLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {


    @Provides
    @Singleton
    @com.runnect.runnect.common.Qualifier.HttpClient
    fun provideOkHttpClient(
        logger: HttpLoggingInterceptor,
        @com.runnect.runnect.common.Qualifier.Auth authInterceptor: Interceptor
    ): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logger)
        .addInterceptor(authInterceptor)
        .build()

    @Provides
    @Singleton
    @com.runnect.runnect.common.Qualifier.HttpClientV2
    fun provideOkHttpClientV2(
        logger: HttpLoggingInterceptor,
        @com.runnect.runnect.common.Qualifier.Auth authInterceptor: Interceptor,
        responseInterceptor: ResponseInterceptor,
    ): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(logger)
        .addInterceptor(authInterceptor)
        .addInterceptor(responseInterceptor)
        .build()

    @Provides
    @Singleton
    fun provideLogger(): HttpLoggingInterceptor = HttpLoggingInterceptor(ApiLogger()).apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    @Singleton
    @com.runnect.runnect.common.Qualifier.Auth
    fun provideAuthInterceptor(interceptor: AuthInterceptor): Interceptor = interceptor

    @Provides
    @Singleton
    fun provideResponseInterceptor(): ResponseInterceptor = ResponseInterceptor()


    @OptIn(ExperimentalSerializationApi::class, InternalCoroutinesApi::class)
    @Provides
    @Singleton
    @com.runnect.runnect.common.Qualifier.Runnect
    fun provideRunnectRetrofit(
        json: Json,
        @com.runnect.runnect.common.Qualifier.HttpClient client: OkHttpClient
    ): Retrofit {
        kotlinx.coroutines.internal.synchronized(this) {
            val baseUrl = ApplicationClass.getBaseUrl()
            val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(client)
                .addConverterFactory(
                    json.asConverterFactory("application/json".toMediaType())
                ).build()

            return retrofit ?: throw RuntimeException("Retrofit creation failed.")
        }
    }

    @OptIn(ExperimentalSerializationApi::class, InternalCoroutinesApi::class)
    @Provides
    @Singleton
    @com.runnect.runnect.common.Qualifier.RetrofitV2
    fun provideRunnectRetrofitV2(
        @com.runnect.runnect.common.Qualifier.HttpClientV2 client: OkHttpClient
    ): Retrofit {
        val baseUrl = ApplicationClass.getBaseUrl()
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(ResultCallAdapterFactory.create())
            .build()

        return retrofit ?: throw RuntimeException("Retrofit creation failed.")
    }

    @OptIn(ExperimentalSerializationApi::class, InternalCoroutinesApi::class)
    @Provides
    @Singleton
    @com.runnect.runnect.common.Qualifier.Tmap
    fun provideTmapRetrofit(
        json: Json,
        @com.runnect.runnect.common.Qualifier.HttpClientV2 client: OkHttpClient
    ): Retrofit {
        kotlinx.coroutines.internal.synchronized(this) {
            val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.TMAP_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(ResultCallAdapterFactory.create())
                .build()
            return retrofit ?: throw RuntimeException("Retrofit creation failed.")
        }
    }

    @Provides
    @Singleton
    fun provideJson(): Json = Json {
        ignoreUnknownKeys = true
    }
}