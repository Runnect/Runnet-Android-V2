package com.runnect.runnect.domain.entity.course

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DiscoverUploadCourse(
    val id: Int,
    val imageUrl: String,
    val departure: String,
    val distance: String
) : Parcelable
