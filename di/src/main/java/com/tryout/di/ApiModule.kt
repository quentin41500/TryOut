package com.tryout.di

import android.net.Uri
import com.tryout.di.utils.PerApp
import dagger.Module
import dagger.Provides

@Module
class ApiModule {
  @Provides
  @PerApp
  fun provideCrossfitHttpUrl() = Uri.parse("YOLO MAN")!!
}