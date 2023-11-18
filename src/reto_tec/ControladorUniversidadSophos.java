package reto_tec;

import java.util.Scanner;

import com.universidadsophos.dao.CursoDAO;
import com.universidadsophos.dao.EstudianteDAO;
import com.universidadsophos.dao.MatriculadoDAO;
import com.universidadsophos.dao.ProfesorDAO;
import com.universidadsophos.model.Curso;
import com.universidadsophos.model.Estudiante;
import com.universidadsophos.model.Matriculado;
import com.universidadsophos.model.Profesor;

public class ControladorUniversidadSophos {
    public static void main(String[] args) {
        CursoDAO cursoDAO = new CursoDAO();
        EstudianteDAO estudianteDAO = new EstudianteDAO();
        ProfesorDAO profesorDAO = new ProfesorDAO();
        MatriculadoDAO matriculadoDAO = new MatriculadoDAO();
        LogicaNegocio logicaNegocio = new LogicaNegocio();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Agregar Curso");
            System.out.println("2. Agregar Estudiante");
            System.out.println("3. Agregar Profesor");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
            case 1:
               
                break;
            case 2:
                
                break;
            case 3:
               
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
        }
    } while (opcion != 4);

    // Cierra recursos si es necesario
    logicaNegocio.cerrarRecursos();
    scanner.close();


        Curso nuevoCurso = new Curso(1, "Programación Java", 0, 4, 30);
        cursoDAO.agregarCurso(nuevoCurso);

        Estudiante nuevoEstudiante = new Estudiante(1, "Juan Perez", "Facultad de Ciencias", 20, 2);
        estudianteDAO.agregarEstudiante(nuevoEstudiante);

        Profesor nuevoProfesor = new Profesor(1, "Dr. Ana García", "Ph.D. en Ciencias de la Computación", 10);
        profesorDAO.agregarProfesor(nuevoProfesor);

        Matriculado nuevaMatricula = new Matriculado(1, 1); 
        matriculadoDAO.agregarMatriculado(nuevaMatricula);

        cursoDAO.cerrarConexion();
        estudianteDAO.cerrarConexion();
        profesorDAO.cerrarConexion();
        matriculadoDAO.cerrarConexion();
    }

	public void agregarCurso(String nombreCurso, int cursoPrerrequisito, int creditos, int cuposDisponibles) {
		// TODO Auto-generated method stub
		
	}
}
