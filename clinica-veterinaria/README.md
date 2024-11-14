# Ejercicio Spring Boot - Clínica Veterinaria 🐾

Este proyecto es una API desarrollada en Java utilizando Spring Boot, JPA y Hibernate. La API permite gestionar la información de mascotas y sus dueños en una clínica veterinaria. Se han implementado diversas funcionalidades de CRUD/ABML y consultas específicas requeridas por la clínica.

## Descripción del Proyecto 📄
La clínica veterinaria necesita un sistema que gestione de manera eficiente los datos de sus mascotas y dueños. La API proporcionada cumple con los siguientes requerimientos:

- **Clases principales:**
  - **Mascota**
    - `id` (Identificador único)
    - `nombre`
    - `especie`
    - `raza`
    - `color`
    - Asociación con un único dueño.
  - **Dueño**
    - `id` (Identificador único)
    - `dni`
    - `nombre`
    - `apellido`
    - `celular`

## Requerimientos de la API 🚀

1. **CRUD/ABML de Mascotas**: Permite crear, leer, actualizar y eliminar información de mascotas.
2. **CRUD/ABML de Dueños**: Permite crear, leer, actualizar y eliminar información de dueños.
3. **Consulta de mascotas de especie "perro" y raza "caniche"**: Obtiene un listado de todas las mascotas que cumplen con estos criterios.
4. **Consulta combinada de datos de mascota y dueño**: Devuelve un listado con los siguientes datos:
   - `nombre_mascota`
   - `especie`
   - `raza`
   - `nombre_duenio`
   - `apellido_duenio`

   Para esta consulta, se implementó el uso de un DTO (Data Transfer Object) para estructurar la respuesta.

## Tecnologías Utilizadas 🛠️

- **Java 17**
- **Spring Boot**
- **JPA (Java Persistence API)**
- **Hibernate** (versión 6.5.2)
- **MySQL** (base de datos)
- **Postman** (para pruebas de endpoints)
- **DTO** (para estructuración de respuestas)

## Instalación y Configuración ⚙️

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/tu-usuario/clinica-veterinaria.git
   cd clinica-veterinaria
   ```

2. **Configurar la base de datos MySQL**:
   Crea una base de datos llamada `clinica-veterinaria` e inserta las credenciales de conexión en el archivo `application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/clinica-veterinaria?useSSL=false&serverTimezone=UTC
   spring.datasource.username=admin
   spring.datasource.password=admin
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
   ```

3. **Compilar y ejecutar la aplicación**:
   ```bash
   ./mvnw spring-boot:run
   ```

## Uso de la API 📬

Puedes probar la API utilizando Postman o cualquier otro cliente HTTP. A continuación, se presentan los principales endpoints:

- **Mascotas**
  - `POST /mascota/crear` - Crear una nueva mascota.
  - `GET /mascota/traer` - Obtener todas las mascotas.
  - `GET /mascota/traer/{id}` - Obtener una mascota por ID.
  - `PUT /mascota/editar` - Actualizar una mascota.
  - `DELETE /mascota/{id}` - Eliminar una mascota.

- **Dueños**
  - `POST /duenio/crear` - Crear un nuevo dueño.
  - `GET /duenio/traer` - Obtener todos los dueños.
  - `GET /duenio/traer/{id}` - Obtener un dueño por ID.
  - `PUT /duenio/editar` - Actualizar un dueño.
  - `DELETE /duenio/eliminar/{id}` - Eliminar un dueño.

- **Consultas específicas**
  - `GET /mascota/traer-caniches` - Obtener todas las mascotas de especie "perro" y raza "caniche".
  - `GET /mascota/traer-duenios` - Obtener un listado combinado de datos de mascota y dueño.

## Estructura del Proyecto 📂

El proyecto sigue una arquitectura de multicapas:

- **Controladores (Controllers)**: Manejan las solicitudes HTTP y las respuestas.
- **Servicios (Services)**: Contienen la lógica de negocio.
- **Repositorios (Repositories)**: Se encargan de la interacción con la base de datos.
- **DTOs**: Se utilizan para transferir datos entre la API y los consumidores.

## Pruebas de la API 🧪

Puedes importar la colección de Postman incluida en el repositorio (`postman_collection.json`) para realizar pruebas de los endpoints de manera fácil y rápida.
