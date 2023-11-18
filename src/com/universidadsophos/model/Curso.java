package com.universidadsophos.model;

public class Curso {
	 private int id;
	    private String nombre;
	    private int cursoPrerrequisito;
	    private int creditos;
	    private int cuposDisponibles;
	    private static int contadorID = 1;

	    public Curso(int id, String nombre, int cursoPrerrequisito, int creditos, int cuposDisponibles) {
	        this.id = id;
	        this.nombre = nombre;
	        this.cursoPrerrequisito = cursoPrerrequisito;
	        this.creditos = creditos;
	        this.cuposDisponibles = cuposDisponibles;
	        this.id = contadorID++;
	    }

	    public int getCursoPrerrequisito() {
	        return cursoPrerrequisito;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getCreditos() {
	        return creditos;
	    }

	    public int getCuposDisponibles() {
	        return cuposDisponibles;
	    }

	    @Override
	    public String toString() {
	        return "Curso [id=" + id + ", nombre=" + nombre + ", cursoPrerrequisito=" + cursoPrerrequisito
	                + ", creditos=" + creditos + ", cuposDisponibles=" + cuposDisponibles + "]";
	    }

		public int getID() {
			return id;
		}
	}