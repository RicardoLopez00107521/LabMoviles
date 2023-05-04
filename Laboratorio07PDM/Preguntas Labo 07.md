# Preguntas Laboratorio 07

1. ¿Qué ventajas tiene el utilizar LiveData?
R/ No utiliza muchos recursos ya que al estar apegado al ciclo de vida de los componentes solo estará activo mientras se muestre el componente, además que actualiza de manera automáticamente la interfaz de usuario cuando se realizan cambios en los datos y no manejamos de manera manual el ciclo de vida.

2. ¿Qué patrón de diseño utiliza LiveData?
R/ Observador

3. Menciona que se debe agregar al Gradle para poder implementar DataBinding
R/ dataBinding {  
	enabled true  
   }

4. ¿Qué es DataBinding?  Menciona sus ventajas frente a findViewById
R/ Función que permite vincular los elementos de la interfaz de usuario (UI) de una aplicación directamente a los datos de la aplicación; Una de las ventajas es que databinding permite que la UI se actualice automáticamente a medida que los datos cambian en la aplicación, proporciona una mayor eficiencia y rendimiento, ya que reduce la necesidad de hacer referencia a los elementos de la interfaz de usuario en el código y a su vez disminuye la cantidad de código repetitivo necesario para mantener la sincronización de los datos y la UI.
