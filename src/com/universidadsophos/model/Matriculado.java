package com.universidadsophos.model;

public class Matriculado {
	  private int cursoID;
	    private int estudianteID;
	    private String nombreColumna1;
	    private String nombreColumna2;
	  
	    public String getNombreColumna1() {
	        return nombreColumna1;
	    }
	    public String getNombreColumna2() {
	        return nombreColumna2;
	    }

	    public Matriculado(int cursoID, int estudianteID) {
	        this.cursoID = cursoID;
	        this.estudianteID = estudianteID;
	    }

	    public String toString() {
	        return "Matriculado [cursoID=" + cursoID + ", estudianteID=" + estudianteID + "]";
	    }

		public int getEstudianteID() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getCursoID() {
			// TODO Auto-generated method stub
			return 0;
		}
	}


