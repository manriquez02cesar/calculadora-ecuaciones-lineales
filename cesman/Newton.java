package com.parcial1.cesman;

import java.util.Scanner;

public class Newton {
    static Scanner s = new Scanner(System.in);

    public static double f(double x) {
        return ((4 * Math.pow(x, 2)) - (1) - (2 * x));
    }

    public static double y(double x) {
        return ((8 * x) - (2));
    }

    public static void main(String[] args) {
        double x, xn, error;

        System.out.println("Ingresa x:");
        x = s.nextDouble();
        System.out.println("Ingresa el error");
        error = s.nextDouble();
        for (int i = 0; i < 100; ) {
            int k = i;
            xn = x - (f(x) / y(x));
            System.out.println("x " + ++k + "= " + xn);
            double xfinal = xn - x;
            if (Math.abs(xfinal) < error) {
                System.out.println("La solucion es = " + xn);
                break;
            } else {
                x = xn;
            }
            i++;
            if (i == 100) {
                System.out.println("x = " + xn);
            }
        }
    }
}