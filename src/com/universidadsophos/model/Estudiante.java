package com.universidadsophos.model;

public class Estudiante {
	private int id;
    private String nombre;
    private String facultad;
    private int creditosInscritos;
    private int semestre;


    public Estudiante(int id, String nombre, String facultad, int creditosInscritos, int semestre) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
        this.creditosInscritos = creditosInscritos;
        this.semestre = semestre;
    }

    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", facultad=" + facultad
                + ", creditosInscritos=" + creditosInscritos + ", semestre=" + semestre + "]";
    }

	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCreditosInscritos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getFacultad() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSemestre() {
		// TODO Auto-generated method stub
		return 0;
	}
}

