# Masjed-ktor-backend

# How it works

The application was built with:

  - [Kotlin](https://github.com/JetBrains/kotlin) as programming language
  - [Ktor](https://github.com/ktorio/ktor) as web framework
  - [Koin](https://insert-koin.io/) as dependency injection framework
  - [Jackson](https://github.com/FasterXML/jackson-module-kotlin) as data bind serialization/deserialization
  - [HikariCP](https://github.com/brettwooldridge/HikariCP) as datasource to abstract driver implementation
  - [Ktorm](https://www.ktorm.org/) as strong-typed and flexible SQL DSL and convenient sequence APIs to reduce our duplicated effort on database operations.

#### Structure
      + database/
          All database setups. fro MySql.
      + di/
          For Dependency injection modules.
      + plugins/
          App routing config.
      + server/
          Ktor routes and response.
      - App.kt <- The main class

# Getting started

The server is configured to start on localhost 8080.
