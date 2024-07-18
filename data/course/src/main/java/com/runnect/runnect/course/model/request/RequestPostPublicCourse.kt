package com.runnect.runnect.course.model.request
import kotlinx.serialization.Serializable

@Serializable
data class RequestPostPublicCourse(
    val courseId: Int,
    val description: String,
    val title: String
)