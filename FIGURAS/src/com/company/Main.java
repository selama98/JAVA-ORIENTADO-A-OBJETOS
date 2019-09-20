package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println("Que quieres hacer?\n" +
                    "1: Crear 2 puntos.\n" +
                    "0: Salir\n");

            double tecla = myObj.nextInt();

            if (tecla == 0) {

            } else if (tecla == 1) {

                Punto p1 = new Punto();
                Punto p2 = new Punto();

                System.out.println("Introduce la x de tu primer punto:");
                double x = myObj.nextDouble();
                p1.setX(x);
                System.out.println("Introduce la y de tu punto:");
                double y = myObj.nextDouble();
                p1.setY(y);
                System.out.println("Introduce la x de tu segundo punto:");
                double x1 = myObj.nextDouble();
                p2.setX(x1);
                System.out.println("Introduce la y de tu segundo punto:");
                double y1 = myObj.nextDouble();
                p2.setY(y1);

                System.out.println("Ahora, ¿qué quieres hacer?\n" +
                        "1: Imprimir P1 y P2\n" +
                        "2: Distancia de P1 a P2\n" +
                        "3: Desplazar P1\n");
                int tecla1 = myObj.nextInt();

                if (tecla1 == 1) {
                    System.out.println(p1.toString());
                    System.out.println(p2.toString());

                } else if (tecla1 == 2) {
                    System.out.println("La distancia de p1 a p2 es: " + p1.distancia(p2));

                } else if (tecla1 == 3) {
                    System.out.println("Introduce una x");
                    double dx = myObj.nextDouble();
                    System.out.println("Introduce una y");
                    double dy = myObj.nextDouble();

                    p1.mover(dx,dy);
                    System.out.println("Ahora p1 está en: " + p1.toString());
                }
            }


    }
}
