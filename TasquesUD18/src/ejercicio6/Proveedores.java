/**
 * 
 */
package ejercicio6;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConnectDB.ConnectDB;

/**
 * @author Víctor Lozano
 *
 */
public class Proveedores {
	// METODO QUE CREA TABLAS MYSQL
			public static void createTable(String db, String name) {
				try {
					String Querydb = "USE " + db + ";";
					Statement stdb = ConnectDB.conexion.createStatement();
					stdb.executeUpdate(Querydb);

					String Query = "CREATE TABLE " + name + ""
							+ "(Id varchar(4) PRIMARY KEY, Nombre varchar(100));";
					Statement st = ConnectDB.conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada con exito!");

				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error crando tabla.");

				}

			}

			// METODO QUE INSERTA DATOS EN TABLAS MYSQL
			public static void insertData(String db, String table_name, String id, String nombre) {
				try {
					String Querydb = "USE " + db + ";";
					Statement stdb = ConnectDB.conexion.createStatement();
					stdb.executeUpdate(Querydb);

					String Query = "INSERT INTO " + table_name + "(Id, Nombre) VALUE(" 
							+ "\"" + id + "\","
							+ "\"" + nombre + "\");";
					Statement st = ConnectDB.conexion.createStatement();
					st.executeUpdate(Query);

					System.out.println("Datos almacenados correctamente");
					;

				} catch (SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}

			}
}
