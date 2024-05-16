package com.palash.ui_design03.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.palash.ui_design03.model.login.request.LoginRequest
import com.palash.ui_design03.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val userRepository: UserRepository) : ViewModel(){

    fun loginReq(loginRequest: LoginRequest){
        viewModelScope.launch {
            userRepository.loginReq(loginRequest)
        }
    }
}