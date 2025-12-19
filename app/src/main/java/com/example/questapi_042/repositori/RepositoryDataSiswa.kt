package com.example.questapi_042.repositori


import com.example.questapi_042.apiservice.ServiceApiSiswa
import com.example.questapi_042.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) : retrofit2.Response<Void>
}

