package com.alorma.compose.settings.storage.disk

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.alorma.compose.settings.storage.base.SettingValueState

@Composable
fun rememberIntSettingState(defaultValue: Int = -1): SettingValueState<Int> {
  return remember { InMemoryIntSettingValueState(defaultValue) }
}

internal class InMemoryIntSettingValueState(private val defaultValue: Int) :
  SettingValueState<Int> {
  override var value: Int by mutableStateOf(defaultValue)
  override fun reset() {
    value = defaultValue
  }
}