package com.riseup.newsapplication.search_data.di

import com.riseup.newsapplication.search_data.network.SearchApi
import com.riseup.newsapplication.search_data.repository.SearchRepositoryImpl
import com.riseup.newsapplication.search_domain.repository.SearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object SearchModule {

    @Provides
    fun provideSearchApi(retrofit: Retrofit): SearchApi{
        return  retrofit.create(SearchApi::class.java)
    }

    @Provides
    fun provideSearchRepo(searchApi: SearchApi):SearchRepository{
        return SearchRepositoryImpl(searchApi)
    }
}