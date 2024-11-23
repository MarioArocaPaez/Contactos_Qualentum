# Gestión de Contactos

Este proyecto es una **aplicación de gestión de contactos** desarrollada como parte de una prueba práctica para un curso de programación en Java. 

## Descripción

La aplicación permite realizar las siguientes operaciones básicas (**CRUD**) sobre una lista de contactos almacenada en memoria:
- **Crear** un nuevo contacto.
- **Buscar** contactos por su ID.
- **Listar** todos los contactos disponibles.
- **Eliminar** un contacto existente por su ID.

Además, se utiliza un enfoque de **Desarrollo Dirigido por Pruebas (TDD)**, asegurando que todas las funcionalidades estén completamente probadas mediante pruebas unitarias con **JUnit 5**.

## Características
- **Clase Contacto**:
  - Atributos: `id`, `nombre`, `email`, `edad`.
  - Métodos: constructores, getters/setters, y `toString()`.

- **GestorContactos**:
  - Almacena contactos en una estructura `ArrayList`.
  - Métodos CRUD: guardar, buscar, listar y eliminar.

- **Pruebas Unitarias**:
  - Validación de todas las funcionalidades CRUD utilizando **JUnit 5**.

- **Configuración Maven**:
  - Dependencias gestionadas con Maven.
  - Archivo `pom.xml` incluye las dependencias necesarias para **JUnit 5**.

## Requisitos
- **Java 11** o superior.
- **Maven** instalado y configurado.
- IDE de preferencia (IntelliJ IDEA, Eclipse, Visual Studio Code, etc.).

## Objetivo del Proyecto
Este proyecto fue creado como parte de una evaluación para un curso, con el objetivo de demostrar:
1. Uso adecuado de **TDD**.
2. Gestión de dependencias con **Maven**.
3. Creación de una aplicación funcional en Java.

