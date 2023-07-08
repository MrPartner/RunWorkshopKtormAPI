package com.example.routing

import com.example.db.DatabaseConnection
import com.example.entities.InstitutoEntity
import com.example.models.Instituto
import com.example.models.InstitutoResponse
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.ktorm.dsl.from
import org.ktorm.dsl.map
import org.ktorm.dsl.select

fun Application.runworkshopRouter() {

    val db = DatabaseConnection.database

    routing {
        //GET show values from database
        get("/runworkshop") {
            val runworkshop = db.from(InstitutoEntity).select()
                .map {
                    val instituto = it[InstitutoEntity.instituto]
                    val direccion = it[InstitutoEntity.direccion]
                    val taller = it[InstitutoEntity.taller]
                    val descripcion = it[InstitutoEntity.descripcion]
                    val costo = it[InstitutoEntity.costo]
                    val fecha = it[InstitutoEntity.fecha]
                    val hora = it[InstitutoEntity.hora]
                    Instituto(
                        instituto ?: "",
                        direccion ?: "",
                        taller ?: "",
                        descripcion ?: "",
                        costo ?: "",
                        fecha ?: "",
                        hora ?: ""
                    )
                }

            call.respond(runworkshop)
                /*
                .firstOrNull()

            if (runworkshop != null) {
                call.respond(
                    HttpStatusCode.OK, InstitutoResponse(

                        success = true,
                        data = "Values has been successfully presented",
                    )
                )
            } else {
                call.respond(
                    HttpStatusCode.BadRequest, InstitutoResponse(
                        success = false,
                        data = "Failed to show values"
                    )
                )
            }*/
        }

    }
}