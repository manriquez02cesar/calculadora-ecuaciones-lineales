package com.parcial1.cesman;

import java.util.Scanner;

public class Biseccion {
    static double f(double x) {
        double fx = ((4 * (Math.pow(x, 2))) - (2 * x) - 1);
        return fx;
    }

    public static void main(String[] args) {
        double xi, xf, c;
        double error = 0.0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el punto inferior xi: ");
        xi = leer.nextDouble();
        System.out.println("Ingrese el punto superior xf: ");
        xf = leer.nextDouble();
        System.out.println("Ingrese el error");
        error = leer.nextDouble();
        for (int i = 0; i < 100; ) {
            int k = i;
            if ((f(xi) > 0 && f(xf) < 0) || (f(xi) < 0 && f(xf) >  0)) {
                c = (xf + xi) / 2;
                if (f(xi) * f(c) < 0) {
                    xf = c;
                    i++;
                    System.out.println("x" + ++k + "= " + c + " en el intervalo [" + xi + ", " + xf + "]");
                } else if (f(xi) * f(c) > 0) {
                    xi = c;
                    i++;
                    System.out.println("x" + ++k + "= " + c + " en el intervalo [" + xi + ", " + xf + "]");
                } else if (Math.abs(f(xi) * f(c)) < error) {
                    System.out.println("Solucion x = " + c);
                    break;
                }
            } else {
                System.out.println("Los puntos evaluados en la funcion son del mismo signo\nTienen que ser diferentes");
                break;
            }
        }
    }
}