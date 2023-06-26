package com.riseup.newsapplication.news_data.mapper

import com.riseup.newsapplication.news_data.model.ArticleDTO
import com.riseup.newsapplication.newsdomain.model.Article

fun ArticleDTO.toDomainArticle():Article{
    return Article(
        author =this.author?:"",
        content =this.content?:"",
        description =this.description?:"",
        title =this.title?:"",
        urlToImage =this.urlToImage?:"",
    )
}