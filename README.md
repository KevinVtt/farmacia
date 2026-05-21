# PROYECTO BD2 - Farmacia

## Verificacion de la base de datos.
- Primero que nada, instalar MongoDB Server Community
- Ejecutar en el cmd mongod --version
- Abrir el cmd como administrador y ejecutar la siguiente linea: `mongod`
- Luego, abrir otra pestaña del cmd y ejecutar la siguiente linea `mongosh`

## Variables de entorno
- Dentro del proyecto se encuentra la carpeta .env-example es donde vamos a tener guardado la URI para conectarse a nuestra base de datos, normalmente si lo instalamos por default sin hacer ningun cambio la URI es la siguiente: `mongodb://localhost:27017`
- Despues, reemplazamos el nombre del archivo .env-example por .env
