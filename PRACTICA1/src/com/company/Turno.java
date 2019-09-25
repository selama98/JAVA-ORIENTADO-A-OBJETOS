package com.company;

public class Turno {
    private int horainicio;  // Hola que hase
    private int horafinal;

    // ** Constructor **

    public void Turno() {
        this.horainicio = 0;
        this.horafinal  = 0;
    }

    public void Turno(int horainicio, int horafinal) {
        this.horainicio = horainicio;
        this.horafinal = horafinal;
    }

    // ** Getter's y Setter's

    public void setHorainicio(int horainicio) {
        this.horainicio = horainicio;
    }

    public int getHorainicio() {
        return(this.horainicio);
    }

    public void setHorafinal(int horafinal) {
        this.horafinal = horafinal;
    }

    public int getHorafinal() {
        return(this.horafinal);
    }

    // ** Funciones **

    public String toString() {
        return(this.getHorainicio() + ":" + this.getHorafinal());
    }
}
