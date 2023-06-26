package com.riseup.newsapplication.news_data.di

import com.riseup.newsapplication.news_data.network.NewsApiService
import com.riseup.newsapplication.news_data.repository.NewsRepoImp
import com.riseup.newsapplication.news_data.room.NewsDAO
import com.riseup.newsapplication.newsdomain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object NewsDataModule {

    @Provides
    fun provideNewsApiService(retrofit: Retrofit): NewsApiService {
        return retrofit.create(NewsApiService::class.java)
    }

    @Provides
    fun provideNewsRepository(newsApiService: NewsApiService, newsDAO: NewsDAO): NewsRepository {
        return NewsRepoImp(newsApiService, newsDAO)
    }
}