package com.company;

public class Cuadrado {
    private Punto origen;
    private double lado;

    // ** Constructores **

    public void Cuadrado() {
        this.origen = new Punto();
        this.lado = 1;
    }

    public void Cuadrado(Punto origen, double lado) {
        this.origen = origen;
        this.lado = lado;
    }

    // ** Setter's y Getter's **

    public void setOrigen(Punto p) {
        this.origen = p;
    }

    public Punto getOrigen() {
        return(this.origen);
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return(this.lado);
    }

    // ** Funciones **

    public double area() {
        return(Math.pow(this.getLado(),2));
    }

    public double perimetro() {
        return(this.getLado()*4);
    }

        }