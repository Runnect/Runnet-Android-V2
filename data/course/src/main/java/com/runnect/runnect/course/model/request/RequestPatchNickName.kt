package com.runnect.runnect.course.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestPatchNickName(
    @SerialName("nickname")
    val nickname: String
)