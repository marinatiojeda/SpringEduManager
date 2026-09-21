# SpringEduManager

Aplicación web educativa desarrollada con Java y Spring Boot para la gestión de estudiantes y cursos.

## Descripción

SpringEduManager permite gestionar estudiantes y cursos mediante una aplicación web desarrollada con Spring Framework.

El proyecto implementa:

- Spring Boot
- Spring MVC
- Spring Data JPA
- Spring Security
- H2 Database
- Thymeleaf
- API REST

## Funcionalidades

### Estudiantes

- Registrar estudiantes.
- Consultar estudiantes.
- Crear estudiantes mediante API REST.
- Actualizar estudiantes mediante API REST.
- Eliminar estudiantes mediante API REST.

### Cursos

- Registrar cursos.
- Consultar cursos.
- Crear cursos mediante API REST.
- Actualizar cursos mediante API REST.
- Eliminar cursos mediante API REST.

### Seguridad

El proyecto utiliza Spring Security con dos roles:

- `ADMIN`: puede consultar y crear cursos.
- `USER`: puede consultar cursos, pero no puede crearlos.

También se implementa inicio y cierre de sesión.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- Spring MVC
- Spring Data JPA
- Spring Security
- H2 Database
- Thymeleaf

## Ejecución del proyecto

Para compilar el proyecto:

```bash
mvn clean package
