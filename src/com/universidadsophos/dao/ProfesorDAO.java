package com.universidadsophos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.universidadsophos.model.Profesor;

import reto_tec.conexionSP;

public class ProfesorDAO {
	  private Connection conexion;

	    public ProfesorDAO() {
	        try {
	            conexion = conexionSP.obtenerConexion();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void cerrarConexion() {
	        try {
	        	conexionSP.cerrarConexion(conexion);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    public void agregarProfesor(Profesor profesor) {
	      
	        String sql = "INSERT INTO Profesores (Nombre, MaximoTituloAcademico, AniosExperiencia) VALUES (?, ?, ?)";
	        
	        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
	            statement.setString(1, profesor.getNombre());
	            statement.setString(2, profesor.getMaximoTituloAcademico());
	            statement.setInt(3, profesor.getAniosExperiencia());

	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}