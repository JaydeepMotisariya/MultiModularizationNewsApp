package com.riseup.newsapplication.navigation

import com.riseup.newsapplication.common_utils.Activities
import com.riseup.newsapplication.common_utils.Navigator
import com.riseup.newsapplication.news_presentation.GoToNewsActivity
import com.riseup.newsapplication.search_presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {
    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }

            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }
}