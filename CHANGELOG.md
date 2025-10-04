# Changelog

Todos los cambios notables en este proyecto serán documentados en este archivo.

El formato está basado en [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
y este proyecto adhiere a [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

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

## [Unreleased]

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