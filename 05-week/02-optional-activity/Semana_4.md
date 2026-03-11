# 📊 Práctica de Programación  
## Análisis de Ventas Semanales en Java

### 👨‍💻 Lenguaje: Java

---

## 📝 Descripción de la actividad

En esta práctica se desarrolló un programa en **Java** que permite registrar y analizar las ventas realizadas durante una semana completa.

Para lograrlo se utilizó un **arreglo de siete posiciones**, donde cada posición representa un día específico de la semana. El programa solicita al usuario ingresar las ventas diarias y posteriormente realiza diferentes cálculos para analizar la información registrada.

Este ejercicio ayuda a reforzar conceptos importantes de programación como el uso de **arreglos, ciclos, variables acumuladoras y estructuras condicionales**.

---

## 🎯 Objetivo de la práctica

El propósito de esta actividad es aplicar conceptos básicos de programación para trabajar con datos numéricos almacenados en un arreglo.

Las operaciones que realiza el programa son:

- Recorrer un arreglo mediante un ciclo `for`.
- Registrar valores ingresados por el usuario.
- Calcular la **suma total de las ventas**.
- Obtener el **promedio semanal de ventas**.
- Identificar la **venta más alta**.
- Identificar la **venta más baja**.
- Contar cuántos días tuvieron **ventas mayores a 100**.

Estas operaciones son comunes en sistemas que analizan datos financieros o estadísticos.

---

## ⚙️ Funcionamiento del programa

El programa sigue los siguientes pasos:

1. Se declara un **arreglo de 7 posiciones** para almacenar las ventas de cada día.
2. Se utiliza un segundo arreglo que contiene los **nombres de los días de la semana**.
3. El usuario ingresa el valor de las ventas correspondientes a cada día.
4. Luego el programa recorre el arreglo para:
   - Mostrar las ventas registradas.
   - Calcular la suma total.
   - Determinar la venta mayor y la menor.
   - Contar los días con ventas superiores a 100.
5. Finalmente se calcula el promedio y se muestran todos los resultados en la consola.

---
## 📷 Evidencia de ejecución

La siguiente imagen muestra la ejecución del programa en la consola. En ella se puede observar el proceso de ingreso de las ventas correspondientes a cada día de la semana y los resultados generados por el sistema después de procesar la información.

![Evidencia del programa](https://github.com/GiovannyPuentes/estructura-datos-2026-a-g1/blob/main/05-week/02-optional-activity/2a6d2b0d-f8b8-48e0-b111-22729e8c3645.jpg)

---

## 🧠 Conclusión

Esta actividad permitió aplicar el uso de **arreglos en Java** para almacenar múltiples valores dentro de una misma estructura de datos. Además, se practicó el uso de **ciclos para recorrer los elementos del arreglo** y realizar diferentes operaciones como la suma de valores, la búsqueda del mayor y el menor, y el conteo de condiciones específicas.

El ejercicio también ayudó a reforzar la lógica de programación al trabajar con datos ingresados por el usuario y generar resultados a partir de ellos. Este tipo de prácticas son fundamentales para comprender el manejo de información dentro de los programas y sirven como base para el estudio de estructuras de datos más avanzadas.

## 💻 Código en Java

```java
package Repaso;

import java.util.Scanner;

public class VentasSemana {
    public static void main(String[] args) {

        // Objeto para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Arreglo que almacenará las ventas de los 7 días
        double[] ventas = new double[7];

        // Arreglo auxiliar para mostrar los nombres de los días
        String[] dias = {
                "Lunes", "Martes", "Miércoles",
                "Jueves", "Viernes", "Sábado", "Domingo"
        };

        // Variables para cálculos
        double suma = 0;
        double promedio;
        double max;
        double min;
        int contadorMayores100 = 0;

        // Ingreso de datos
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("Ingrese la venta del " + dias[i] + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // Inicialización de valores máximo y mínimo
        max = ventas[0];
        min = ventas[0];

        System.out.println("\n-------------------------------");
        System.out.println("     VENTAS DE LA SEMANA");
        System.out.println("-------------------------------");

        // Recorrido del arreglo
        for (int i = 0; i < ventas.length; i++) {

            System.out.println(dias[i] + ": " + ventas[i]);

            suma += ventas[i];

            if (ventas[i] > max) {
                max = ventas[i];
            }

            if (ventas[i] < min) {
                min = ventas[i];
            }

            if (ventas[i] > 100) {
                contadorMayores100++;
            }
        }

        // Cálculo del promedio
        promedio = suma / ventas.length;

        System.out.println("\n-------------------------------");
        System.out.println("RESULTADOS");
        System.out.println("-------------------------------");

        System.out.println("Venta total: " + suma);
        System.out.println("Promedio de ventas: " + promedio);
        System.out.println("Venta más alta: " + max);
        System.out.println("Venta más baja: " + min);
        System.out.println("Días con ventas mayores a 100: " + contadorMayores100);

        scanner.close();
    }
}
