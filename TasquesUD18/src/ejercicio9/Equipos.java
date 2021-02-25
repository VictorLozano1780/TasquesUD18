/**
 * 
 */
package ejercicio9;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConnectDB.ConnectDB;

/**
 * @author Víctor Lozano
 *
 */
public class Equipos {
	// METODO QUE CREA TABLAS MYSQL
		public static void createTable(String db, String name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "CREATE TABLE " + name + "" + "" 
						+ "(NumSerie varchar(4) primary key, Nombre varchar(100), Facultad int,"
						+ "foreign key (Facultad) references Facultad(Codigo));";
				Statement st = ConnectDB.conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");

			}

		}

		// METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertData(String db, String table_name, String numSerie, String nombre, String facultad) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "INSERT INTO " + table_name + "(NumSerie,Nombre,Facultad) VALUE"+ "(" 
						+ "\"" + numSerie + "\"," 
						+ "\"" + nombre + "\"," 
						+ "\"" + facultad + "\");";
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
