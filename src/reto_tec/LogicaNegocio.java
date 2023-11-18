package reto_tec;

import java.sql.SQLException;

import com.universidadsophos.dao.CursoDAO;
import com.universidadsophos.dao.EstudianteDAO;
import com.universidadsophos.dao.MatriculadoDAO;
import com.universidadsophos.dao.ProfesorDAO;
import com.universidadsophos.model.Curso;
import com.universidadsophos.model.Estudiante;
import com.universidadsophos.model.Matriculado;
import com.universidadsophos.model.Profesor;

public class LogicaNegocio {
	 private CursoDAO cursoDAO;
	 private EstudianteDAO estudianteDAO;
	    private MatriculadoDAO matriculadoDAO;

	    public LogicaNegocio() {
	        this.cursoDAO = new CursoDAO();
	        this.matriculadoDAO = new MatriculadoDAO();
	    }

public void agregarCurso(Curso curso) {
    cursoDAO.agregarCurso(curso);
}

public void agregarEstudiante(Estudiante estudiante) {
    estudianteDAO.agregarEstudiante(estudiante);
}

public void agregarProfesor(Profesor profesor) {
    ProfesorDAO profesorDAO = new ProfesorDAO();
	profesorDAO.agregarProfesor(profesor);
}



	    public void ejecutar() {
	       
	        Curso nuevoCurso = crearCurso();

	       
	        matricularEstudiante(nuevoCurso.getID());
	    }

	    private Curso crearCurso() {
	       
	        Curso nuevoCurso = new Curso(0, null, 0, 0, 0);

	        
	        cursoDAO.agregarCurso(nuevoCurso);

	        
	        int cursoID = nuevoCurso.getID();
	        System.out.println("Se ha creado un nuevo curso con ID: " + cursoID);

	        return nuevoCurso;
	    }

	    private void matricularEstudiante(int cursoID) {
	      
	        if (cursoDAO.existeCurso(cursoID)) {
	         
	            Matriculado nuevaMatricula = new Matriculado(cursoID, cursoID);

	           
	            matriculadoDAO.agregarMatriculado(nuevaMatricula, cursoID);

	          
	            System.out.println("Se ha matriculado al estudiante en el curso con ID: " + cursoID);
	        } else {
	            System.out.println("El CursoID no existe en la tabla cursos.");
	        }
	    }

	    public static void main(String[] args) {
	        LogicaNegocio logicaNegocio = new LogicaNegocio();
	        logicaNegocio.ejecutar();
	    }

		public void cerrarRecursos() {
			
			
		}

		public void matricularEstudiante(String nombreEstudiante, int idCurso) throws SQLException {
	    }
	}