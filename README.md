Evaluación Desarrollo Orientado a Objetos I Semana 3
👤 Autor del proyecto

Nombre completo: Yessica Ximena Brevis Garnica
Sección: 008A
Carrera: Analista Programador computacional
Sede: Online

📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la semana 3 de la asignatura Desarrollo Orientado a Objetos I. Consiste en un sistema desarrollado en Java para modelar la información de las personas vinculadas a la agencia de turismo Llanquihue Tour.

La solución aplica principios de Programación Orientada a Objetos, incluyendo encapsulamiento, herencia, composición y manejo de excepciones, permitiendo representar y validar de forma estructurada la información de personas y empleados.

🧱 Estructura general del proyecto

📁 src/                 
├── app/                        # Clase principal con el método main.
│ └── Main.java                 # Clase principal que ejecuta el programa.
├── model/                      # Clases de dominio.
│ ├── Persona.java              # Clase padre que almacena información básica de una persona.
│ ├── Empleado.java             # Hereda de Persona e incorpora información laboral.
│ ├── Rut.java                  # Representa y valida el RUT de una persona.
│ └── Direccion.java            # Representa la dirección asociada a una persona.
└── util/                       # Utilidades y validaciones.
└── RutInvalidoException.java   # Excepción personalizada utilizada para validar el formato del RUT.


⚙️ Instrucciones para compilar y ejecutar
Clonar o descargar el repositorio.
Abrir el proyecto en NetBeans.
Compilar el proyecto.
Ejecutar la clase Main ubicada en el paquete app.
Revisar la salida en la consola.
🔗 Repositorio GitHub

[Pegar aquí la URL de tu repositorio]

📅 Fecha de entrega

[08/06/2026]
