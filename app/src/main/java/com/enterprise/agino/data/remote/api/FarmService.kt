package com.enterprise.agino.data.remote.api

import com.enterprise.agino.data.remote.dto.AddFarmRequest
import com.enterprise.agino.data.remote.dto.AddFarmResponse
import com.enterprise.agino.data.remote.dto.FarmResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface FarmService {

    @POST("api/AddFarmEndpoint")
    suspend fun addFarm(@Body addFarmRequest: AddFarmRequest): Response<AddFarmResponse>

//    @GET("api/AddFieldEndpoint")  // TODO: check the endpoints
//    suspend fun AddFarm(): Response<CreateFarmRequest>

    @GET("api/FarmApi/{id}")
    suspend fun GetFarm(
        @Path("id") id: String,
        // TODO: add body parameters
    ): Response<FarmResponse>
}