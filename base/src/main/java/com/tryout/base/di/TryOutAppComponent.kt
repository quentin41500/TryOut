package com.tryout.base.di

import com.tryout.base.TryOutApp
import com.tryout.di.ApiModule
import com.tryout.di.utils.PerApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@PerApp
@Component(
    modules = arrayOf(
        AndroidInjectionModule::class,
        TryOutAppModule::class,
        ApiModule::class
    )
)
interface TryOutAppComponent : AndroidInjector<TryOutApp> {

  @Component.Builder
  abstract class Builder : AndroidInjector.Builder<TryOutApp>()
}