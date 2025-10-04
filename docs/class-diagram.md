# Diagrama de Clases - Modelo de Datos

```mermaid
classDiagram
    class Auditable {
        +LocalDateTime createdDate
        +String createdBy
        +LocalDateTime lastModifiedDate
        +String lastModifiedBy
    }

    class Facultad {
        +Long id
        +String nombre
        +String descripcion
        +String codigo
    }

    class User {
        +Long id
        +String username
        +String email
        +String password
        +Set~Role~ roles
    }

    Auditable <|-- Facultad
    Auditable <|-- User

    class IFacultadRepository {
        +findAll(): List~Facultad~
        +findById(id: Long): Optional~Facultad~
        +save(facultad: Facultad): Facultad
    }

    class IUserRepository {
        +findByUsername(username: String): Optional~User~
        +findByEmail(email: String): Optional~User~
    }

    class FacultadService {
        +getAllFacultades(): List~Facultad~
        +getFacultadById(id: Long): Facultad
        +createFacultad(facultad: Facultad): Facultad
    }

    class UserService {
        +getUserByUsername(username: String): User
        +createUser(user: User): User
    }

    IFacultadRepository <|.. FacultadService
    IUserRepository <|.. UserService