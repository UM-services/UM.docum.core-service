# UM.docum.core-service

[![UM.docum.core-service CI](https://github.com/UM-services/UM.docum.core-service/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/UM-services/UM.docum.core-service/actions/workflows/maven.yml)

+ ## Descripción
+ Servicio core para la gestión documental de la Universidad de Manizales. Este microservicio proporciona las funcionalidades principales para el manejo y procesamiento de documentos.
+
+ ## Requisitos Previos
+ - Java 17 o superior
+ - Maven 3.6.x o superior
+ - Base de datos compatible (especificar tipo)
+
+ ## Instalación
+
+ 1. Clonar el repositorio:
+ ```bash
+ git clone https://github.com/UM-services/UM.docum.core-service.git
+ ```
+
+ 2. Navegar al directorio del proyecto:
+ ```bash
+ cd UM.docum.core-service
+ ```
+
+ 3. Compilar el proyecto:
+ ```bash
+ mvn clean install
+ ```
+
+ ## Configuración
+ 1. Configurar las variables de entorno necesarias:
+    - `DB_URL`: URL de la base de datos
+    - `DB_USERNAME`: Usuario de la base de datos
+    - `DB_PASSWORD`: Contraseña de la base de datos
+    - (Agregar otras variables de entorno según sea necesario)
+
+ ## Uso
+ Para ejecutar el servicio:
+ ```bash
+ mvn spring-boot:run
+ ```
+
+ ## Estructura del Proyecto
+ ```
+ UM.docum.core-service/
+ ├── src/
+ │   ├── main/
+ │   │   ├── java/
+ │   │   └── resources/
+ │   └── test/
+ ├── .gitignore
+ ├── pom.xml
+ └── README.md
+ ```
+
+ ## API Endpoints
+ Documentación de los principales endpoints (agregar según corresponda):
+ - `GET /api/v1/documents`: Obtiene lista de documentos
+ - `POST /api/v1/documents`: Crea un nuevo documento
+ - `PUT /api/v1/documents/{id}`: Actualiza un documento existente
+ - `DELETE /api/v1/documents/{id}`: Elimina un documento
+
+ ## Pruebas
+ Para ejecutar las pruebas:
+ ```bash
+ mvn test
+ ```
+
+ ## Despliegue
+ Instrucciones para el despliegue en diferentes ambientes:
+ - Desarrollo
+ - Pruebas
+ - Producción
+
+ ## Contribución
+ 1. Fork el proyecto
+ 2. Cree su rama de características (`git checkout -b feature/AmazingFeature`)
+ 3. Commit sus cambios (`git commit -m 'Add some AmazingFeature'`)
+ 4. Push a la rama (`git push origin feature/AmazingFeature`)
+ 5. Abra un Pull Request
+
+ ## Licencia
+ Este proyecto está bajo la licencia [especificar tipo de licencia]
+
+ ## Contacto
+ Universidad de Manizales - [correo de contacto]
+
+ ## Estado del Proyecto
+ En desarrollo activo
