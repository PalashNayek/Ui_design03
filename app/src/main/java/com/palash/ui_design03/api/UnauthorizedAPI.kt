package com.palash.ui_design03.api

import com.palash.ui_design03.model.login.request.LoginRequest
import com.palash.ui_design03.model.login.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UnauthorizedAPI {

    @POST("auth/login")
    suspend fun getLoginResponse(@Body loginRequest: LoginRequest) : Response<LoginResponse>
}