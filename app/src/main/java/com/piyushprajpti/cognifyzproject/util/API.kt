package com.piyushprajpti.cognifyzproject.util

import android.util.Log
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json


val client = HttpClient(Android) {
    expectSuccess = true
    install(ContentNegotiation) {
        json(Json { ignoreUnknownKeys = true })
    }
}

suspend fun getData(callBack: (List<UserData>?, error: String?) -> Unit) {
    try {
        val response = client.get("https://freetestapi.com/api/v1/users")
        callBack(response.body<List<UserData>>(), null)
    } catch (e: Exception) {
        Log.d("TAG", "getData: $e")
        callBack(null, "Unable to fetch users list")
    }
}