package com.example.entities

import org.ktorm.schema.Table
import org.ktorm.schema.varchar

object ConsultoraEntity: Table<Nothing>("consultoras") {
    val consultora = varchar("consultora")
    val direccion = varchar("direccion")
    val taller = varchar("taller")
    val descripcion = varchar("descripcion")
    val costo = varchar("costo")
    val fecha = varchar("fecha")
    val hora = varchar("hora")
}