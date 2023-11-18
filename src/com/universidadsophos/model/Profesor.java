package com.universidadsophos.model;

public class Profesor {
	private int id;
    private String nombre;
    private String maximoTituloAcademico;
    private int aniosExperiencia;

  
    public Profesor(int id, String nombre, String maximoTituloAcademico, int aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.maximoTituloAcademico = maximoTituloAcademico;
        this.aniosExperiencia = aniosExperiencia;
    }

   
    public String toString() {
        return "Profesor [id=" + id + ", nombre=" + nombre + ", maximoTituloAcademico=" + maximoTituloAcademico
                + ", aniosExperiencia=" + aniosExperiencia + "]";
    }


	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}


	public int getAniosExperiencia() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getMaximoTituloAcademico() {
		// TODO Auto-generated method stub
		return null;
	}
}
