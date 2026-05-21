# Estudiante: Giovanny Andrey Puentes Alape

# Semana 12 – Actividad: Árbol Binario Básico

## Introducción

En este documento se desarrolla la representación de un árbol binario utilizando las letras **M, F, T, A, H, R y Z**, aplicando la regla fundamental de este tipo de estructura: cada nodo puede tener como máximo dos hijos, uno izquierdo y otro derecho.

---

## Representación gráfica del árbol

```text
              M                  ← Nivel 0 (Raíz)
            /   \
           F     T               ← Nivel 1 (Nodos internos)
          / \   / \
         A   H R   Z             ← Nivel 2 (Hojas)
```

---

## Identificación de los componentes

| Elemento            | Nodo(s)                              |
|---------------------|--------------------------------------|
| **Nodo raíz**       | M                                    |
| **Nodos internos**  | F, T                                 |
| **Nodos hoja**      | A, H, R, Z                           |
| **Altura**          | 2 (niveles 0, 1 y 2)                 |

---

## Explicación de los elementos

### Nodo raíz
El nodo **M** corresponde a la raíz del árbol, ya que es el punto principal desde donde se desprenden todos los demás nodos. Este nodo no posee padre y representa el inicio de la estructura jerárquica.

### Nodos internos
Los nodos **F** y **T** son considerados nodos internos porque tienen un nodo padre y también poseen nodos hijos. Ambos se encuentran ubicados en el nivel 1 del árbol binario.

- F → hijo izquierdo: A | hijo derecho: H
- T → hijo izquierdo: R | hijo derecho: Z

Cada uno cumple correctamente la propiedad de un árbol binario, teniendo únicamente dos hijos como máximo.

### Nodos hoja
Los nodos **A, H, R y Z** son hojas porque no poseen descendientes. Todos ellos se encuentran en el nivel 2 y sus referencias izquierda y derecha contienen el valor `null`.

### Altura del árbol
La altura del árbol es igual a **2**, debido a que el recorrido más largo desde la raíz hasta una hoja contiene dos aristas.

```text
M → F → A
```

Esto significa que, aunque el árbol posee tres niveles, la altura se calcula mediante la cantidad de conexiones entre nodos.

---

## Estructura interna de un nodo

Cada nodo dentro del árbol binario almacena tres elementos principales:

```text
Nodo:
    dato
    izquierdo
    derecho
```

| Nodo | Dato | Hijo izquierdo | Hijo derecho |
|------|------|----------------|--------------|
| 1    | M    | F              | T            |
| 2    | F    | A              | H            |
| 3    | T    | R              | Z            |
| 4    | A    | null           | null         |
| 5    | H    | null           | null         |
| 6    | R    | null           | null         |
| 7    | Z    | null           | null         |

---

## Relaciones entre padres e hijos

| Padre | Hijo izquierdo | Hijo derecho |
|-------|----------------|--------------|
| M     | F              | T            |
| F     | A              | H            |
| T     | R              | Z            |
| A     | _(hoja)_       | _(hoja)_     |
| H     | _(hoja)_       | _(hoja)_     |
| R     | _(hoja)_       | _(hoja)_     |
| Z     | _(hoja)_       | _(hoja)_     |

---

## ¿Por qué esta estructura corresponde a un árbol binario?

- Cada nodo tiene un máximo de dos hijos.
- Existe una única raíz llamada **M**.
- No hay ciclos ni conexiones repetidas entre nodos.
- Las hojas tienen referencias vacías (`null`) en sus hijos izquierdo y derecho.
- La estructura mantiene una organización jerárquica y ordenada.

---

## Comparación entre un árbol general y un árbol binario

| Característica         | Árbol general                   | Árbol binario                        |
|------------------------|---------------------------------|--------------------------------------|
| Número de hijos        | Puede ser ilimitado             | Máximo dos hijos                     |
| Tipo de organización   | Jerárquica                      | Jerárquica y limitada                |
| Ejemplo                | Organigrama empresarial         | Árbol con letras M, F, T, A, H, R, Z |
| Uso frecuente          | Estructuras organizacionales    | Búsquedas y recorridos               |

---

*Documento desarrollado como actividad de la Semana 12 – Árbol Binario Básico.*
