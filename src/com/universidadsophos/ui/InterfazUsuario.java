package com.universidadsophos.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import reto_tec.ControladorUniversidadSophos;
import reto_tec.LogicaNegocio;

public class InterfazUsuario {

	 private ControladorUniversidadSophos controlador;
	    private JTextField txtNombreCurso;
	    private JTextField txtCursoPrerrequisito;
	    private JTextField txtCreditos;
	    private JTextField txtCupos;
	    private JButton btnAgregarCurso;

	    public InterfazUsuario() {
	        controlador = new ControladorUniversidadSophos();

	        
	        txtNombreCurso = new JTextField();
	        txtCursoPrerrequisito = new JTextField();
	        txtCreditos = new JTextField();
	        txtCupos = new JTextField();
	        btnAgregarCurso = new JButton("Agregar Curso");

	     
	        btnAgregarCurso.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                String nombreCurso = txtNombreCurso.getText();
	                int cursoPrerrequisito = Integer.parseInt(txtCursoPrerrequisito.getText());
	                int creditos = Integer.parseInt(txtCreditos.getText());
	                int cuposDisponibles = Integer.parseInt(txtCupos.getText());

	                controlador.agregarCurso(nombreCurso, cursoPrerrequisito, creditos, cuposDisponibles);
	            }
	        });

	        
	    }
	    public static void main(String[] args) throws SQLException {
	        LogicaNegocio logicaNegocio = new LogicaNegocio();
	        Scanner scanner = new Scanner(System.in);

	        int opcion;
	        do {
	            System.out.println("1. Agregar Curso");
	            System.out.println("2. Agregar Estudiante");
	            System.out.println("3. Agregar Profesor");
	            System.out.println("4. Matricular Estudiante en Curso");
	            System.out.println("5. Salir");
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
	                    System.out.print("Ingrese el nombre del estudiante: ");
	                    scanner.nextLine();
	                    String nombreEstudiante = scanner.nextLine();

	                    System.out.print("Ingrese el ID del curso: ");
	                    int idCurso = scanner.nextInt();

	                    logicaNegocio.matricularEstudiante(nombreEstudiante, idCurso);
	                    break;
	                case 5:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida");
	            }
	        } while (opcion != 5);

	        
	        logicaNegocio.cerrarRecursos();
	        scanner.close();
	    }
	}