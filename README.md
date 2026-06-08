# 🧠 Evaluación Desarrollo Orientado a Objetos I Semana 3

## 👤 Autor del proyecto

- **Nombre completo:** Yessica Ximena Brevis Garnica
- **Sección:** 008A
- **Carrera:** Analista Programador computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación de la semana 3 de la asignatura Desarrollo Orientado a Objetos I. Consiste en un sistema desarrollado en Java para modelar la información de las personas vinculadas a la agencia de turismo Llanquihue Tour.

La solución aplica principios de Programación Orientada a Objetos, incluyendo encapsulamiento, herencia, composición y manejo de excepciones, permitiendo representar y validar de forma estructurada la información de personas y empleados.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/                 
├── app/                        # Paquete principal con el método main.
│ └── Main.java                 # Clase principal que ejecuta el programa.
├── model/                      # Paquete de dominio.
│ ├── Persona.java              # Clase padre que almacena información básica de un empleado.
│ ├── Empleado.java             # Clase que Hereda de Persona e incorpora información laboral.
│ ├── Rut.java                  # Clase que Representa y valida el RUT de una persona.
│ └── Direccion.java            # Clase que Representa la dirección asociada a una persona.
├── util/                       # Paquete de Utilidades y validaciones.
└── RutInvalidoException.java   # Clase de Excepción personalizada utilizada para validar el formato del RUT.
````


---

## ⚙️ Instrucciones para compilar y ejecutar

1.- Clonar o descargar el repositorio.

```bash
git clone https://github.com/yessica-brevis/agencia-turismo-llanquihue-tour.git
```
2. Abrir el proyecto en NetBeans.
   
3. Compilar el proyecto.

4. Ejecutar la clase `Main.java` ubicada en el paquete `app`.

5. Revisar la salida del programa en la consola.

**Repositorio GitHub:** https://github.com/yessica-brevis/agencia-turismo-llanquihue-tour

**Fecha de entrega:** \[08/06/2026]

---
