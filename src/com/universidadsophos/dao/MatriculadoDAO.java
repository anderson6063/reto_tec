package com.universidadsophos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.universidadsophos.model.Matriculado;

import reto_tec.conexionSP;

public class MatriculadoDAO {
    private Connection conexion;

    public MatriculadoDAO() {
        try {
            conexion = conexionSP.obtenerConexion(); // Asegúrate de tener una clase llamada conexionSP
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

    public void agregarMatriculado(Matriculado matriculado, int cursoID) {
        String sql = "INSERT INTO Matriculados (NombreColumna1, NombreColumna2, ..., CursoID) VALUES (?, ?, ..., ?)";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            
            statement.setString(1, matriculado.getNombreColumna1());
            statement.setString(2, matriculado.getNombreColumna2());
            
            
            
            statement.setInt( cursoID, cursoID);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	public void agregarMatriculado(Matriculado nuevaMatricula) {		
	}
}