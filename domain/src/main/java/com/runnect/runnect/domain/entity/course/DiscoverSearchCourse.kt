package com.runnect.runnect.domain.entity.course

data class DiscoverSearchCourse(
    val id: Int,
    val courseId: Int,
    val title: String,
    val image: String,
    val scrap: Boolean,
    val departure: String,
)
