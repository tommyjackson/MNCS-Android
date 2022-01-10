package com.mncs.preferences.definition

/**
 * Top level definitions for storing and retrieving key/value pairs locally
 */
interface PreferencesManager {

    /**
     * Persist a [String] value in local storage
     *
     * @param key A unique identifier for the value
     * @param value The value to persist
     */
    suspend fun put(key: String, value: String)

    /**
     * Retrieve a persisted [String] value from local storage
     *
     * @param key A unique identifier for the value
     * @param defaultValue A value to return if retrieval fails
     *
     * @return The [String] value that was persisted
     * or the [defaultValue] if retrieval failed
     */
    suspend fun get(key: String, defaultValue: String): String

    /**
     * Persist an [Int] value in local storage
     *
     * @param key A unique identifier for the value
     * @param value The value to persist
     */
    suspend fun put(key: String, value: Int)

    /**
     * Retrieve a persisted [Int] value from local storage
     *
     * @param key A unique identifier for the value
     * @param defaultValue A value to return if retrieval fails
     *
     * @return The [Int] value that was persisted
     * or the [defaultValue] if retrieval failed
     */
    suspend fun get(key: String, defaultValue: Int): Int

    /**
     * Persist a [Boolean] value in local storage
     *
     * @param key A unique identifier for the value
     * @param value The value to persist
     */
    suspend fun put(key: String, value: Boolean)

    /**
     * Retrieve a persisted [Boolean] value from local storage
     *
     * @param key A unique identifier for the value
     * @param defaultValue A value to return if retrieval fails
     *
     * @return The [Boolean] value that was persisted
     * or the [defaultValue] if retrieval failed
     */
    suspend fun get(key: String, defaultValue: Boolean): Boolean

    /**
     * Deletes all locally stored data that [PreferencesManager] handles
     */
    suspend fun deleteAllData()
}
