# Taller 1 – Estructura de datos

##  Estudiante: Giovanny Andrey Puentes Alape

## Aplicaciones seleccionadas:
- WhatsApp
- Facebook

![texto alternativo](https://i.blogs.es/41f392/whatsapp-compartir-estados-facebook/840_560.jpeg)
---
## 💬 WHATSAPP

### 1️⃣ Tipo de dato: Contactos
**Datos que maneja:**
- Nombre del contacto
- Número de teléfono
- Foto de perfil
- Estado
- Última conexión

**Organización:**
Podrían organizarse en una **lista o arreglo**, donde cada contacto es un registro con diferentes atributos.

Ejemplo:
- Lista de contactos
  - Contacto 1
  - Contacto 2
  - Contacto 3

### 2️⃣ Tipo de dato: Mensajes
**Datos que maneja:**
- Usuario que envía el mensaje
- Usuario que recibe el mensaje
- Texto, imagen, audio o archivo
- Fecha y hora
- Estado del mensaje (enviado, entregado, leído)

**Organización:**
Podrían organizarse mediante una **cola o lista ordenada por tiempo**, donde los mensajes aparecen en orden cronológico dentro de cada chat.

### 3️⃣ Tipo de dato: Chats o conversaciones
**Datos que maneja:**
- Participantes del chat
- Historial de mensajes
- Archivos enviados
- Fecha del último mensaje

**Organización:**
Podrían organizarse como una **lista de conversaciones**, donde cada conversación contiene a su vez una lista de mensajes.

---

## 📘 FACEBOOK

### 1️⃣ Tipo de dato: Usuarios
**Datos que maneja:**
- Nombre
- Correo electrónico
- Foto de perfil
- Información personal
- Lista de amigos

**Organización:**
Podrían organizarse mediante una **estructura tipo registro u objeto**, donde cada usuario tiene múltiples atributos asociados.

Ejemplo:
- Lista de usuarios
  - Usuario A
  - Usuario B
  - Usuario C

### 2️⃣ Tipo de dato: Publicaciones
**Datos que maneja:**
- Texto, imagen o video
- Usuario que publica
- Fecha de publicación
- Número de reacciones
- Comentarios y compartidos

**Organización:**
Podrían organizarse en una **lista dinámica ordenada por fecha**, donde las publicaciones más recientes aparecen primero en el feed.

### 3️⃣ Tipo de dato: Relaciones de amistad
**Datos que maneja:**
- Usuarios conectados como amigos
- Solicitudes de amistad
- Seguidores

**Organización:**
Podría representarse como un **grafo**, donde cada usuario es un nodo y las amistades representan las conexiones entre ellos.

---

## Conclusión

En aplicaciones como WhatsApp y Facebook también se utilizan diferentes **estructuras de datos** para organizar la información, entre ellas:

- Listas
- Colas
- Grafos
- Registros

Esto demuestra que las estructuras de datos son fundamentales para almacenar, organizar y gestionar grandes cantidades de información en aplicaciones que usamos todos los días.

### Descripcion de la evidencia - Mensajes en WhatsApp
<img src="https://media.gq.com.mx/photos/5faac1426c551485f99e3509/16:9/w_2560%2Cc_limit/GettyImages-1158629491-whatsapp.jpg" width="550">

Desde el punto de vista estructural, los **mensajes de WhatsApp** pueden representarse como una **estructura tipo lista o cola**, ya que los mensajes se organizan cronológicamente dentro de cada conversación.

Ejemplo de estructura:

- Conversación
  - Mensaje 1
  - Mensaje 2
  - Mensaje 3
  - Mensaje 4

Cada mensaje almacena:
- Usuario que envía el mensaje
- Usuario que recibe el mensaje
- Contenido (texto, imagen, audio, video o archivo)
- Fecha y hora
- Estado del mensaje (enviado, entregado, leído)

**Orden:**  
Los mensajes aparecen organizados **de forma cronológica**, donde los más antiguos aparecen primero y los más recientes al final del chat.

**Operaciones identificables:**
- Enviar mensaje
- Recibir mensaje
- Eliminar mensaje
- Reaccionar a un mensaje
- Buscar mensajes dentro del chat
- Recorrer el historial de la conversación

### Descripcion de la evidencia - Publicaciones en FaceBook
<img src="https://about.fb.com/ltam/wp-content/uploads/sites/14/2022/07/HomeandFeeds_Android.png" width="550">

Desde el punto de vista estructural, las **publicaciones de Facebook** pueden representarse como una **lista dinámica o arreglo ordenado**, ya que aparecen organizadas dentro del feed de la plataforma.

Ejemplo de estructura:

- Feed de Facebook
  - Publicación 1
  - Publicación 2
  - Publicación 3
  - Publicación 4

Cada publicación almacena:
- Usuario que publica
- Texto, imagen o video
- Fecha y hora de publicación
- Número de reacciones (like, me encanta, etc.)
- Comentarios
- Número de compartidos

**Orden:**  
Las publicaciones aparecen dentro del **Feed**, que es la lista de contenido que ves al entrar a Facebook y se actualiza constantemente con publicaciones de amigos, páginas y grupos que sigues. :contentReference[oaicite:0]{index=0}  

**Operaciones identificables:**
- Crear publicación
- Editar publicación
- Eliminar publicación
- Dar reacción (like, me gusta, etc.)
- Comentar publicación
- Compartir publicación
- Recorrer el feed de publicaciones
  
