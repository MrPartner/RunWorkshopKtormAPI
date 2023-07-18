package com.example.routing

import com.example.db.DatabaseConnection
import com.example.db.DatabaseConnectionConsultoras
import com.example.db.DatabaseConnectionUniversidad
import com.example.entities.ConsultoraEntity
import com.example.entities.InstitutoEntity
import com.example.entities.UniversidadEntity
import com.example.models.ConsultoraModel
import com.example.models.Instituto
import com.example.models.UniversidadModel
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.ktorm.dsl.from
import org.ktorm.dsl.map
import org.ktorm.dsl.select

fun Application.runworkshopRouter() {

    val db = DatabaseConnection.database
    val dbuni = DatabaseConnectionUniversidad.databaseUniversidades
    val dbconsultora = DatabaseConnectionConsultoras.databaseConsultoras

    routing {
        //GET show values from database
        get("/runworkshop") {
            val runworkshop = db.from(InstitutoEntity).select()
                .map {
                    val instituto = it[InstitutoEntity.instituto]
                    val direccion = it[InstitutoEntity.direccion]
                    val audiencia = it[InstitutoEntity.audiencia]
                    val taller = it[InstitutoEntity.taller]
                    val descripcion = it[InstitutoEntity.descripcion]
                    val costo = it[InstitutoEntity.costo]
                    val fecha = it[InstitutoEntity.fecha]
                    val hora = it[InstitutoEntity.hora]
                    Instituto(
                    instituto ?: "",
                        direccion ?: "",
                        audiencia ?: "",
                        taller ?: "",
                        descripcion ?: "",
                        costo ?: "",
                        fecha ?: "",
                        hora ?: ""
                    )
                }

            call.respond(runworkshop)
        }

        get("/rwuniversidades") {
            val rwuniversidades = dbuni.from(UniversidadEntity).select()
                .map {
                    val universidad = it[UniversidadEntity.universidad]
                    val direccion = it[UniversidadEntity.direccion]
                    val audiencia = it[UniversidadEntity.audiencia]
                    val taller = it[UniversidadEntity.taller]
                    val descripcion = it[UniversidadEntity.descripcion]
                    val costo = it[UniversidadEntity.costo]
                    val fecha = it[UniversidadEntity.fecha]
                    val hora = it[UniversidadEntity.hora]
                    UniversidadModel(
                        universidad ?: "",
                        direccion ?: "",
                        audiencia ?: "",
                        taller ?: "",
                        descripcion ?: "",
                        costo ?: "",
                        fecha ?: "",
                        hora ?: ""
                    )
                }

            call.respond(rwuniversidades)
        }

        get("/rwconsultoras") {
            val rwconsultoras = dbconsultora.from(ConsultoraEntity).select()
                .map {
                    val consultora = it[ConsultoraEntity.consultora]
                    val direccion = it[ConsultoraEntity.direccion]
                    val audiencia = it[ConsultoraEntity.audiencia]
                    val taller = it[ConsultoraEntity.taller]
                    val descripcion = it[ConsultoraEntity.descripcion]
                    val costo = it[ConsultoraEntity.costo]
                    val fecha = it[ConsultoraEntity.fecha]
                    val hora = it[ConsultoraEntity.hora]
                    ConsultoraModel(
                        consultora ?: "",
                        direccion ?: "",
                        audiencia ?: "",
                        taller ?: "",
                        descripcion ?: "",
                        costo ?: "",
                        fecha ?: "",
                        hora ?: ""
                    )
                }

            call.respond(rwconsultoras)
        }

    }
}


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