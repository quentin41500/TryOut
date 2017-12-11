package com.tryout.home.di

import com.tryout.di.utils.PerActivity
import com.tryout.home.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainBindingModule {
  @PerActivity
  @ContributesAndroidInjector
  fun contributeMainActivityInjector(): MainActivity
}
