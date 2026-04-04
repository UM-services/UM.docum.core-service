# Changelog

Todos los cambios notables en este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
y este proyecto adhiere a [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.0.4] - 2026-04-04
### Changed
- Upgrade GitHub Actions: checkout@v4→v6, setup-java@v4→v5, cache@v4→v5, deploy-pages@v4→v5
- Upgrade Docker Actions: login-action@v3→v4, metadata-action@v5→v6, setup-buildx-action@v3→v4, build-push-action@v6→v7

## [0.0.3] - 2026-04-03
### Changed
- Upgrade Spring Boot from 4.0.2 to 4.0.5
- Upgrade SpringDoc OpenAPI from 3.0.1 to 3.0.2

## [1.0.0] - 2025-10-04
### Added
- Upgrade to Spring Boot 4.0.0-M3 (major version upgrade)
- Upgrade to Java 25
- Add Spring Boot Actuator for application monitoring and health checks
- Add Spring Security with basic authentication for Swagger UI access
- Add H2 in-memory database for unit testing
- Upgrade MySQL Connector/J to version 9.4.0
- Upgrade SpringDoc OpenAPI to version 3.0.0-M1
- Add Apache Commons Lang 3 for utility functions
- Add JaCoCo plugin for code coverage reporting
- Add GitHub Actions workflow for automatic documentation generation with Mermaid diagrams
- Add security configuration for API protection
- Add application ASCII art banner
- Add test configuration for H2 database
- Update application.yml with Swagger authentication credentials

### Changed
- Remove Maven wrapper for Windows (mvnw.cmd)
- Replace Spring Boot Starter HATEOAS with Actuator
- Update Maven compiler plugin configuration with annotation processors
- Remove versions-maven-plugin and enforcer plugin, add JaCoCo

### Removed
- Maven wrapper script for Windows

## [0.0.2] - 2026-02-02
### Changed
- Upgrade Spring Boot from 4.0.0-M3 to 4.0.2
- Upgrade MySQL Connector/J from 9.4.0 to 9.6.0
- Upgrade SpringDoc OpenAPI from 3.0.0-M1 to 3.0.1
- Upgrade Apache Commons Lang3 from 3.19.0 to 3.20.0
- Remove executable configuration from spring-boot-maven-plugin

## [0.0.1-SNAPSHOT] - 2024-03-29
### Added
- Configuración inicial del proyecto Spring Boot
- Estructura base del proyecto con arquitectura en capas
- Integración con MySQL 5.7
- Configuración de Swagger/OpenAPI para documentación
- Implementación de Docker multi-stage build
- Configuración de GitHub Actions para CI/CD
- Documentación detallada en README.md
- Estructura de directorios mejorada y documentada

### Changed
- Actualización a Java 21
- Actualización a Spring Boot 3.4.4
- Actualización a SpringDoc OpenAPI 2.8.6
- Optimización de la configuración de Docker
- Mejora en la documentación del proyecto

### Fixed
- Corrección de la configuración de la base de datos
- Ajustes en la configuración de Maven
- Mejora en el formato de la documentación

### Security
- Implementación de validación con Hibernate Validator
- Configuración de variables de entorno para credenciales

## [0.0.1-alpha] - 2024-02-28
### Added
- Creación inicial del repositorio
- Configuración básica del proyecto
- Estructura inicial de directorios 