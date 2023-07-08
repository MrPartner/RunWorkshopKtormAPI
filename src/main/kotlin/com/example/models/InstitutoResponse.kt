package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class InstitutoResponse<T>(
    val data: T,
    val success: Boolean
)