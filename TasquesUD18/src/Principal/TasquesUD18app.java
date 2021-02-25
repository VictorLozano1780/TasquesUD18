/**
 * 
 */
package Principal;

import ConnectDB.ConnectDB;
import ejercicio1.Articulos;
import ejercicio1.Fabricantes;
import ejercicio2.Departamentos;
import ejercicio2.Empleados;
import ejercicio3.Almacenes;
import ejercicio3.Cajas;
import ejercicio4.Peliculas;
import ejercicio4.Salas;
import ejercicio5.Despachos;
import ejercicio5.Directores;
import ejercicio6.Piezas;
import ejercicio6.Proveedores;
import ejercicio6.Suministra;
import ejercicio7.Asignado_A;
import ejercicio7.Cientificos;
import ejercicio7.Proyecto;
import ejercicio8.Cajeros;
import ejercicio8.Maquinas_registradoras;
import ejercicio8.Productos;
import ejercicio8.Venta;
import ejercicio9.Equipos;
import ejercicio9.Facultad;
import ejercicio9.Investigadores;
import ejercicio9.Reserva;

/**
 * @author Víctor Lozano
 *
 */
public class TasquesUD18app {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConnectDB.openConnection();

		ConnectDB.createDB("tiendaInformatica");
		
		Fabricantes.createTable("tiendaInformatica", "Fabricantes");
		
		Fabricantes.insertData("tiendaInformatica", "Fabricantes","Siemens");
		Fabricantes.insertData("tiendaInformatica", "Fabricantes","Balay");
		Fabricantes.insertData("tiendaInformatica", "Fabricantes","Bosch");
		Fabricantes.insertData("tiendaInformatica", "Fabricantes","Canon");
		Fabricantes.insertData("tiendaInformatica", "Fabricantes","Samsung");
		
		Articulos.createTable("tiendaInformatica", "Articulos");

		Articulos.insertData("tiendaInformatica", "Articulos", "Nevera", "200", "1");
		Articulos.insertData("tiendaInformatica", "Articulos", "Lavadora", "200", "2");
		Articulos.insertData("tiendaInformatica", "Articulos", "Lavaplatos", "200", "3");
		Articulos.insertData("tiendaInformatica", "Articulos", "Impresora", "200", "4");
		Articulos.insertData("tiendaInformatica", "Articulos", "Movil", "200", "5");
		
		
		ConnectDB.createDB("Empleados");
		
		Departamentos.createTable("Empleados","Departamentos");
		
		Departamentos.insertData("Empleados", "Departamentos", "1", "Informatica", "1000");
		Departamentos.insertData("Empleados", "Departamentos", "2", "I+D", "1000");
		Departamentos.insertData("Empleados", "Departamentos", "3", "Limpieza", "1000");
		Departamentos.insertData("Empleados", "Departamentos", "4", "Marketing", "1000");
		Departamentos.insertData("Empleados", "Departamentos", "5", "Educacion", "1000");
		
		Empleados.createTable("Empleados", "Empleados");
		
		Empleados.insertData("Empleados", "Empleados", "111111111", "Pepe", "Reina", "1");
		Empleados.insertData("Empleados", "Empleados", "222222222", "Pepe", "Rey", "2");
		Empleados.insertData("Empleados", "Empleados", "333333333", "Pepe", "Principe", "3");
		Empleados.insertData("Empleados", "Empleados", "444444444", "Pepe", "Princesa", "4");
		Empleados.insertData("Empleados", "Empleados", "555555555", "Pepe", "Sobrino", "5");
		
		ConnectDB.createDB("Almacenes");
		
		Almacenes.createTable("Almacenes", "Almacenes");
		
		Almacenes.insertData("Almacenes", "Almacenes", "Tarragona", "100");
		Almacenes.insertData("Almacenes", "Almacenes", "Barcelona", "100");
		Almacenes.insertData("Almacenes", "Almacenes", "Lleida", "100");
		Almacenes.insertData("Almacenes", "Almacenes", "Girona", "100");
		Almacenes.insertData("Almacenes", "Almacenes", "Madrid", "100");
		
		Cajas.createTable("Almacenes", "Cajas");
		
		Cajas.insertData("Almacenes", "Cajas", "10", "Piano", "10", "1");
		Cajas.insertData("Almacenes", "Cajas", "20", "Guitarra", "10", "2");
		Cajas.insertData("Almacenes", "Cajas", "30", "Bateria", "10", "3");
		Cajas.insertData("Almacenes", "Cajas", "40", "Violin", "10", "4");
		Cajas.insertData("Almacenes", "Cajas", "50", "Tuba", "10", "1");
		
		ConnectDB.createDB("peliculasYSalas");
		
		Peliculas.createTable("peliculasYSalas", "Peliculas");
		
		Peliculas.insertData("peliculasYSalas", "Peliculas", "El señor de los anillos 1", "13");
		Peliculas.insertData("peliculasYSalas", "Peliculas", "El señor de los anillos 2", "13");
		Peliculas.insertData("peliculasYSalas", "Peliculas", "El señor de los anillos 3", "13");
		Peliculas.insertData("peliculasYSalas", "Peliculas", "El señor de los anillos 4", "13");
		Peliculas.insertData("peliculasYSalas", "Peliculas", "El señor de los anillos 5", "13");
		
		Salas.createTable("peliculasYSalas", "Salas");
		Salas.insertData("peliculasYSalas", "Salas", "Sala 1", "1");
		Salas.insertData("peliculasYSalas", "Salas", "Sala 2", "2");
		Salas.insertData("peliculasYSalas", "Salas", "Sala 3", "3");
		Salas.insertData("peliculasYSalas", "Salas", "Sala 4", "4");
		Salas.insertData("peliculasYSalas", "Salas", "Sala 5", "5");
		
		ConnectDB.createDB("Directores");
		
		Despachos.createTable("Directores", "Despachos");
		
		Despachos.insertData("Directores", "Despachos", "1", "10");
		Despachos.insertData("Directores", "Despachos", "2", "11");
		Despachos.insertData("Directores", "Despachos", "3", "12");
		Despachos.insertData("Directores", "Despachos", "4", "13");
		Despachos.insertData("Directores", "Despachos", "5", "14");
			
		Directores.createTable("Directores", "Directores");
		
		Directores.insertData("Directores", "Directores", "11111111A", "Pepe Reina", "11111111A", "1");
		Directores.insertData("Directores", "Directores", "22222222B", "Pepe Rey", "11111111A", "2");
		Directores.insertData("Directores", "Directores", "33333333C", "Pepe Principe", "11111111A" , "3");
		Directores.insertData("Directores", "Directores", "44444444D", "Pepe Princesa", "11111111A", "4");
		Directores.insertData("Directores", "Directores", "55555555E", "Pepe Sobrino", "11111111A", "5");
			
		ConnectDB.createDB("piezasYProveedores");
		
		Piezas.createTable("piezasYProveedores", "Piezas");
		
		Piezas.insertData("piezasYProveedores", "Piezas", "Tuerca");
		Piezas.insertData("piezasYProveedores", "Piezas", "Tornillo");
		Piezas.insertData("piezasYProveedores", "Piezas", "Clavo");
		Piezas.insertData("piezasYProveedores", "Piezas", "Clavija");
		Piezas.insertData("piezasYProveedores", "Piezas", "Bisagra");
		
		Proveedores.createTable("piezasYProveedores", "Proveedores");
		
		Proveedores.insertData("piezasYProveedores", "Proveedores", "10", "Proveedor 1");
		Proveedores.insertData("piezasYProveedores", "Proveedores", "11", "Proveedor 2");
		Proveedores.insertData("piezasYProveedores", "Proveedores", "12", "Proveedor 3");
		Proveedores.insertData("piezasYProveedores", "Proveedores", "13", "Proveedor 4");
		Proveedores.insertData("piezasYProveedores", "Proveedores", "14", "Proveedor 5");
		
		Suministra.createTable("piezasYProveedores", "Suministra");
		
		Suministra.insertData("piezasYProveedores", "Suministra", "1", "10", "100");
		Suministra.insertData("piezasYProveedores", "Suministra", "2", "11", "100");
		Suministra.insertData("piezasYProveedores", "Suministra", "3", "12", "100");
		Suministra.insertData("piezasYProveedores", "Suministra", "4", "13", "100");
		Suministra.insertData("piezasYProveedores", "Suministra", "5", "14", "100");	
		
		ConnectDB.createDB("Cientificos");
		
		Cientificos.createTable("Cientificos", "Cientificos");
		
		Cientificos.insertData("Cientificos", "Cientificos", "11111111", "Pepe Reina");
		Cientificos.insertData("Cientificos", "Cientificos", "22222222", "Pepe Rey");
		Cientificos.insertData("Cientificos", "Cientificos", "33333333", "Pepe Principe");
		Cientificos.insertData("Cientificos", "Cientificos", "44444444", "Pepe Princesa");
		Cientificos.insertData("Cientificos", "Cientificos", "55555555", "Pepe Sobrino");
		
		Proyecto.createTable("Cientificos", "Proyecto");
		
		Proyecto.insertData("Cientificos", "Proyecto", "1", "Proyecto 1", "10");
		Proyecto.insertData("Cientificos", "Proyecto", "2", "Proyecto 2", "11");
		Proyecto.insertData("Cientificos", "Proyecto", "3", "Proyecto 3", "12");
		Proyecto.insertData("Cientificos", "Proyecto", "4", "Proyecto 4", "13");
		Proyecto.insertData("Cientificos", "Proyecto", "5", "Proyecto 5", "14");
		
		Asignado_A.createTable("Cientificos", "Asignado_A");
		
		Asignado_A.insertData("Cientificos", "Asignado_A", "11111111", "1");
		Asignado_A.insertData("Cientificos", "Asignado_A", "22222222", "2");
		Asignado_A.insertData("Cientificos", "Asignado_A", "33333333", "3");
		Asignado_A.insertData("Cientificos", "Asignado_A", "44444444", "4");
		Asignado_A.insertData("Cientificos", "Asignado_A", "55555555", "5");
		
		ConnectDB.createDB("grandesAlmacenes");

		Productos.createTable("grandesAlmacenes", "Productos");
		
		Productos.insertData("grandesAlmacenes", "Productos", "Patatas", "5");
		Productos.insertData("grandesAlmacenes", "Productos", "Calamares", "5");
		Productos.insertData("grandesAlmacenes", "Productos", "Lubina", "5");
		Productos.insertData("grandesAlmacenes", "Productos", "Churrasco", "5");
		Productos.insertData("grandesAlmacenes", "Productos", "Canelones", "5");
		
		Cajeros.createTable("grandesAlmacenes", "Cajeros");
		
		Cajeros.insertData("grandesAlmacenes", "Cajeros", "Pepe Reina");
		Cajeros.insertData("grandesAlmacenes", "Cajeros", "Pepe Rey");
		Cajeros.insertData("grandesAlmacenes", "Cajeros", "Pepe Princesa");
		Cajeros.insertData("grandesAlmacenes", "Cajeros", "Pepe Principe");
		Cajeros.insertData("grandesAlmacenes", "Cajeros", "Pepe Sobrino");
		
		Maquinas_registradoras.createTable("grandesAlmacenes", "Maquinas_registradoras");
		
		Maquinas_registradoras.insertData("grandesAlmacenes", "Maquinas_registradoras", "1");
		Maquinas_registradoras.insertData("grandesAlmacenes", "Maquinas_registradoras", "2");
		Maquinas_registradoras.insertData("grandesAlmacenes", "Maquinas_registradoras", "3");
		Maquinas_registradoras.insertData("grandesAlmacenes", "Maquinas_registradoras", "4");
		Maquinas_registradoras.insertData("grandesAlmacenes", "Maquinas_registradoras", "5");
		
		Venta.createTable("grandesAlmacenes", "Venta");
		
		Venta.insertData("grandesAlmacenes", "Venta", "1", "1", "1");
		Venta.insertData("grandesAlmacenes", "Venta", "2", "2", "2");
		Venta.insertData("grandesAlmacenes", "Venta", "3", "3", "3");
		Venta.insertData("grandesAlmacenes", "Venta", "4", "4", "4");
		Venta.insertData("grandesAlmacenes", "Venta", "5", "5", "5");
		
		ConnectDB.createDB("Investigadores");
		Facultad.createTable("Investigadores", "Facultad");
		
		Facultad.insertData("Investigadores", "Facultad", "1", "Medicina");
		Facultad.insertData("Investigadores", "Facultad", "2", "Economia");
		Facultad.insertData("Investigadores", "Facultad", "3", "Informatica");
		Facultad.insertData("Investigadores", "Facultad", "4", "Enfermeria");
		Facultad.insertData("Investigadores", "Facultad", "5", "Psicologia");
		
		Investigadores.createTable("Investigadores", "Investigadores");
		
		Investigadores.insertData("Investigadores", "Investigadores", "11111111", "Pepe Reina", "1");
		Investigadores.insertData("Investigadores", "Investigadores", "22222222", "Pepe Rey", "2");
		Investigadores.insertData("Investigadores", "Investigadores", "33333333", "Pepe Principe", "3");
		Investigadores.insertData("Investigadores", "Investigadores", "44444444", "Pepe Princesa", "4");
		Investigadores.insertData("Investigadores", "Investigadores", "55555555", "Pepe Nieto", "5");
		
		Equipos.createTable("Investigadores", "Equipos");
		
		Equipos.insertData("Investigadores", "Equipos", "1", "Equipo 1", "1");
		Equipos.insertData("Investigadores", "Equipos", "2", "Equipo 2", "2");
		Equipos.insertData("Investigadores", "Equipos", "3", "Equipo 3", "3");
		Equipos.insertData("Investigadores", "Equipos", "4", "Equipo 4", "4");
		Equipos.insertData("Investigadores", "Equipos", "5", "Equipo 5", "5");

		Reserva.createTable("Investigadores", "Reserva");
		
		Reserva.insertData("Investigadores", "Reserva", "11111111", "1", "2021-01-20", "2021-02-20");
		Reserva.insertData("Investigadores", "Reserva", "22222222", "2", "2021-01-21", "2021-02-20");
		Reserva.insertData("Investigadores", "Reserva", "33333333", "3", "2021-01-22", "2021-02-20");
		Reserva.insertData("Investigadores", "Reserva", "44444444", "4", "2021-01-23", "2021-02-20");
		Reserva.insertData("Investigadores", "Reserva", "55555555", "5", "2021-01-24", "2021-02-20");
		ConnectDB.closeConnection();
	}
}
