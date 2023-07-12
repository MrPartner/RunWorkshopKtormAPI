package com.example.db

import org.ktorm.database.Database

object DatabaseConnection {
    val database = Database.connect(
        url = "jdbc:mysql://localhost:3306/runworkshop",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "administrador"
    )
}

object DatabaseConnectionUniversidad {
    val databaseUniversidades = Database.connect(
        url = "jdbc:mysql://localhost:3306/rwuniversidades",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "administrador"
    )
}

object DatabaseConnectionConsultoras {
    val databaseConsultoras = Database.connect(
        url = "jdbc:mysql://localhost:3306/rwconsultoras",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = "administrador"
    )
}

