# parcial 2 - Investigaciones realizadas 
### Por Jurgen Sanclemente
A continuacion se anexan las preguntas y sus respectivas respuestas en el parcial del segundo corte.

## 1. Dentro de este mismo documento deberá investigar y colocar el significado de cada una de las dependencias de spring descritas anteriormente (SpringWeb, SpringDevTools, SpringDataJPA, PosgresDriver, )

- Spring Web: Esta dependencia proporciona soporte para crear aplicaciones web utilizando el framework Spring. Incluye funcionalidades como controladores, manejo de peticiones HTTP, vistas, entre otros. 
- Spring Dev Tools: Spring Dev Tools es una colección de herramientas que facilitan el desarrollo de aplicaciones Spring Boot. Incluye capacidades de reinicio automático de la aplicación cuando se detectan cambios en el código fuente, lo que agiliza el ciclo de desarrollo al evitar la necesidad de reiniciar manualmente el servidor.
- Spring Data JPA: Spring Data JPA es una capa de abstracción que simplifica el acceso a bases de datos relacionales desde aplicaciones Spring
PostgresDriver: Esta referencia parece ser la dependencia del controlador JDBC (Java Database Connectivity) para PostgreSQL. JDBC es un estándar de Java que define cómo se pueden acceder a las bases de datos desde aplicaciones Java

## 2. Debe investigar y colocar en este documento el significado de cada uno de los decoradores que se encuentra en esta clase. (@Id, @GeneratedValue, @Column, @Temporal, @PrePersist, @Entity, @Table)

- @Id: Esta anotación se utiliza para marcar una propiedad de una clase como la clave primaria de una entidad en JPA. 
- @GeneratedValue: Se utiliza en combinación con @Id para especificar cómo se generará el valor de la clave primaria
- @Column: Esta anotación se utiliza para especificar el mapeo entre el atributo de una entidad y la columna de la base de datos. 
- @Temporal: Se utiliza para especificar el tipo de mapeo temporal de un atributo de fecha o hora en una entidad. Puede ser utilizado con los tipos de datos java.util.Date, java.util.Calendar y java.time.LocalDate, java.time.LocalDateTime, java.time.LocalTime en JPA para indicar cómo se debe persistir el atributo temporalmente en la base de datos.
- @PrePersist: Esta anotación se utiliza para marcar un método que se debe ejecutar justo antes de que se persista una entidad en la base de datos. 
- @Entity: Se utiliza para marcar una clase como una entidad JPA, lo que indica que la clase debe ser mapeada a una tabla en la base de datos
- @Table: Esta anotación se utiliza para especificar el nombre de la tabla de base de datos a la que se debe asignar una entidad. 

## 3. Investigar y colocar dentro del este documento el concepto del decorador Transaction.

- El decorador @Transactional es una anotación en Spring que se utiliza para indicar que un método o una clase debe ser gestionado por transacciones. Esta anotación se utiliza al trabajar con bases de datos relacionales, donde es fundamental mantener la consistencia de los datos a través de transacciones.

## 4. Definir que significa los siguientes conceptos en Spring Boot ( ResponseEntity<?>, Optional, @PathVariable)

- ResponseEntity<?>: ResponseEntity es una clase proporcionada por Spring Framework que representa toda la respuesta HTTP: código de estado, encabezados y cuerpo. Permite controlar directamente todos los aspectos de la respuesta devuelta desde un controlador de Spring. El genérico <?> significa que puede retornar cualquier clase de objeto.

- Optional: es una clase que se utiliza para representar un valor opcional. En el contexto de Spring Boot, Optional se utiliza principalmente para evitar el manejo de valores nulos de manera explícita.

- @PathVariable es una anotación que se utiliza en métodos de controladores para mapear variables de la URL a parámetros de método en un controlador de Spring. Esto permite que los valores proporcionados en la URL se pasen como argumentos al método del controlador. Por ejemplo, si tienes una URL como /usuarios/{id}, donde {id} es una variable en la URL, puedes usar @PathVariable para vincular el valor de {id} a un parámetro en el método del controlador. 

## 5. Buscar y poner en esta parte el concepto de Spring Cloud Gateway

- Es un proyecto de spring que proporciona una forma de enrutamiento y filtrado de soluciones para aplicaciones basadas en la nube. Ofrece características como: Enrutamiento dinámico (Cambiar rutas sin reiniciar aplicación ), Filtrado de soluciones ( Modificar solicitudes HTTP entrantes o salientes), Integración con servicios de descubrimiento como Eureka, Balanceo de carga.

## 6. con la orientación del profesor colocar en este parte del documento el significado de cada una de las propiedades del anterior archivo ( eureka.client.service-url.defaultZone, spring.cloud.gateway.routes[0].id, spring.cloud.gateway.routes[0].uri, spring.cloud.gateway.routes[0].predicates, spring.cloud.gateway.routes[0].filters )

- eureka.client.service-url.defaultZone: Esta propiedad se utiliza para configurar la ubicación del servidor de Eureka en tu aplicación. Eureka es un servicio de descubrimiento que permite a las aplicaciones cliente encontrar y comunicarse entre sí sin necesidad de conocer las direcciones exactas de red.
- spring.cloud.gateway.routes[0].id: Esta propiedad define un identificador único para una ruta en Spring Cloud Gateway. 
- spring.cloud.gateway.routes[0].uri: Aquí se especifica la URI de destino a la que se redirigirán las solicitudes que coincidan con esta ruta en particular
- spring.cloud.gateway.routes[0].predicates: Los predicados definen las condiciones bajo las cuales una ruta específica debe aplicarse.
- spring.cloud.gateway.routes[0].filters: Los filtros son transformaciones o acciones que se aplican a las solicitudes o respuestas antes o después de que se enrutaron a su destino. 


## 7. Antes de continuar investiga y ponlo en esta parte de la actividad que son los genéricos en java , sus ventajas y usos.

- Los genéricos son una característica que permite escribir clases y métodos que puedan trabajar con diferentes tipos de datos sin tener que realizar conversiones. Permiten parametrizar tipos. Un ejemplo: 

- Sin genéricos:
List strings = new ArrayList();
Strings.add(“Hola”);
String saludo = (String) strings.get(0);
- En el ejemplo anterior, vemos que necesitamos un parseo, para que el dato sea un string, con genérico no hay necesidad de esto: 
List<String> strings = new ArrayList();
Strings.add(“Hola”);
String saludo = strings.get(0);
- El generico se implementó en la clase List, y esto permite que esta última, pueda recibir cualquier tipo de dato y trabajarlo desde una lista.
- Las ventajas son: Seguridad de tipos, reutilización de código, abstracción mas fuerte, mejora del rendimiento.

## 8. En este punto investigar y colocar por que se usa ese argumento dentro de esa relación (fetch = FetchType.LAZY)

- Fetch=FetchType.LAZY, indica como se recuperan los objetos de tipo Alumno asociados cuando se acceda a la lista. Se configura como LAZY, donde los objetos Alumno no se cargarán de inmediato cuando se acceda a la lista. Se cargarán solo cuando se acceda explícitamente a ellos.
- En otras palabras, la carga diferida ( lazy ) permite retrasar la carga o inicialización de un objeto hasta el mismo momento de su utilización ( objetos Alumno ). Esto contribuye a la eficiencia de los programas, evitando la precarga de objetos que podrían no llegar a utilizarse.




