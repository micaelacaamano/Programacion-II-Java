# 📘 Primer Parcial – Programación II (Java)

## 📌 Descripción
Este proyecto corresponde al **primer parcial de la materia Programación II**, donde se aplican los conceptos iniciales de **Programación Orientada a Objetos (POO)** utilizando **Java**.

El sistema desarrollado permite gestionar notas académicas, trabajando con **clases**, **atributos**, **constructores**, **arreglos** y **métodos**, sin utilizar carga de datos por teclado.

---

## 🧱 Estructura del sistema

### 👨‍🎓 Clase Alumno
**Atributos:**
- `legajo`
- `nombre`
- `String[] materias`
- `int[] notas`

> La cantidad de materias se define en el constructor de la clase.

---

### 📝 Clase Examen
**Atributos:**
- `Alumno[] alumnos`
- `int notaAprobacion`

> La cantidad de alumnos y la nota mínima de aprobación se definen en el constructor.

---

## ⚙️ Funcionalidades

- Carga de alumnos, materias y notas desde el método `main`.
- Listado de todos los alumnos con el estado de cada materia (**APROBADA / REPROBADA**).
- Cálculo y visualización del promedio general de cada alumno.
- Identificación de las materias con notas superiores al promedio del alumno.
- Implementación de un menú de opciones para ejecutar las distintas funcionalidades.

---
