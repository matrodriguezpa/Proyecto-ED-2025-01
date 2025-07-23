# Residencias UNAL - Sistema de Asignación Prioritaria

Este proyecto implementa un sistema de asignación de cupos para residencias universitarias de la Universidad Nacional, basado en la prioridad socioeconómica de los estudiantes. Está desarrollado como parte del proyecto final del curso "Estructuras de Datos"

---

## 🎯 Objetivo del Proyecto

Automatizar el proceso de asignación de residencias para estudiantes de la Universidad Nacional, garantizando eficiencia y equidad mediante estructuras de datos eficientes.

Cada estudiante tiene un puntaje socioeconómico: cuanto menor es el puntaje, mayor es la necesidad. El sistema asigna los cupos disponibles a los estudiantes con menor puntaje de forma automática y ordenada.

---

## ⚙️ Estructuras de Datos Utilizadas

- HashMap (HashMap): Para acceder a la información de los estudiantes mediante su ID de forma rápida.
- Heap Mínimo (MinHeap): Para ordenar a los estudiantes por prioridad y asignar los cupos de forma eficiente.
- Lista enlazada (LinkedList): Para separar y mostrar los estudiantes que obtuvieron y no obtuvieron cupo.

---

## 🧠 Arquitectura y Componentes

### 1. `Estudiante.java`
Define la entidad principal con atributos:
- `id(cedula)` (int)
- `nombre` (String)
- `carrera` (String)
- `puntaje` (long)

### 2. `MinHeap.java`
Implementación de un heap binario mínimo para priorizar estudiantes según su puntaje.  
Contiene métodos como:
- `insert()`, `extractMin()`, `actualizarPuntaje()`

### 3. `HashMap.java`
Tabla hash con manejo de colisiones por encadenamiento, permite:
- `agregar`, `eliminar`, `buscar por ID`, `actualizar`, `reordenar`.

### 4. `View.java` & `View.form`
Vista principal de la aplicación, desarrollada con jSwing GUI Builder de NetBeans.  
Incluye menú y paneles dinámicos para la lógica de interacción.

### 5. `PanelEstudiante.java` & `PanelEstudiante.form`
Panel reutilizable que representa visualmente a un estudiante, mostrando:
- Nombre
- Carrera
- Puntaje
- Indicador si fue asignado o no


---

## 🖱️ Funcionalidades Principales

- Registro de estudiantes con ID, nombre completo y puntaje.
- Ingreso de número de cupos disponibles.
- Asignación automática de cupos por prioridad.
- Consulta directa por ID.
- Listado ordenado por puntaje socioeconómico.
- Modificación de puntaje con reordenamiento.
- Eliminación de estudiantes.
- Visualización de asignados y no asignados.

---

## 🧪 Estado del Proyecto

- Primer entregable (Completado)
- Entrega final (Completado)
    - ✅ Implementación completa de estructuras de datos
    - ✅ Interfaz funcional con formularios jSwing 
    - ✅ Pruebas locales de flujo completo 

---

## 📁 Estructura del Repositorio

├── src/
│ ├── Estudiante.java
│ ├── HashMap.java
│ ├── LinkedList.java
│ ├── MinHeap.Java
│ ├── View.java
│ ├── View.form
│ ├── PanelEstudiante.java
│ ├── PanelEstudiante.form
│ └── ResidenciasUnal.java
├── README.md
├── .gitignore
└── pom.xml

---

## 👨‍💻 Autores

- Santiago Neuta – Estudiante de Ingeniería de Sistemas
- Mateo Rodríguez Palacios – Estudiante de Ingeniería de Sistemas

---

## 💻 Tecnologías Utilizadas

- JAVA (Lenguaje en el que desarrolla el sistema)
- jSwing (Java GUI)
- Git y GitHub (Control de versiones y desarrollo colaborativo)
- Visual Studio Code (Entorno de desarrollo)
- NetBeans (Entorno de desarrollo)
- OnlineGDB (Entorno de pruebas rapidas en linea)

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Puedes usar, modificar y distribuir este software libremente, siempre que se mencione a los autores originales.

---

## 📬 Contribuciones

Este proyecto es parte de una actividad académica y no está abierto a contribuciones externas. Si deseas compartir ideas o comentarios, ¡Bienvenido seas a contactarnos!

