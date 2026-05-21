# Estudiante: Giovanny Andrey Puentes Alape

# Semana 14 – Actividad: Introducción a la Eficiencia Algorítmica

## Introducción

En este documento se realiza un análisis comparativo entre dos algoritmos, con el objetivo de identificar cuál presenta un crecimiento más rápido al aumentar la cantidad de datos y cuál ofrece un mejor rendimiento en tiempo de ejecución.

---

## Algoritmos evaluados

### Algoritmo A

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### Algoritmo B

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

---

## Cantidad de operaciones realizadas

### Algoritmo A — Ciclo simple

El algoritmo ejecuta un único ciclo que se repite `n` veces. En cada iteración se realiza una sola operación de impresión.

| Tamaño de datos (n) | Número de operaciones |
|---------------------|-----------------------|
| 10                  | 10                    |
| 100                 | 100                   |
| 1.000               | 1.000                 |
| 10.000              | 10.000                |

El crecimiento de operaciones es directamente proporcional al tamaño de los datos. Cuando `n` aumenta, el número de operaciones crece de manera lineal.

### Algoritmo B — Ciclos anidados

En este caso existe un ciclo dentro de otro ciclo. El ciclo externo se ejecuta `n` veces y, por cada repetición, el ciclo interno también se repite `n` veces. Por esta razón, el total de operaciones corresponde a `n²`.

| Tamaño de datos (n) | Número de operaciones |
|---------------------|-----------------------|
| 10                  | 100                   |
| 100                 | 10.000                |
| 1.000               | 1.000.000             |
| 10.000              | 100.000.000           |

El crecimiento ocurre de forma cuadrática, por lo que al incrementar el tamaño de entrada, las operaciones aumentan mucho más rápido.

---

## Representación visual del crecimiento

```text
Operaciones
    |
100M|                                          ● B
    |
 10M|                             ● B
    |
 1M |                  ● B
    |
100K|
    |
 10K|        ● B          ● A
    |
  1K|              ● A
    |
 100|   ● B    ● A
    |
  10|   ● A
    |__________________________________ n
         10   100  1.000  10.000
```

El Algoritmo A mantiene un crecimiento constante y controlado, mientras que el Algoritmo B incrementa rápidamente su cantidad de operaciones.

---

## Complejidad Big-O

| Algoritmo   | Complejidad | Interpretación                                      |
|-------------|-------------|-----------------------------------------------------|
| Algoritmo A | O(n)        | El crecimiento es proporcional al tamaño de entrada |
| Algoritmo B | O(n²)       | El crecimiento ocurre al cuadrado                   |

- **O(n)** → si el tamaño de los datos aumenta 10 veces, el tiempo también aumenta 10 veces.
- **O(n²)** → si el tamaño aumenta 10 veces, el tiempo puede aumentar hasta 100 veces.

---

## ¿Cuál algoritmo crece más rápido?

El **Algoritmo B** presenta un crecimiento considerablemente mayor. Por ejemplo, con `n = 1.000`, el Algoritmo A realiza únicamente 1.000 operaciones, mientras que el Algoritmo B ejecuta 1.000.000.

A medida que el tamaño de los datos aumenta, la diferencia entre ambos algoritmos se vuelve mucho más evidente.

---

## ¿Cuál algoritmo es más eficiente?

El **Algoritmo A** resulta más eficiente debido a las siguientes razones:

1. Solo utiliza un ciclo de repetición.
2. El crecimiento de operaciones es lineal y predecible.
3. Consume mucho menos tiempo cuando trabaja con grandes cantidades de datos.
4. Mantiene un comportamiento escalable incluso con entradas grandes.

Por otro lado, el Algoritmo B puede funcionar correctamente con cantidades pequeñas de datos, pero se vuelve poco práctico cuando el tamaño de entrada aumenta considerablemente.

---

## Comparación entre eficiencia temporal y espacial

| Tipo de eficiencia | Algoritmo A                      | Algoritmo B                           |
|--------------------|----------------------------------|---------------------------------------|
| **Tiempo**         | O(n) — eficiente                 | O(n²) — menos eficiente               |
| **Espacio**        | O(1) — utiliza una variable      | O(1) — utiliza dos variables          |

En ambos casos, el consumo de memoria es prácticamente igual, ya que únicamente se utilizan variables contadoras. La diferencia principal se encuentra en el tiempo de ejecución.

---

## Conclusión

Un algoritmo eficiente no solamente debe producir resultados correctos, sino hacerlo utilizando la menor cantidad posible de tiempo y recursos. El Algoritmo A representa una solución eficiente y escalable gracias a su complejidad lineal O(n). En contraste, el Algoritmo B incrementa rápidamente su tiempo de ejecución debido a sus ciclos anidados O(n²).

Seleccionar correctamente los algoritmos y estructuras de datos desde el diseño inicial permite construir soluciones más rápidas, eficientes y adaptables a grandes volúmenes de información.

---

*Documento desarrollado como actividad de la Semana 14 – Introducción a la Eficiencia Algorítmica.*
