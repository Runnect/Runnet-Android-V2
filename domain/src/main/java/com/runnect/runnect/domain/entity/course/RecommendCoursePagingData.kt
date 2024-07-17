package com.runnect.runnect.domain.entity.course

data class RecommendCoursePagingData(
    val isEnd: Boolean,
    val recommendCourses: List<DiscoverMultiViewItem.RecommendCourse>
)