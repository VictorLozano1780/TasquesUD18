/**
 * 
 */
package ejercicio3;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConnectDB.ConnectDB;

/**
 * @author V�ctor Lozano
 *
 */
public class Almacenes {
	//METODO QUE CREA TABLAS MYSQL
			public static void createTable(String db,String name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb= ConnectDB.conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE "+name+""
							+ "(Codigo INT PRIMARY KEY AUTO_INCREMENT, Lugar varchar(100), Capacidad int); ";
					Statement st= ConnectDB.conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada con exito!");
					
				}catch (SQLException ex){
					System.out.println(ex.getMessage());
					System.out.println("Error crando tabla.");
					
				}
				
			}
			
			//METODO QUE INSERTA DATOS EN TABLAS MYSQL
			public static void insertData(String db, String table_name, String lugar, String capacidad) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb= ConnectDB.conexion.createStatement();
					stdb.executeUpdate(Querydb);
								
					String Query = "INSERT INTO " + table_name + "(Lugar, Capacidad) VALUE(" 
							+ "\"" + lugar + "\","
							+ "\"" + capacidad + "\");";
					Statement st = ConnectDB.conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");;
					
				} catch (SQLException ex ) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
							
			}
}
