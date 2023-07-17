package com.example.routing

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    System.setProperty("io.ktor.development", "true")
    embeddedServer(Netty, port = 9090, host = "192.168.56.1", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSerialization()
    configureRouting()
    runworkshopRouter()
}
