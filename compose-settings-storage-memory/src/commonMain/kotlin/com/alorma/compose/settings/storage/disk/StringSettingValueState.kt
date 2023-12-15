package com.alorma.compose.settings.storage.disk

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.alorma.compose.settings.storage.base.SettingValueState

@Composable
fun rememberStringSettingState(defaultValue: String? = null): SettingValueState<String?> {
  return remember { InMemoryStringSettingValueState(defaultValue) }
}

internal class InMemoryStringSettingValueState(private val defaultValue: String?) :
  SettingValueState<String?> {
  override var value: String? by mutableStateOf(defaultValue)
  override fun reset() {
    value = defaultValue
  }
}