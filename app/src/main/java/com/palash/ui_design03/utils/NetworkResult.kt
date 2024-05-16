package com.palash.ui_design03.utils

sealed class NetworkResult<T>(val data: T? = null, val message: String? = null) {
    class Loading<T> : NetworkResult<T>()
    class Success<T>(data: T?) : NetworkResult<T>(data)
    class Error<T>(data: T?, message: String?) : NetworkResult<T>(data, message)
}
