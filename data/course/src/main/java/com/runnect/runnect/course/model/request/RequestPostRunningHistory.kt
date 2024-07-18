package com.runnect.runnect.course.model.request

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RequestPostRunningHistory(
    @SerialName("courseId")
    val courseId: Int,
    @SerialName("publicCourseId")
    val publicCourseId: Int?,
    @SerialName("title")
    val title: String,
    @SerialName("time")
    val time: String,
    @SerialName("pace")
    val pace: String,
)