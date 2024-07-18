package com.runnect.runnect.login.datasource.remote

import com.runnect.runnect.login.model.request.RequestPostLogin
import com.runnect.runnect.data.dto.response.ResponsePostLogin
import com.runnect.runnect.data.service.LoginService
import javax.inject.Inject

class RemoteLoginDataSource @Inject constructor(
    private val loginService: LoginService
) {
    suspend fun postLogin(
        requestPostLogin: RequestPostLogin
    ): Result<ResponsePostLogin> = loginService.postLogin(requestPostLogin)
}