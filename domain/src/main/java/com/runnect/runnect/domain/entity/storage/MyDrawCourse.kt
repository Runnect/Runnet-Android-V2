package com.runnect.runnect.domain.entity.storage

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyDrawCourse(
    val courseId: Int?,
    val image: String?,
    val city: String,
    val region: String,
    val title: String
) : Parcelable