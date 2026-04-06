package com.parcial1.cesman;

import java.util.Scanner;

public class falsaPosicion {
    static double f ( double x){
        double fx = ((4 * (Math.pow(x, 2))) - (2 * x) - 1);
        return fx;
    }

    public static void main (String[] args){
        double xi, xf, c, error;
        int k = 1;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el punto inferior xi: ");
        xi = leer.nextDouble();
        System.out.println("Ingrese el punto superior xf: ");
        xf = leer.nextDouble();
        System.out.println("Ingrese el error");
        error = leer.nextDouble();
        for (int i = 0; i < 100; ) {

            if ((f(xi) > 0 && f(xf) < 0) || (f(xi) < 0 && f(xf) > 0)) {
                c = ((xi * f(xf)) - (xf * f(xi))) / (f(xf) - f(xi));
                if (f(xi) < 0 && f(c) < 0) {
                    xi = c;
                    System.out.println("x" + k++ + "= " + c + " intervalo de la raiz : [" + xi + "," + xf + "]");
                    i++;
                } else if ((f(xi) > 0 && f(c) < 0) || (f(xi) < 0 && f(c) > 0)) {
                    xf = c;
                    System.out.println("x" + k++ + "= " + c + " intervalo de la raiz : [" + xi + "," + xf + "]");
                    i++;
                }
                if (Math.abs(f(c)) < error) {
                    System.out.println("El punto de aproximacion esta oscilando, su aprox es = " + c);
                    break;
                }
            } else {
                System.out.println("Los puntos evaluados en la funcion son del mismo signo\nTienen que ser diferentes");
                break;
            }
        }
    }
}




