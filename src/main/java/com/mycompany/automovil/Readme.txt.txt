Descripción:
Esta aplicación es un sistema de gestión de automóviles desarrollado en Java, que implementa un CRUD completo (Crear, Leer, Actualizar y Eliminar) utilizando JPA (Java Persistence API) para la persistencia de datos en una base de datos MySQL.

El objetivo del proyecto es registrar, consultar, modificar y eliminar automóviles de una concesionaria mediante una interfaz gráfica, reflejando todos los cambios directamente en la base de datos.

Tecnologias utilizadas : 
Java

JPA (Hibernate)

MySQL

XAMPP (para la base de datos, aunque puede usarse cualquier servidor MySQL)

NetBeans

Swing (JFrame) para la interfaz gráfica

FUNCIONALIDAD:

Interfaz Principal
Desde la ventana principal se puede acceder a las siguientes opciones:

Alta de Automóviles

Consulta, edicion y baja 

salir


🔹 Alta de Automóvil

Permite registrar un nuevo automóvil en la base de datos ingresando los datos solicitados, como por ejemplo:

Marca

Modelo

Patente

Color

Cantidad de puertas

Motor

Una vez confirmada el alta, el automóvil queda almacenado en la base de datos.

🔹 Consulta de Automóviles

Muestra una tabla con todos los automóviles registrados en la base de datos.

Desde esta interfaz se puede:

Eliminar un automóvil

Se debe seleccionar un auto de la tabla.

Si no se selecciona ninguno, se muestra una ventana de error indicando que no se puede eliminar.

Modificar un automóvil

Se debe seleccionar un auto de la tabla.

Se abre una nueva interfaz con los datos del automóvil seleccionado.

Se pueden modificar todos los campos excepto el ID, ya que es la clave primaria (Primary Key) en la base de datos.






Base de Datos

La aplicación utiliza una base de datos MySQL llamada:

automovil


Para ejecutar el proyecto correctamente:

Tener un servidor MySQL en funcionamiento
(por ejemplo, mediante XAMPP, aunque puede usarse cualquier otro).

Crear una base de datos con el nombre automovil.
Una vez creada la base de datos, la aplicación podrá conectarse y operar sin problemas.



Ejecución del Proyecto

La aplicación se inicia desde la clase main, que abre la interfaz principal del sistema.

Desde allí, el usuario puede navegar entre las distintas ventanas para gestionar los automóviles.



