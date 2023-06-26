package com.riseup.newsapplication.news_data.network

import com.riseup.newsapplication.common_utils.Constants
import com.riseup.newsapplication.news_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {


    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("county") country:String = Constants.COUNTRY,
        @Query("category") category:String =Constants.CATEGORY,
        @Query("apiKey") apiKey:String = Constants.API_KEY
    ): NewsResponse
}