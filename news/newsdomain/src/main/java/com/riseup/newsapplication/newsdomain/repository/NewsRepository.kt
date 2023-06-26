package com.riseup.newsapplication.newsdomain.repository

import com.riseup.newsapplication.newsdomain.model.Article

interface NewsRepository {
    suspend fun getNewsArticle():List<Article>
}