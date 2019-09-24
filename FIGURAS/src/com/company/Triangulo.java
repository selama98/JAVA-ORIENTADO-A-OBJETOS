
package com.company;

public class Triangulo {
    private double base;
    private double altura;
    private Punto origen;
    private double hipotenusa;

    // ** Constructores **

    public void Triangulo() {
        this.base   = 5;
        this.altura = 7;
        this.origen = new Punto();
    }

    public void Triangulo(double base, double altura, Punto origen) {
        this.base   = base;
        this.altura = altura;
        this.origen = origen;
    }

    // ** Setter's y Getter's **

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getOrigen() {
        return(this.origen);
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public double getHipotenusa() {
        return(this.hipotenusa);
    }

    public double getBase() {
        return(this.base);
    }

    public double getAltura() {
        return(this.altura);
    }

    // ** Funciones **

    public double area() {
        return((this.getBase()*this.getAltura()) / 2);
    }

    public double perimetro() {
         double hipotenusaalcuadrado = Math.pow(this.getBase(),2) + Math.pow(this.getAltura(),2);
         this.setHipotenusa(Math.sqrt(hipotenusaalcuadrado));
         return(this.getHipotenusa());
    }

    public Punto mover(Punto p) {
        return(this.origen = p);
    }
        }