package com.universidadsophos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.universidadsophos.model.Curso;

import reto_tec.conexionSP;

public class CursoDAO {
    private Connection conexion;

    public CursoDAO() {
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

    public void agregarCurso(Curso curso) {
        String sql = "INSERT INTO Cursos (Nombre, CursoPrerrequisito, Creditos, CuposDisponibles) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, curso.getNombre());
            statement.setInt(2, curso.getCursoPrerrequisito());
            statement.setInt(3, curso.getCreditos());
            statement.setInt(4, curso.getCuposDisponibles());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean existeCurso(int cursoID) {
        String sql = "SELECT COUNT(*) FROM Cursos WHERE ID = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, cursoID);
            try (ResultSet rs = stmt.executeQuery()) {
               
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
        }

        return false; 
    }
}
	 

