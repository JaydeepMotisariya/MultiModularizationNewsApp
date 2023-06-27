package com.riseup.newsapplication.news_data.mapper

import com.riseup.newsapplication.search_data.model.ArticleDTO
import com.riseup.newsapplication.search_domain.model.Article


fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author ?: "",
        content = this.content ?: "",
        description = this.description ?: "",
        title = this.title ?: "",
        urlToImage = this.urlToImage ?: "",
    )
}