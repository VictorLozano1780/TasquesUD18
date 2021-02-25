/**
 * 
 */
package ejercicio2;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConnectDB.ConnectDB;

/**
 * @author Víctor Lozano
 *
 */
public class Empleados {
	//METODO QUE CREA TABLAS MYSQL
		public static void createTable(String db,String name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "CREATE TABLE "+name+""
						+ "(DNI varchar(9) PRIMARY KEY, Nombre VARCHAR(100), Apellidos VARCHAR(255), Departamento INT, "
						+ "foreign key (Departamento) references Departamentos(Codigo));";
				Statement st= ConnectDB.conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");
				
			}catch (SQLException ex){
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");
				
			}
			
		}
		
		//METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertData(String db, String table_name, String dni, String nombre, String apellidos, String departamento) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb= ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);
							
				String Query = "INSERT INTO " + table_name + "(DNI, Nombre, Apellidos, Departamento) VALUE(" 
						+ "\"" + dni + "\","
						+ "\"" + nombre + "\","
						+ "\"" + apellidos + "\","
						+ "\"" + departamento + "\");";
				Statement st = ConnectDB.conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");;
				
			} catch (SQLException ex ) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
			}
						
		}
}
