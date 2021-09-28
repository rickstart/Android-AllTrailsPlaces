package com.ricardocenteno.alltrailsplaces.model.network

import com.ricardocenteno.alltrailsplaces.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

internal const val AUTHORIZATION = "key"
class ApiInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url()
        val url = originalHttpUrl
            .newBuilder()
            .addQueryParameter(AUTHORIZATION, BuildConfig.API_KEY)
            .build()

        val  requestBuilder = original.newBuilder().url(url)
        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}