/**
 * 
 */
package ejercicio5;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import ConnectDB.ConnectDB;

/**
 * @author Víctor Lozano
 *
 */
public class Directores {
	// METODO QUE CREA TABLAS MYSQL
		public static void createTable(String db, String name) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "CREATE TABLE " + name + ""
						+ "(DNI varchar(9) PRIMARY KEY, NomApels varchar(255), DNIJefe varchar(9), Despacho INT,"
						+ "foreign key (DNIJefe) references Directores(DNI),"
						+ "foreign key (Despacho) references Despachos(Numero));";
				Statement st = ConnectDB.conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Tabla creada con exito!");

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
				System.out.println("Error crando tabla.");

			}

		}

		// METODO QUE INSERTA DATOS EN TABLAS MYSQL
		public static void insertData(String db, String table_name, String dni, String nomApels, String dniJefe, String despacho) {
			try {
				String Querydb = "USE " + db + ";";
				Statement stdb = ConnectDB.conexion.createStatement();
				stdb.executeUpdate(Querydb);

				String Query = "INSERT INTO " + table_name + "(DNI,NomApels,DNIJefe,Despacho) VALUE(" 
						+ "\"" + dni + "\","
						+ "\"" + nomApels + "\","
						+ "\"" + dniJefe + "\","
						+ "\"" + despacho + "\");";
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
