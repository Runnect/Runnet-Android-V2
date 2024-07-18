package com.runnect.runnect.data.dto.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//todo - course 모듈에서도 사용됨 중복
@Serializable
data class ResponsePutMyDrawCourse(
    @SerialName("deletedCourseCount")
    val deletedCourseCount: Int
)