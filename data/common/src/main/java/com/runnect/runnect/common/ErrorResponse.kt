package com.runnect.runnect.common

import kotlinx.serialization.SerialName

@Serializable
data class ErrorResponse<T>(
    @SerialName("status")
    val status: Int,
    @SerialName("success")
    val success: Boolean?,
    @SerialName("message")
    val message: String?,
    @SerialName("error")
    val error: String?,
    @SerialName("data")
    val data: T? = null
)
