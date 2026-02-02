# UM.docum.core-service

[![UM.docum.core-service CI](https://github.com/UM-services/UM.docum.core-service/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/UM-services/UM.docum.core-service/actions/workflows/maven.yml)

## Descripción
Servicio core para la gestión documental de la Universidad de Manizales. Este microservicio proporciona las funcionalidades principales para el manejo y procesamiento de documentos, incluyendo la gestión de facultades y documentos académicos.

## Tecnologías
- Java 25
- Spring Boot 4.0.2
- Spring Data JPA
- MySQL 9.6.0
- SpringDoc OpenAPI 3.0.1 (Swagger)
- Lombok
- Hibernate Validator 9.0.0.Beta3
- Spring Boot Actuator
- Spring Security
- Apache Commons Lang 3.20.0
- H2 Database (para pruebas)
- JaCoCo (cobertura de código)

## Requisitos Previos
- JDK 25
- Maven 3.8.8 o superior
- Docker y Docker Compose (para desarrollo local)
- MySQL 9.4.0 (para desarrollo sin Docker)

## Inicio Rápido

### Desarrollo Local con Docker

1. Clonar el repositorio:
```bash
git clone https://github.com/UM-services/UM.docum.core-service.git
cd UM.docum.core-service
```

2. Iniciar los servicios con Docker Compose:
```bash
docker-compose up -d
```

El servicio estará disponible en `http://localhost:8080`

### Desarrollo Local sin Docker

1. Configurar la base de datos MySQL:
   - Host: localhost
   - Puerto: 3306
   - Base de datos: docum
   - Usuario: root
   - Contraseña: root

2. Compilar y ejecutar:
```bash
./mvnw clean install
./mvnw spring-boot:run
```

## Configuración

### Variables de Entorno
- `APP_SERVER`: Host de la base de datos
- `APP_DATABASE`: Nombre de la base de datos
- `APP_USER`: Usuario de la base de datos
- `APP_PASSWORD`: Contraseña de la base de datos
- `APP_SWAGGER_USER`: Usuario para autenticación en Swagger UI (por defecto: admin)
- `APP_SWAGGER_PASSWORD`: Contraseña para autenticación en Swagger UI (por defecto: password)
- `APP_ADD-PROPERTIES`: Propiedades adicionales
- `APP_LOGGING`: Nivel de logging
- `APP_LIVERELOAD_ENABLED`: Habilitar live reload
- `APP_LIVERELOAD_PORT`: Puerto para live reload
- `APP_OPEN-IN-VIEW`: Configuración de JPA

## Documentación API
La documentación de la API está disponible en:
- Swagger UI: `http://localhost:8080/swagger-ui.html` (requiere autenticación básica: usuario `admin`, contraseña `password`)
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## Monitoreo
El servicio incluye Spring Boot Actuator para monitoreo y health checks:
- Health check: `http://localhost:8080/actuator/health`
- Métricas: `http://localhost:8080/actuator/metrics`
- Información del servicio: `http://localhost:8080/actuator/info`

## Estructura del Proyecto
```tree
UM.docum.core-service/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── um/
│   │   │       └── docum/
│   │   │           └── rest/
│   │   │               ├── configuration/
│   │   │               ├── controller/
│   │   │               │   └── facade/
│   │   │               ├── exception/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               ├── service/
│   │   │               └── DocumApplication.java
│   │   └── resources/
│   └── test/
├── Dockerfile
├── Dockerfile.local
├── docker-compose.yml
├── pom.xml
└── README.md
```

## API Endpoints

### Facultades
- `GET /facultad/`: Obtiene lista de facultades

## Pruebas
Para ejecutar las pruebas:
```bash
./mvnw test
```

## Despliegue

### Construcción de la Imagen Docker
```bash
docker build -t um-docum-core-service .
```

### Ejecución del Contenedor
```bash
docker run -p 8080:8080 um-docum-core-service
```

### Desarrollo con Docker Multi-stage Build
El proyecto incluye un Dockerfile.local optimizado para desarrollo que utiliza multi-stage build:
1. Etapa de construcción: Usa Maven para compilar el proyecto
2. Etapa de ejecución: Usa JRE Alpine para ejecutar la aplicación

## Contribución
1. Fork el repositorio
2. Crea tu rama de características (`git checkout -b feature/nueva-caracteristica`)
3. Realiza tus cambios y haz commit (`git commit -am 'Agrega nueva característica'`)
4. Push a la rama (`git push origin feature/nueva-caracteristica`)
5. Abre un Pull Request

## Licencia
Este proyecto es propiedad de la Universidad de Manizales. Todos los derechos reservados.

## Estado del Proyecto
En desarrollo activo
