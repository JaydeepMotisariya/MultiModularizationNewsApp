package com.riseup.newsapplication.search_data.model

data class NewsResponse(
    val articles: List<ArticleDTO>,
    val status: String,
    val totalResults: Int
)