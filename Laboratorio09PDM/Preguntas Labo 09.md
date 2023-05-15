# Preguntas Laboratorio 09

1. ¿Qué es una coroutine en Kotlin y cómo se diferencia de un hilo  
tradicional?
R/ Mecanismo de programación que permite escribir código de manera secuencial y estructurada; a diferencia de un hilo tradicional las coroutines son concurrencia cooperativa, lo que permite al programador tener el control para decidir cuando se suspenden y reanudan.

2. ¿Cuál es la importancia de la suspensión en las coroutines y cómo se  
implementa?
R/ Permiten suspender momentanemente la ejecución de una coroutine sin obstruir el main thread; se implementa con la palabra **"Suspend"**.

3. ¿Cuál es el propósito del Dispatcher en las coroutines y cómo se elige  
uno adecuado para cada tarea?
R/ Especificar en que hilo se ejecuta una coroutine, se elige según sea el contexto de la funcionalidad si queremos desactivar la ui mientras se carga usamos **Dispatchers.Main**; para operaciones de entrada y salida de datos intensivas "**Dispatchers.IO** o si queremos tareas de computación intensiva utilizamos **Dispatchers.Default**.

4. ¿Cuál es el propósito y el uso de la función async en las coroutines?
R/ Su propósito es lanzar courutines de manera asíncrona, siendo útil cuando se deben de ejecutar tareas concurrentes y combinar resultados. 
