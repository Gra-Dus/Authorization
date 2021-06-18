package com.gra_dus.authorization.data

interface Authorization {
    suspend fun checkAuth(login: String, password: String):Boolean
}