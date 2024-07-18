package com.runnect.runnect.course.model.request


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//todo - storage 모듈에서도 쓰이는 파일
@Serializable
data class RequestPutMyDrawCourse(
    @SerialName("courseIdList")
    val courseIdList: List<Int>
)