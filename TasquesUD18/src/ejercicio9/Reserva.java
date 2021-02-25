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
public class Reserva {
	// METODO QUE CREA TABLAS MYSQL
		public static void createTable(String db, String name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "CREATE TABLE " + name + "" + "" 
						+ "(DNI varchar(8), NumSerie varchar(4), Comienzo date, Fin date,"
						+ "foreign key (DNI) references Investigadores(DNI),"
						+ "foreign key (NumSerie) references Equipos(NumSerie));";
				Statement st = ConnectDB.conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");

			}

		}

		// METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertData(String db, String table_name, String dni, String numserie, String comienzo, String fin) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "INSERT INTO " + table_name + "(DNI, NumSerie, Comienzo, Fin) VALUE"+ "(" 
						+ "\"" + dni + "\"," 
						+ "\"" + numserie + "\"," 
						+ "\"" + comienzo + "\"," 
						+ "\"" + fin + "\");";
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
