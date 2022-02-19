# repositorioprueba
Esto es una prueba para analista java

Consulta de Stock mayor a la Base de Datos: select NombreProducto,Precio,Stock
                                            from productos
                                            where Stock = (select max(Stock) from productos);
                                            
                                            
adicione un login a la aplicación: usuario=alj
                                   contraseña = coronado
el crud te realiza la creación de un producto y lo guarda(Guardar)
-al seleccionar la opcion de producto, inmediatamente se abre el item de lo que contiene producto
- se reliza la actualización de los productos, para ello hay que seleccionar una fila de la tabla producto y luego editarlo, se hicieron las validaciones
para campos vacios.
se puede buscar un producto por idproducto al relizar una venta, al digitar el ID del producto y darle enter se marcan los otros campos, excepto la cantidad que se tiene que ingresar por teclado.
- si la cantidad de producto que se quiere vender e superior al stock arroja una advertencia y no deja realizar la venta.
al darle enter a ID producto y luego a cantidad, se listan los productos para la venta.
