package reto_tec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSP {
	 private static final String URL = "jdbc:mysql://localhost:3306/universidad_sophos";
	 private static final String USUARIO = "root";
	 private static final String CONTRASENA = "lolopi465";
	 
	 public static Connection obtenerConexion() throws SQLException{
	        return DriverManager.getConnection(URL,USUARIO, CONTRASENA);
	        
	    }
	 public static void cerrarConexion(Connection conexion) throws SQLException {
	        if (conexion != null && !conexion.isClosed()) {
	            conexion.close();
	        }
	 }
}