# Taller-clase-4-y-3
Este programa en Java permite registrar la información de un propietario de mascotas, junto con sus mascotas y las consultas veterinarias que ha tenido cada una. La información se ingresa a través de la consola y está organizada de forma estructurada usando clases como Propietario, Mascota, Veterinario y Consulta.

¿Qué hace este programa?
-Primero, se solicita al usuario que ingrese el nombre, número de documento y teléfono del propietario. Esta información se guarda en un objeto Propietario.
- Después, el usuario debe indicar cuántas mascotas va a registrar. Por cada mascota se pide el nombre, la especie (por ejemplo, perro o gato) y la edad. Cada mascota queda asociada al propietario.
- A cada mascota se le pueden agregar una o varias consultas (o ninguna). Para cada consulta, se genera un código automáticamente y se pide:
*Fecha de la consulta
*Nombre del veterinario
*Especialidad del veterinario
Esta información se guarda en un objeto Consulta, que a su vez contiene un objeto Veterinario.

En conclusion
Al terminar el registro, el programa imprime toda la información completa de las mascotas del propietario y sus consultas, mostrando una especie de ficha clínica.
-En cuanto a la estructura del codigo, este hace uso de estructuras como do-while y while para validar que se ingresen al menos una mascota y cero o más consultas, según el caso. También se hace uso de clases personalizadas y composición de objetos para mantener la lógica del programa organizada y clara.
