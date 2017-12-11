package com.tryout.home

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.inputmethod.InputMethodManager
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
  @Inject lateinit var imm: InputMethodManager
  @Inject lateinit var uri: Uri

  override fun onCreate(savedInstanceState: Bundle?) {
    AndroidInjection.inject(this)
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Log.e("Main", "URI: " + uri.toString())
    Log.e("Main", "imm: " + imm)
  }
}
