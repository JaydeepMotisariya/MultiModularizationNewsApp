package com.riseup.newsapplication.search_data.repository

import com.riseup.newsapplication.news_data.mapper.toDomainArticle
import com.riseup.newsapplication.search_data.network.SearchApi
import com.riseup.newsapplication.search_domain.model.Article
import com.riseup.newsapplication.search_domain.repository.SearchRepository

class SearchRepositoryImpl(private val searchApi: SearchApi) : SearchRepository {
    override suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article> {
        return searchApi.getSearchArticles(map).articles.map { it.toDomainArticle() }
    }
}