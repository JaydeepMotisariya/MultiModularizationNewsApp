package com.riseup.newsapplication.search_domain.repository

import com.riseup.newsapplication.search_domain.model.Article

interface SearchRepository {
    suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article>
}