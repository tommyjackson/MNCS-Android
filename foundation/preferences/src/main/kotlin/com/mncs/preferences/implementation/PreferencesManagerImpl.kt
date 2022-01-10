package com.mncs.preferences.implementation

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import com.mncs.preferences.definition.PreferencesManager
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class PreferencesManagerImpl @Inject constructor(
    @ApplicationContext private val context: Context,
) : PreferencesManager {

    private val dataStore: DataStore<Preferences>
        get() = context.dataStore

    override suspend fun put(key: String, value: String) {
        val preferenceKey = stringPreferencesKey(key)


        dataStore.edit { preferences ->
            preferences[preferenceKey] = value
        }
    }

    override suspend fun put(key: String, value: Int) {
        val preferenceKey = intPreferencesKey(key)

        dataStore.edit { preferences ->
            preferences[preferenceKey] = value
        }
    }

    override suspend fun put(key: String, value: Boolean) {
        val preferenceKey = booleanPreferencesKey(key)

        dataStore.edit { preferences ->
            preferences[preferenceKey] = value
        }
    }

    override suspend fun get(key: String, defaultValue: String): String {
        val preferenceKey = stringPreferencesKey(key)

        return dataStore.data.map { preferences ->
            preferences[preferenceKey] ?: defaultValue
        }.first()
    }

    override suspend fun get(key: String, defaultValue: Int): Int {
        val preferenceKey = intPreferencesKey(key)

        return dataStore.data.map { preferences ->
            preferences[preferenceKey] ?: defaultValue
        }.first()
    }

    override suspend fun get(key: String, defaultValue: Boolean): Boolean {
        val preferenceKey = booleanPreferencesKey(key)

        return dataStore.data.map { preferences ->
            preferences[preferenceKey] ?: defaultValue
        }.first()
    }

    override suspend fun deleteAllData() {
        dataStore.edit {
            it.clear()
        }
    }

    companion object {
        private const val DATA_STORE_NAME = "mncs-preferences"
        private val Context.dataStore by preferencesDataStore(DATA_STORE_NAME)
    }
}