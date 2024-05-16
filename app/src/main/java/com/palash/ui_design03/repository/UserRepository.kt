package com.palash.ui_design03.repository

import android.util.Log
import com.palash.ui_design03.api.UnauthorizedAPI
import com.palash.ui_design03.model.login.request.LoginRequest
import javax.inject.Inject

class UserRepository @Inject constructor(val unauthorizedAPI: UnauthorizedAPI) {

    suspend fun loginReq(loginRequest: LoginRequest){
        val response = unauthorizedAPI.getLoginResponse(loginRequest)
        Log.d("LoginRes", response.body().toString())
    }
}