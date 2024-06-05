package com.runnect.runnect.util.util.extension

import android.app.Activity
import com.runnect.runnect.core.designsystem.R.anim.slide_in_left
import com.runnect.runnect.core.designsystem.R.anim.slide_in_right
import com.runnect.runnect.core.designsystem.R.anim.slide_out_left
import com.runnect.runnect.core.designsystem.R.anim.slide_out_right

fun Activity.navigateToPreviousScreenWithAnimation() {
    finish()
    applyScreenExitAnimation()
}

fun Activity.applyScreenExitAnimation() {
    overridePendingTransition(slide_in_left, slide_out_right)
}

fun Activity.applyScreenEnterAnimation() {
    overridePendingTransition(slide_in_right, slide_out_left)
}
