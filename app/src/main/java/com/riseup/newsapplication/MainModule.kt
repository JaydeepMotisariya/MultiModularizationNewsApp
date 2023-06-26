package com.riseup.newsapplication

import android.content.Context
import com.riseup.newsapplication.common_utils.Navigator
import com.riseup.newsapplication.navigation.DefaultNavigator
import com.riseup.newsapplication.news_data.room.NewsDAO
import com.riseup.newsapplication.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Provides
    @Singleton
    fun provideProvider(): Navigator.Provider {
        return DefaultNavigator()
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideNewsDao(appDatabase: AppDatabase): NewsDAO {
        return appDatabase.getNewsDao()
    }
}