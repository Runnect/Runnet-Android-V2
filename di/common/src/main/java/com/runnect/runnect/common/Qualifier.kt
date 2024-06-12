package com.runnect.runnect.common

annotation class Qualifier {
    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class Runnect

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class RetrofitV2

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class Tmap

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class HttpClient

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class HttpClientV2

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class Auth
}