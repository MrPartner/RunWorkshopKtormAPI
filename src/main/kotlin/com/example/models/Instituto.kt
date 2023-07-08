package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Instituto(
    val instituto: String,
    val direccion: String,
    val taller: String,
    val descripcion: String
    // val fecha: String,
    //val hora:Int
)