package com.riseup.newsapplication.search_presentation

import com.riseup.newsapplication.search_domain.model.Article

data class SearchState(
    val isLoading: Boolean = false,
    val error: String = "false",
    val data: List<Article>? = null


)
