# Taller 1 – Estructura de datos

## Aplicación analizada
- Estudiante: Giovanny Andrey Puentes Alape.
- Facultad: Ingenieria en sistemas. 
- App analizada: WhatsApp.


![WhatsApp](https://i.blogs.es/f1ded1/whatsapp-promo/650_1200.png)
---

## Descripción

Se analiza cómo una aplicación de mensajería maneja y organiza datos cotidianos. Se identifican tipos de datos clave y se propone cómo podrían estructurarse internamente usando estructuras de datos.

---

## Tipos de datos y organización

### 1. Contactos

**Qué son:**  
Lista de usuarios con nombre, número de teléfono, foto de perfil y estado.

**Organización propuesta:**
- Hash map (diccionario) donde la clave es el número o ID del usuario.
- Permite búsquedas rápidas O(1).
- Base de datos con índices por ID y número telefónico.

**Operaciones comunes:**
- Buscar contacto
- Actualizar estado o foto
- Sincronizar lista

---

### 2. Chats y mensajes

**Qué son:**  
Conversaciones que contienen mensajes con texto, fecha, remitente y estado.

**Organización propuesta:**
- Tabla de chats
- Tabla de mensajes vinculada por chat_id
- Lista ordenada cronológicamente
- Índices por fecha para cargar mensajes recientes rápido

**Operaciones comunes:**
- Añadir mensaje
- Mostrar últimos mensajes
- Marcar como leído

---

### 3. Archivos multimedia

**Qué son:**  
Fotos, audios y videos enviados en mensajes.

**Organización propuesta:**
- Archivos almacenados como objetos externos
- Tabla de metadatos que guarda referencias
- Uso de caché para descargas rápidas

**Operaciones comunes:**
- Subir archivos
- Descargar archivos
- Eliminar contenido

---

### 4. Grupos

**Qué son:**  
Conjuntos de usuarios con configuración compartida.

**Organización propuesta:**
- Tabla de grupos
- Tabla relacional de miembros
- Conjuntos hash para verificar pertenencia

**Operaciones comunes:**
- Añadir miembros
- Eliminar miembros
- Consultar participantes

---
## Conclusion

La aplicación combina estructuras rápidas en memoria (diccionarios y listas) con almacenamiento persistente en bases de datos. Esta combinación permite eficiencia, escalabilidad y acceso inmediato a la información.

## Bibliografía

1. Documentación oficial de WhatsApp. https://www.whatsapp.com
