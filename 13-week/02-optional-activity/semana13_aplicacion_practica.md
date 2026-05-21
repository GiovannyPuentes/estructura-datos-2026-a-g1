# Estudiante: Giovanny Andrey Puentes Alape

# Semana 13 – Actividad: Aplicación de Estructuras de Datos

## Introducción

En este documento se presenta el diseño de un sistema básico que integra diferentes estructuras de datos para solucionar un caso práctico relacionado con la administración de información dentro de una biblioteca.

---

## Sistema propuesto: Administrador de Biblioteca

El sistema permite almacenar libros, controlar préstamos, gestionar reservas de usuarios y organizar los géneros literarios mediante una estructura jerárquica.

---

## Datos manejados por el sistema

| # | Tipo de dato            | Descripción                                                        |
|---|--------------------------|--------------------------------------------------------------------|
| 1 | Libros                   | Conjunto de libros registrados en la biblioteca                    |
| 2 | Registro de préstamos    | Historial de préstamos y devoluciones realizadas                   |
| 3 | Reservas de usuarios     | Usuarios en espera para acceder a un libro disponible              |
| 4 | Géneros literarios       | Clasificación jerárquica de géneros y subgéneros                   |

---

## Estructuras de datos utilizadas

| Tipo de dato            | Estructura utilizada | Motivo de uso                                                              |
|-------------------------|----------------------|------------------------------------------------------------------------------|
| Libros                  | Lista enlazada       | Facilita agregar y eliminar elementos dinámicamente.                        |
| Registro de préstamos   | Pila                 | Permite acceder primero a la acción más reciente.                           |
| Reservas de usuarios    | Cola                 | Mantiene el orden de llegada de los usuarios.                               |
| Géneros literarios      | Árbol binario        | Organiza categorías de manera jerárquica y estructurada.                    |

---

## Explicación de cada estructura

### Lista enlazada → Catálogo de libros
El catálogo puede modificarse constantemente, ya que algunos libros se agregan y otros se eliminan. La lista enlazada resulta adecuada porque permite realizar cambios dinámicos sin depender de un tamaño fijo.

### Pila → Historial de préstamos
El historial de acciones debe consultar primero la última operación realizada. La pila trabaja bajo el principio **LIFO** (Last In, First Out), lo que permite recuperar rápidamente el último préstamo o devolución registrada.

### Cola → Reservas de usuarios
Cuando varios usuarios solicitan el mismo libro, el sistema debe respetar el orden en el que llegaron las solicitudes. La cola funciona mediante el principio **FIFO** (First In, First Out), asegurando un proceso justo.

### Árbol binario → Clasificación de géneros
Los géneros literarios poseen una organización jerárquica natural. Un género principal puede contener subgéneros más específicos. El árbol binario permite representar estas relaciones de manera clara y eficiente.

---

## Representación del árbol binario de géneros

```text
              Literatura           ← Nivel 0 (Raíz)
             /          \
         Ficción       No Ficción  ← Nivel 1 (Nodos internos)
         /    \           /    \
    Ciencia  Terror  Historia  Ciencia  ← Nivel 2 (Hojas)
    Ficción                    Popular
```

---

## Ejemplo conceptual en Java

```java
// Lista enlazada: catálogo de libros
List<String> libros = new LinkedList<>();
libros.add("El Principito");
libros.add("Don Quijote de la Mancha");

// Pila: historial de movimientos
Stack<String> historial = new Stack<>();
historial.push("Préstamo: El Principito - Usuario: Ana");
historial.push("Devolución: Don Quijote - Usuario: Luis");

// Cola: reservas pendientes
Queue<String> reservas = new LinkedList<>();
reservas.add("Usuario: Carlos - Libro: El Principito");
reservas.add("Usuario: María - Libro: El Principito");

// Árbol binario: categorías de géneros
// Nodo raíz: Literatura
// Hijo izquierdo: Ficción | Hijo derecho: No Ficción
```

---

## Relación entre las estructuras

```text
  [Lista enlazada]         [Cola de reservas]
   Catálogo de libros  →   Usuarios en espera
         |                        |
         ↓                        ↓
  Cuando un libro         Cuando el libro
  está disponible         queda libre, el
                          primero en cola
                          recibe atención
         |
         ↓
  [Pila - Historial]
  Cada préstamo o
  devolución queda
  registrado y puede
  revertirse la última
  operación realizada
         |
         ↓
  [Árbol binario]
  El libro se organiza
  según su género dentro
  de la jerarquía de
  categorías literarias
```

---

## Flujo general de funcionamiento

1. Se agrega un nuevo libro a la **lista enlazada**.
2. El libro se clasifica dentro del **árbol binario** según su género.
3. Un usuario solicita el libro y entra a la **cola de reservas**.
4. Cuando el libro queda disponible, el primer usuario de la cola es atendido.
5. La operación se almacena en la **pila** del historial.
6. Si ocurre un error, se consulta la pila para revertir la última acción.

---

## Comparación de las estructuras implementadas

| Estructura      | Principio      | Operación principal      | Función dentro del sistema         |
|-----------------|----------------|---------------------------|------------------------------------|
| Lista enlazada  | Dinámica       | Insertar / eliminar       | Gestión de libros                  |
| Pila            | LIFO           | Push / Pop                | Historial de préstamos             |
| Cola            | FIFO           | Enqueue / Dequeue         | Reservas de usuarios               |
| Árbol binario   | Jerárquico     | Insertar / recorrer       | Organización de géneros            |

---

*Documento desarrollado como actividad de la Semana 13 – Aplicación de Estructuras de Datos.*
