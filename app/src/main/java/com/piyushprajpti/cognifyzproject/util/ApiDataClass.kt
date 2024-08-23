package com.piyushprajpti.cognifyzproject.util

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserData(
    @SerialName("id")
    val id: Int,

    @SerialName("name")
    val name: String,

    @SerialName("age")
    val age: Int,

    @SerialName("username")
    val username: String,

    @SerialName("email")
    val email: String,

    @SerialName("address")
    val address: Address,

    @SerialName("phone")
    val phone: String,

    @SerialName("website")
    val website: String,

    @SerialName("occupation")
    val occupation: String,

    @SerialName("hobbies")
    val hobbies: List<String>
)

@Serializable
data class Address(
    @SerialName("street")
    val street: String,

    @SerialName("city")
    val city: String,

    @SerialName("zip")
    val zip: String
)
