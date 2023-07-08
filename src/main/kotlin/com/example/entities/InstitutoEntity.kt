package com.example.entities

import org.ktorm.schema.Table
import org.ktorm.schema.date
import org.ktorm.schema.time
import org.ktorm.schema.varchar

object InstitutoEntity : Table<Nothing>("institutos") {
    val instituto = varchar("instituto").primaryKey()
    val direccion = varchar("direccion")
    val taller = varchar("taller")
    val descripcion = varchar("descripcion")
    val costo = varchar("costo")
    val fecha = varchar("fecha")
    val hora = varchar("hora")
}