package com.company;

public class Punto {
    private double x;
    private double y;

    // ** Constructor **

    public void Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }


    // ** Setter's **

    public void setX (double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // ** Getter's **

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }


    // ** Funciones **

    public void mover(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public double distancia(Punto p) {
        double dx = this.getX() - p.getX();
        double dy = this.getY() - p.getY();

        return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
    }

    public String toString() {
        return ("(" + this.getX() + "," + this.getY() + ")");
    }
}
