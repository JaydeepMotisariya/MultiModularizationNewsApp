package com.riseup.newsapplication.search_domain.model


data class Article(
    val author: String,
    val content: String,
    val description: String,
    val title: String,
    val urlToImage: String
)
