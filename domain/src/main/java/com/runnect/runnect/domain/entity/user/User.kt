package com.runnect.runnect.domain.entity.user

data class User(
    val email: String,
    val latestStamp: String,
    val level: Int,
    val levelPercent: Int,
    val nickname: String
)