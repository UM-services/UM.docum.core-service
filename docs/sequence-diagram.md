# Diagrama de Secuencia - Interacción con API

```mermaid
sequenceDiagram
    participant Client
    participant SecurityFilter
    participant Controller
    participant Service
    participant Repository
    participant Database

    Client->>SecurityFilter: HTTP Request
    SecurityFilter->>SecurityFilter: Authenticate (if protected)
    SecurityFilter->>Controller: Forward Request
    Controller->>Service: Business Logic Call
    Service->>Repository: Data Access
    Repository->>Database: SQL Query
    Database-->>Repository: Result Set
    Repository-->>Service: Entity/Data
    Service-->>Controller: Processed Data
    Controller-->>Client: HTTP Response