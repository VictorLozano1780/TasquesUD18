/**
 * 
 */
package ejercicio1;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConnectDB.ConnectDB;

/**
 * @author V�ctor Lozano
 *
 */
public class Articulos {
	//METODO QUE CREA TABLAS MYSQL
			public static void createTable(String db,String name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb= ConnectDB.conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE "+name+""
							+ "(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR(100), Precio INT, Fabricante INT,"
							+ " foreign key (Fabricante) references Fabricantes(Codigo));";
					Statement st= ConnectDB.conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada con exito!");
					
				}catch (SQLException ex){
					System.out.println(ex.getMessage());
					System.out.println("Error crando tabla.");
					
				}
				
			}
			
			//METODO QUE INSERTA DATOS EN TABLAS MYSQL
			public static void insertData(String db, String table_name, String nombre, String precio, String fabricante) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb= ConnectDB.conexion.createStatement();
					stdb.executeUpdate(Querydb);
								
					String Query = "INSERT INTO " + table_name + "(Nombre, Precio, Fabricante) VALUE(" 
							+ "\"" + nombre + "\","
							+ "\"" + precio + "\","
							+ "\"" + fabricante + "\"); ";
					Statement st = ConnectDB.conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");;
					
				} catch (SQLException ex ) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
							
			}
}
