package com.example.entities

import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object InstitutoEntity : Table<Nothing>("institutos") {
    val instituto = varchar("instituto")
    val direccion = varchar("direccion")
    val taller = varchar("taller")
    val descripcion = varchar("descripcion")
    val costo = varchar("costo")
    val fecha = varchar("fecha")
    val hora = varchar("hora")
}