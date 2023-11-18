package com.universidadsophos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.universidadsophos.model.Estudiante;

import reto_tec.conexionSP;

public class EstudianteDAO {
	 private Connection conexion;

	    public EstudianteDAO() {	   
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
	    public void agregarEstudiante(Estudiante estudiante) {
	        
	        String sql = "INSERT INTO Estudiantes (Nombre, Facultad, CreditosInscritos, Semestre) VALUES (?, ?, ?, ?)";

	        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
	            statement.setString(1, estudiante.getNombre());
	            statement.setString(2, estudiante.getFacultad());
	            statement.setInt(3, estudiante.getCreditosInscritos());
	            statement.setInt(4, estudiante.getSemestre());

	            statement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
