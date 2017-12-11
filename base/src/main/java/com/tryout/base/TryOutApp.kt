package com.tryout.base

import com.tryout.base.di.DaggerTryOutAppComponent
import com.tryout.base.di.TryOutAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TryOutApp : DaggerApplication() {

  lateinit var component: TryOutAppComponent

  override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
    component = DaggerTryOutAppComponent.builder().create(this) as TryOutAppComponent
    return component
  }
}
