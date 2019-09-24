package com.company;

public class Circulo {
    private double radio;
    private Punto origen;

    // ** Constructor **

    public void Circulo (Punto origen, double radio) {
        this.origen = origen;
        this.radio  = radio;
    }

    public void Circulo () {
        this.origen = new Punto();
        this.radio  = radio;
    }

    // ** Getter's y Setter's

    public void setterOrigen(Punto origen) {
        this.origen = origen;
    }

    public void setterRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return(this.radio);
    }

    public Punto getOrigen() {
        return(this.origen);
    }

    // ** Funciones **

    public double area() {
        return(3.1416 * Math.pow(this.getRadio(),2));
    }

    public double perimetro() {
        return(2*3.1416*this.getRadio());
    }

    public double escalar(double escalado) {
        return(this.radio = this.getRadio() + escalado);
    }

    public Punto mover(Punto p) {
        return(this.origen = p);
    }

    public String toString() {
        return("Es un circulo en origen: " + this.getOrigen() + " con radio: " + this.getRadio());
    }
}
