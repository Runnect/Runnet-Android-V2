package com.runnect.runnect.login.repository

import com.runnect.runnect.login.model.request.RequestPostLogin
import com.runnect.runnect.data.dto.LoginDTO
import com.runnect.runnect.data.network.mapToFlowResult
import com.runnect.runnect.login.datasource.remote.RemoteLoginDataSource
import com.runnect.runnect.domain.repository.LoginRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginRepositoryImpl @Inject constructor(private val remoteLoginDataSource: RemoteLoginDataSource) :
    LoginRepository {

    override suspend fun postLogin(requestPostLogin: RequestPostLogin): Flow<Result<LoginDTO>> {
        return remoteLoginDataSource.postLogin(requestPostLogin).mapToFlowResult {
            it.toData()
        }
    }
}