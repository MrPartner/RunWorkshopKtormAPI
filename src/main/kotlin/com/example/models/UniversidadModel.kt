package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class UniversidadModel(
    val universidad: String,
    val direccion: String,
    val audiencia: String,
    val taller: String,
    val descripcion: String,
    val costo: String,
    val fecha: String,
    val hora: String
)
