package com.riseup.newsapplication.news_data.repository

import com.riseup.newsapplication.news_data.mapper.toDomainArticle
import com.riseup.newsapplication.news_data.network.NewsApiService
import com.riseup.newsapplication.news_data.room.NewsDAO
import com.riseup.newsapplication.newsdomain.model.Article
import com.riseup.newsapplication.newsdomain.repository.NewsRepository

class NewsRepoImp(private val newsApiService: NewsApiService, private val newsDAO: NewsDAO) :
    NewsRepository {
    override suspend fun getNewsArticle(): List<Article> {
        return try {
            val temp = newsApiService.getNewsArticles().articles.map { it.toDomainArticle() }
            newsDAO.insertList(temp)
            return newsDAO.getNewsArticle()
        } catch (e: Exception) {
            newsDAO.getNewsArticle()
        }
    }
}