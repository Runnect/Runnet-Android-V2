package com.runnect.runnect.util.util.mode

sealed class ScreenMode {
    object ReadOnlyMode: ScreenMode()
    object EditMode: ScreenMode()
}
