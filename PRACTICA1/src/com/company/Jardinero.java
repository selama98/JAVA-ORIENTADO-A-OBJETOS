package com.company;

public class Jardinero {
    private String nombre;
    private String NIF;
    private int activo;
    private Turno turno;

    // ** Constructores **

    public void Jardinero() {
        this.nombre = "no";
        this.NIF = "no";
        this.activo = 1;
        this.turno = new Turno();
    }

    public void Jardinero(String nombre, String NIF, int activo, Turno turno) {
        this.nombre = nombre;
        this.NIF    = NIF;
        this.activo = activo;
        this.turno  = turno;
    }

    // ** Getter's y Setter's **

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return(this.nombre);
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNIF() {
        return(this.NIF);
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getActivo() {
        return(this.activo);
    }

    public Turno setTurno(Turno turno) {
        return(this.turno = turno);
    }

    public Turno getTurno() {
        return(this.turno);
    }

    // ** Funciones **

    public void cambiarTurno (Turno turno) {
        this.turno = this.setTurno(turno);
    }

}
