# 📘 Actividad Práctica  
## Arreglos unidimensionales y análisis de notas

### Estudiante: Giovanny Andrey Puentes Alape

---

## Descripción de la actividad

En esta práctica se desarrolló un programa en Java enfocado en el uso de **arreglos unidimensionales** para registrar y analizar las notas de un estudiante.

El objetivo principal fue poner en práctica conceptos fundamentales de programación como:

- Uso de tipos de datos.
- Declaración y utilización de arreglos.
- Recorrido de estructuras mediante ciclos.
- Cálculo de promedios.
- Uso de estructuras condicionales para tomar decisiones.

---

## Conceptos aplicados

### 1. Tipos de datos

Durante el desarrollo del programa se utilizaron diferentes tipos de datos para almacenar la información correctamente.

Los principales fueron:

- **double**: utilizado para almacenar las notas y el promedio, ya que permite manejar números decimales.
- **int**: utilizado como variable de control dentro del ciclo `for`.
- **boolean (implícito en la condición)**: utilizado al momento de evaluar si el estudiante aprueba o no.

Elegir el tipo de dato adecuado permite que el programa funcione correctamente y que las operaciones matemáticas se realicen sin errores.

---

### 2. Arreglo unidimensional

Se utilizó un **arreglo unidimensional de tipo `double` con 5 posiciones** para guardar las notas del estudiante.

Un arreglo permite almacenar varios valores del mismo tipo dentro de una sola estructura, donde cada elemento se identifica mediante un **índice que comienza en 0**.

En el programa se aplicaron las siguientes características:

- Tamaño definido al momento de declarar el arreglo.
- Acceso a cada valor mediante su índice.
- Recorrido completo utilizando un ciclo `for`.

---

### 3. Recorrido del arreglo

Para trabajar con las notas almacenadas se utilizó un **ciclo `for`**, el cual permitió:

1. Solicitar al usuario el ingreso de las 5 notas.
2. Mostrar todas las notas registradas.
3. Acumular la suma total de las calificaciones.

El recorrido del arreglo facilita el acceso a cada posición de manera ordenada.

---

### 4. Cálculo del promedio

El promedio de las notas se calculó utilizando la siguiente fórmula:

promedio = suma / cantidad_de_notas

Donde:

- **suma** corresponde a la acumulación de todas las notas.
- **cantidad_de_notas** representa el tamaño del arreglo.

Este cálculo permite conocer el rendimiento general del estudiante.

---

### 5. Evaluación del resultado

Para determinar si el estudiante aprobó o no, se utilizó una **estructura condicional `if`**.

La condición evaluada fue:

promedio ≥ 3.0

Si el promedio es mayor o igual a **3.0**, el estudiante aprueba.  
Si el promedio es menor, el estudiante no alcanza el promedio mínimo requerido.

---

## Evidencia de ejecución

A continuación se muestra una captura de pantalla donde se observa la ejecución del programa en la consola, incluyendo el ingreso de las notas, la lista de notas registradas y el cálculo del promedio.

![Evidencia de ejecución](https://github.com/GiovannyPuentes/estructura-datos-2026-a-g1/blob/main/04-week/02-optional-activity/4510c976-42fe-4e05-8f94-d05d45a40561.jpg)

---

## Código en Java

```java
package Repaso;

import java.util.Scanner;

public class AnalisisNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Encabezado decorativo
        System.out.println("======================================");
        System.out.println("      SISTEMA DE ANÁLISIS DE NOTAS    ");
        System.out.println("======================================\n");

        // Declaración del arreglo
        double[] notas = new double[5];
        double suma = 0;
        double promedio;

        // Ingreso de las notas
        System.out.println("Ingrese las 5 notas del estudiante:\n");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("➤ Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Mostrar las notas
        System.out.println("\n--------------------------------------");
        System.out.println("         LISTA DE NOTAS");
        System.out.println("--------------------------------------");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " → " + notas[i]);
            suma += notas[i];
        }

        // Calcular promedio
        promedio = suma / notas.length;

        System.out.println("\n--------------------------------------");
        System.out.printf("Promedio del estudiante: %.2f%n", promedio);
        System.out.println("--------------------------------------");

        // Evaluar si aprobó
        if (promedio >= 3.0) {
            System.out.println("🎓 Resultado: APROBADO");
            System.out.println("Excelente trabajo, sigue así.");
        } else {
            System.out.println("⚠️ Resultado: NO APROBADO");
            System.out.println("Debes esforzarte más para mejorar tus notas.");
        }

        // Mensaje final
        System.out.println("\n======================================");
        System.out.println("        PROGRAMA FINALIZADO");
        System.out.println("======================================");

        scanner.close();
    }
}

---
## Conclusión

Esta actividad permitió comprender la importancia de:

- Seleccionar correctamente los tipos de datos.
- Utilizar arreglos para organizar información homogénea.
- Recorrer estructuras de datos mediante ciclos.
- Aplicar operaciones matemáticas sobre conjuntos de datos.
- Implementar estructuras condicionales para la toma de decisiones.

El ejercicio fortalece la base lógica necesaria para trabajar posteriormente con estructuras de datos más complejas.
