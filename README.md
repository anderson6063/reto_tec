# reto_tec
# Universidad Sophos - Sistema de Gestión

Bienvenido al sistema de gestión de la Universidad Sophos. Este proyecto ha sido desarrollado para facilitar la administración de cursos, estudiantes y profesores en la universidad.

## Contenido

1. [Estructura del Proyecto](#estructura-del-proyecto)
2. [Requisitos del Sistema](#requisitos-del-sistema)
3. [Configuración del Proyecto](#configuración-del-proyecto)
4. [Uso del Sistema](#uso-del-sistema)
5. [Contribuciones](#contribuciones)
6. [Licencia](#licencia)

## Estructura del Proyecto

El proyecto sigue una estructura MVC (Modelo-Vista-Controlador) para una organización clara y mantenible del código.

- `src/`: Contiene el código fuente Java.
  - `com.universidadsophos.model/`: Clases que representan el modelo de datos.
  - `com.universidadsophos.dao/`: Clases que manejan la interacción con la base de datos.
  - `com.universidadsophos.controller/`: Clases controladoras que gestionan la lógica del negocio.
  - `com.universidadsophos.util/`: Clases de utilidad.
- `sql/`: Contiene scripts SQL para crear la base de datos.

## Requisitos del Sistema

Asegúrate de tener instalado lo siguiente:

- Java (versión X.X.X)
- MySQL (versión X.X.X)
- Eclipse IDE (opcional)

## Configuración del Proyecto

1. Clona el repositorio: `git clone https://github.com/tu-usuario/tu-repositorio.git`
2. Importa el proyecto en tu IDE preferido (Eclipse, IntelliJ, etc.).
3. Configura la conexión a la base de datos en `src/com/universidadsophos/util/Conexion.java`.
4. Ejecuta los scripts SQL en `sql/` para crear y poblar la base de datos.

## Uso del Sistema

- Ejecuta la clase `ControladorUniversidadSophos` para iniciar la aplicación.
- Accede a través de un navegador web a `http://localhost:puerto` (puerto predeterminado: 8080).

## Contribuciones

Las contribuciones son bienvenidas. Si encuentras un problema o tienes una mejora, por favor, abre un issue o envía un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT - consulta el archivo [LICENSE](LICENSE) para más detalles.
