package com.example.entities


import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object UniversidadEntity: Table<Nothing>("universidades") {
    val universidad = varchar("universidad")
    val direccion = varchar("direccion")
    val taller = varchar("taller")
    val descripcion = varchar("descripcion")
    val costo = varchar("costo")
    val fecha = varchar("fecha")
    val hora = varchar("hora")
}