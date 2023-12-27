package com.example.restapi.network

import com.example.restapi.model.Kontak
import retrofit2.http.GET
import retrofit2.http.Headers

interface  KontakService {
    @Headers(
        "Accept: application/json"
    )
    @GET("/kontak")
    suspend fun getKontak(): List<Kontak>
}