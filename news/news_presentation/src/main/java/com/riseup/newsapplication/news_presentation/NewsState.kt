package com.riseup.newsapplication.news_presentation

import com.riseup.newsapplication.newsdomain.model.Article

data class NewsState(
    val isLoading:Boolean = false,
    val error:String ="",
    val data:List<Article>?=null

)
