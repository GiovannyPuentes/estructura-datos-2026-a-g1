# Estudiante: Giovanny Andrey Puentes Alape

# Semana 11 – Actividad: Árbol de Organización Empresarial

## Introducción

En este documento se presenta la representación de una estructura organizacional mediante un árbol, aplicando los conceptos fundamentales estudiados en la Semana 11, tales como raíz, nodos internos, hojas, niveles y relaciones entre padre e hijo.

---

## Representación del árbol

```text
               Gerente General           ← Nivel 0 (Raíz)
               /              \
      Área Administrativa   Área Operativa   ← Nivel 1 (Nodos internos)
          /        \           /        \
    Trabajador 1 Trabajador 2 Trabajador 3 Trabajador 4  ← Nivel 2 (Hojas)
```

---

## Componentes del árbol

| Elemento             | Nodo(s)                                                        |
|----------------------|----------------------------------------------------------------|
| **Nodo raíz**        | Gerente General                                                |
| **Nodos internos**   | Área Administrativa, Área Operativa                            |
| **Nodos hoja**       | Trabajador 1, Trabajador 2, Trabajador 3, Trabajador 4         |
| **Altura del árbol** | 2 (correspondiente a los niveles 0, 1 y 2)                     |

---

## Descripción de los elementos

### Nodo raíz
El **Gerente General** corresponde al nodo principal del árbol. Este nodo no depende de ningún otro y representa el nivel de autoridad más alto dentro de la organización empresarial.

### Nodos internos
Las áreas **Administrativa** y **Operativa** son consideradas nodos internos, debido a que poseen un nodo padre y también nodos hijos. Ambos dependen del Gerente General y supervisan a los trabajadores de cada área.

### Nodos hoja
Los **Trabajadores 1, 2, 3 y 4** representan los nodos hoja, ya que no poseen descendientes dentro de la estructura. Cada trabajador depende directamente de su respectiva área.

### Altura del árbol
La altura del árbol es igual a **2**, porque el recorrido más largo desde la raíz hasta una hoja contiene dos conexiones o aristas.

```text
Gerente General → Área Administrativa → Trabajador 1
```

Aunque la estructura cuenta con tres niveles en total (0, 1 y 2), la altura se calcula únicamente mediante la cantidad de enlaces entre nodos.

---

## Relaciones padre e hijo

| Nodo padre           | Nodos hijos                                   |
|----------------------|-----------------------------------------------|
| Gerente General      | Área Administrativa, Área Operativa           |
| Área Administrativa  | Trabajador 1, Trabajador 2                    |
| Área Operativa       | Trabajador 3, Trabajador 4                    |
| Trabajador 1         | _(sin hijos — nodo hoja)_                     |
| Trabajador 2         | _(sin hijos — nodo hoja)_                     |
| Trabajador 3         | _(sin hijos — nodo hoja)_                     |
| Trabajador 4         | _(sin hijos — nodo hoja)_                     |

---

## ¿Por qué esta estructura corresponde a un árbol?

- Presenta una jerarquía claramente organizada.
- Cada nodo tiene un único padre, excepto la raíz.
- No existen ciclos ni conexiones repetidas.
- La estructura se divide en diferentes ramas y niveles.
- Representa adecuadamente las relaciones de dependencia dentro de la empresa.

---

## Comparación entre una estructura lineal y un árbol

| Característica            | Estructura lineal              | Árbol organizacional                     |
|---------------------------|--------------------------------|------------------------------------------|
| Organización              | Secuencial                     | Jerárquica                               |
| Relación entre elementos  | Uno después del otro           | Relaciones padre e hijo                  |
| Ejemplo                   | Lista de empleados             | Organigrama empresarial                  |
| Forma de recorrido        | Adelante y atrás               | Por niveles y ramas                      |

---

*Documento desarrollado como actividad de la Semana 11 – Conceptos básicos de árboles.*
