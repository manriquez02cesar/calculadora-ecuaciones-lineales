package com.parcial1.cesman;

import com.parcial1.cesman.MetodosNewtonRamphson;

import java.util.Scanner;

public class NewtonRamphson {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamanio de la matriz");
        int tamanio = s.nextInt();
        if (tamanio == 2) {
            System.out.println("Ingrese el valor inicial de x");
            double x = s.nextDouble();
            System.out.println("Ingrese el valor inicial de y");
            double y = s.nextDouble();
            System.out.println("Ingrese el error");
            double error = s.nextDouble();
            for (int i = 0; i <= 100; i++) {
                double xi = x;
                double yi = y;
                double[][] m = new double[tamanio][tamanio];
                m[0][0] = (-2 * xi) - 1;//Derivada de la 1 en x
                m[0][1] = (2 * yi);//Derivada de la 1 en y
                m[1][0] = (2 * xi);//Derivada de la 2 en x
                m[1][1] = (-2 * yi) - 1;//Derivada de la 2 en y
                double[][] inverza = MetodosNewtonRamphson.matrizInverza2x2(m);
                double[] vector1 = new double[tamanio];
                vector1[0] = MetodosNewtonRamphson.f2x21(xi, yi);
                vector1[1] = MetodosNewtonRamphson.f2x22(xi, yi);
                double[] vector2 = new double[2];
                vector2[0] = ((vector1[0] * inverza[0][0]) + (vector1[0] * inverza[0][1]));
                vector2[1] = ((vector1[1] * inverza[1][0]) + (vector1[1] * inverza[1][1]));
                x = (xi - vector2[0]);
                y = (yi - vector2[1]);
                double restax = x - xi;
                double restay = y - yi;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println();
                if (( Math.sqrt( (Math.pow(restax, 2)) + (Math.pow(restay, 2)) ) ) < error){
                    System.out.println("Solucion: ");
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    break;
                }else if (i == 100) {
                    System.out.println("No hay solucion");
                    break;
                }
            }
        }
        if (tamanio == 3){
            System.out.println("Ingrese el valor inicial de x");
            double x = s.nextDouble();
            System.out.println("Ingrese el valor inicial de y");
            double y = s.nextDouble();
            System.out.println("Ingrese el valor inicial de z");
            double z = s.nextDouble();
            System.out.println("Ingrese el error");
            double error = s.nextDouble();
            for (int i = 0; i <= 20; i++) {
                double xi = x;
                double yi = y;
                double zi = z;
                double[][] m = new double[tamanio][tamanio];
                m[0][0] = ((1) - (Math.sin(xi * yi * zi) * (yi * zi))) / (2 * Math.sqrt(xi + Math.cos(xi * yi * zi) - 1));//Derivada de la 1 en x
                m[0][1] = -(zi * xi * Math.sin(xi * yi * zi)) / (2 * Math.sqrt(xi + Math.cos(xi * yi * zi) - 1));//Derivada de la 1 en y
                m[0][2] = -(yi * xi * Math.sin(xi * yi * zi)) / (2 * Math.sqrt(xi + Math.cos(xi * yi * zi) - 1));//Derivada de la 1 en z
                m[1][0] = ((-1) / (4 * Math.pow((1 - xi), 3/4f)));//Derivada de la 2 en x
                m[1][1] = (1);//Derivada de la 2 en y
                m[1][2] = (0.1 * zi) - (0.15);//Derivada de la 2 en z
                m[2][0] = (2 * xi);//Derivada de la 3 en x
                m[2][1] = (0.2 * yi) - (0.1);//Derivada de la 3 en y
                m[2][2] = (-1);//Derivada de la 3 en z
                double[][] inverza = MetodosNewtonRamphson.matrizInverza3x3(m);
                double[] vector1 = new double[tamanio];
                vector1[0] = MetodosNewtonRamphson.f3x31(xi, yi, zi);
                vector1[1] = MetodosNewtonRamphson.f3x32(xi, yi, zi);
                vector1[2] = MetodosNewtonRamphson.f3x33(xi, yi, zi);
                double[] vector2 = new double[tamanio];
                vector2[0] = ((vector1[0] * inverza[0][0]) + (vector1[0] * inverza[0][1]) + (vector1[0] * inverza[0][2]));
                vector2[1] = ((vector1[1] * inverza[1][0]) + (vector1[1] * inverza[1][1]) + (vector1[1] * inverza[1][2]));
                vector2[2] = ((vector1[2] * inverza[2][0]) + (vector1[2] * inverza[2][1]) + (vector1[2] * inverza[2][2]));
                x = (xi - vector2[0]);
                y = (yi - vector2[1]);
                z = (zi - vector2[2]);
                double restax = x - xi;
                double restay = y - yi;
                double restaz = z - zi;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println();
                if (( Math.sqrt( (Math.pow(restax, 2)) + (Math.pow(restay, 2)) + (Math.pow(restaz, 2)) ) ) < error){
                    System.out.println("Solucion: ");
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    System.out.println("z = " + z);
                    break;
                } else if (i == 20) {
                    System.out.println("No hay solucion");
                    break;
                }
            }
        }
        if (tamanio == 4){
            System.out.println("Ingrese el valor inicial de x");
            double x = s.nextDouble();
            System.out.println("Ingrese el valor inicial de y");
            double y = s.nextDouble();
            System.out.println("Ingrese el valor inicial de z");
            double z = s.nextDouble();
            System.out.println("Ingrese el valor inicial de w");
            double w = s.nextDouble();
            System.out.println("Ingrese el error");
            double error = s.nextDouble();
            for (int i = 0; i <= 20; i++) {
                double xi = x;
                double yi = y;
                double zi = z;
                double wi = w;
                double[][] m = new double[tamanio][tamanio];
                m[0][0] = zi;//Derivada de la 1 en x
                m[0][1] = 0;//Derivada de la 1 en y
                m[0][2] = xi;//Derivada de la 1 en z
                m[0][3] = -1;//Derivada de la 1 en w
                m[1][0] = 0;//Derivada de la 2 en x
                m[1][1] = (2 * Math.pow(zi, 2) * yi);//Derivada de la 2 en y
                m[1][2] = (2 * Math.pow(yi, 2) * zi);//Derivada de la 2 en z
                m[1][3] = 1;//Derivada de la 2 en w
                m[2][0] = 1;//Derivada de la 3 en x
                m[2][1] = 1;//Derivada de la 3 en y
                m[2][2] = 0;//Derivada de la 3 en z
                m[2][3] = 0;//Derivada de la 3 en w
                m[3][0] = 0;//Derivada de la 4 en x
                m[3][1] = 0;//Derivada de la 4 en y
                m[3][2] = (Math.pow(wi, 2) + (1 / zi));//Derivada de la 4 en z
                m[3][3] = ((2 * wi * zi) + (2 / wi));//Derivada de la 4 en w
                double[][] inverza = MetodosNewtonRamphson.matrizInverza4x4(m);
                double[] vector1 = new double[tamanio];
                vector1[0] = MetodosNewtonRamphson.f4x41(xi, yi, zi, wi);
                vector1[1] = MetodosNewtonRamphson.f4x42(xi, yi, zi, wi);
                vector1[2] = MetodosNewtonRamphson.f4x43(xi, yi, zi, wi);
                vector1[3] = MetodosNewtonRamphson.f4x44(xi, yi, zi, wi);
                double[] vector2 = new double[tamanio];
                vector2[0] = ((vector1[0] * inverza[0][0]) + (vector1[0] * inverza[0][1]) + (vector1[0] * inverza[0][2]) + (vector1[0] * inverza[0][3]));
                vector2[1] = ((vector1[1] * inverza[1][0]) + (vector1[1] * inverza[1][1]) + (vector1[1] * inverza[1][2]) + (vector1[1] * inverza[1][3]));
                vector2[2] = ((vector1[2] * inverza[2][0]) + (vector1[2] * inverza[2][1]) + (vector1[2] * inverza[2][2]) + (vector1[2] * inverza[2][3]));
                vector2[3] = ((vector1[3] * inverza[3][0]) + (vector1[3] * inverza[3][1]) + (vector1[3] * inverza[3][2]) + (vector1[3] * inverza[3][3]));
                x = (xi - vector2[0]);
                y = (yi - vector2[1]);
                z = (zi - vector2[2]);
                w = (wi - vector2[3]);
                double restax = x - xi;
                double restay = y - yi;
                double restaz = z - zi;
                double restaw = w - wi;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println("w = " + w);
                System.out.println();
                if (( Math.sqrt( (Math.pow(restax, 2)) + (Math.pow(restay, 2)) + (Math.pow(restaz, 2)) + (Math.pow(restaw, 2)) ) ) < error){
                    System.out.println("Solucion: ");
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    System.out.println("z = " + z);
                    System.out.println("w = " + w);
                    break;
                } else if (i == 20) {
                    System.out.println("No hay solucion");
                    break;
                }
            }
        }
        if (tamanio == 5){
            System.out.println("Ingrese el valor inicial de x");
            double x = s.nextDouble();
            System.out.println("Ingrese el valor inicial de y");
            double y = s.nextDouble();
            System.out.println("Ingrese el valor inicial de z");
            double z = s.nextDouble();
            System.out.println("Ingrese el valor inicial de w");
            double w = s.nextDouble();
            System.out.println("Ingrese el error");
            double error = s.nextDouble();
            for (int i = 0; i <= 20; i++) {
                double xi = x;
                double yi = y;
                double zi = z;
                double wi = w;
                double[][] m = new double[tamanio][tamanio];
                m[0][0] = zi;//Derivada de la 1 en x
                m[0][1] = 0;//Derivada de la 1 en y
                m[0][2] = xi;//Derivada de la 1 en z
                m[0][3] = -1;//Derivada de la 1 en w
                m[1][0] = 0;//Derivada de la 2 en x
                m[1][1] = (2 * Math.pow(zi, 2) * yi);//Derivada de la 2 en y
                m[1][2] = (2 * Math.pow(yi, 2) * zi);//Derivada de la 2 en z
                m[1][3] = 1;//Derivada de la 2 en w
                m[2][0] = 1;//Derivada de la 3 en x
                m[2][1] = 1;//Derivada de la 3 en y
                m[2][2] = 0;//Derivada de la 3 en z
                m[2][3] = 0;//Derivada de la 3 en w
                m[3][0] = 0;//Derivada de la 4 en x
                m[3][1] = 0;//Derivada de la 4 en y
                m[3][2] = (Math.pow(wi, 2) + (1 / zi));//Derivada de la 4 en z
                m[3][3] = ((2 * wi * zi) + (2 / wi));//Derivada de la 4 en w
                double[][] inverza = MetodosNewtonRamphson.matrizInverza4x4(m);
                double[] vector1 = new double[tamanio];
                vector1[0] = MetodosNewtonRamphson.f4x41(xi, yi, zi, wi);
                vector1[1] = MetodosNewtonRamphson.f4x42(xi, yi, zi, wi);
                vector1[2] = MetodosNewtonRamphson.f4x43(xi, yi, zi, wi);
                vector1[3] = MetodosNewtonRamphson.f4x44(xi, yi, zi, wi);
                double[] vector2 = new double[tamanio];
                vector2[0] = ((vector1[0] * inverza[0][0]) + (vector1[0] * inverza[0][1]) + (vector1[0] * inverza[0][2]) + (vector1[0] * inverza[0][3]));
                vector2[1] = ((vector1[1] * inverza[1][0]) + (vector1[1] * inverza[1][1]) + (vector1[1] * inverza[1][2]) + (vector1[1] * inverza[1][3]));
                vector2[2] = ((vector1[2] * inverza[2][0]) + (vector1[2] * inverza[2][1]) + (vector1[2] * inverza[2][2]) + (vector1[2] * inverza[2][3]));
                vector2[3] = ((vector1[3] * inverza[3][0]) + (vector1[3] * inverza[3][1]) + (vector1[3] * inverza[3][2]) + (vector1[3] * inverza[3][3]));
                x = (xi - vector2[0]);
                y = (yi - vector2[1]);
                z = (zi - vector2[2]);
                w = (wi - vector2[3]);
                double restax = x - xi;
                double restay = y - yi;
                double restaz = z - zi;
                double restaw = w - wi;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println("w = " + w);
                System.out.println();
                if (( Math.sqrt( (Math.pow(restax, 2)) + (Math.pow(restay, 2)) + (Math.pow(restaz, 2)) + (Math.pow(restaw, 2)) ) ) < error){
                    System.out.println("Solucion: ");
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    System.out.println("z = " + z);
                    System.out.println("w = " + w);
                    break;
                } else if (i == 20) {
                    System.out.println("No hay solucion");
                    break;
                }
            }
        }
        if (tamanio == 6){
            System.out.println("Ingrese el valor inicial de x");
            double x = s.nextDouble();
            System.out.println("Ingrese el valor inicial de y");
            double y = s.nextDouble();
            System.out.println("Ingrese el valor inicial de z");
            double z = s.nextDouble();
            System.out.println("Ingrese el valor inicial de w");
            double w = s.nextDouble();
            System.out.println("Ingrese el valor inicial de t");
            double t = s.nextDouble();
            System.out.println("Ingrese el valor inicial de u");
            double u = s.nextDouble();
            System.out.println("Ingrese el error");
            double error = s.nextDouble();
            for (int i = 0; i <= 20; i++) {
                double xi = x;
                double yi = y;
                double zi = z;
                double wi = w;
                double ti = t;
                double ui = u;
                double[][] m = new double[tamanio][tamanio];
                m[0][0] = yi;//Derivada de la 1 en x
                m[0][1] = xi;//Derivada de la 1 en y
                m[0][2] = 0;//Derivada de la 1 en z
                m[0][3] = ui;//Derivada de la 1 en w
                m[0][4] = 0;//Derivada de la 1 en t
                m[0][5] = wi;//Derivada de la 1 en u
                m[1][0] = 0;//Derivada de la 2 en x
                m[1][1] = 1;//Derivada de la 2 en y
                m[1][2] = 0;//Derivada de la 2 en z
                m[1][3] = 0;//Derivada de la 2 en w
                m[1][4] = 1;//Derivada de la 2 en t
                m[1][5] = 1;//Derivada de la 2 en u
                m[2][0] = 1;//Derivada de la 3 en x
                m[2][1] = 1 / yi;//Derivada de la 3 en y
                m[2][2] = 0;//Derivada de la 3 en z
                m[2][3] = - (1 / wi);//Derivada de la 3 en w
                m[2][4] = 0;//Derivada de la 3 en t
                m[2][5] = 0;//Derivada de la 3 en u
                m[3][0] = 0;//Derivada de la 4 en x
                m[3][1] = 0;//Derivada de la 4 en y
                m[3][2] = ((2 * zi) + 1);//Derivada de la 4 en z
                m[3][3] = 0;//Derivada de la 4 en w
                m[3][4] = 0;//Derivada de la 4 en t
                m[3][5] = 0;//Derivada de la 4 en u
                m[4][0] = 0;//Derivada de la 5 en x
                m[4][1] = 1;//Derivada de la 5 en y
                m[4][2] = 0;//Derivada de la 5 en z
                m[4][3] = 1;//Derivada de la 5 en w
                m[4][4] = 0;//Derivada de la 5 en t
                m[4][5] = 0;//Derivada de la 5 en u
                m[5][0] = 0;//Derivada de la 6 en x
                m[5][1] = 0;//Derivada de la 6 en y
                m[5][2] = (2 * zi) + 6;//Derivada de la 6 en z
                m[5][3] = 0;//Derivada de la 6 en w
                m[5][4] = 0;//Derivada de la 6 en t
                m[5][5] = 0;//Derivada de la 6 en u
                double[][] inverza = MetodosNewtonRamphson.matrizInverza6x6(m);
                double[] vector1 = new double[tamanio];
                vector1[0] = MetodosNewtonRamphson.f6x61(xi, yi, zi, wi, ti, ui);
                vector1[1] = MetodosNewtonRamphson.f6x62(xi, yi, zi, wi, ti, ui);
                vector1[2] = MetodosNewtonRamphson.f6x63(xi, yi, zi, wi, ti, ui);
                vector1[3] = MetodosNewtonRamphson.f6x64(xi, yi, zi, wi, ti, ui);
                vector1[4] = MetodosNewtonRamphson.f6x65(xi, yi, zi, wi, ti, ui);
                vector1[5] = MetodosNewtonRamphson.f6x66(xi, yi, zi, wi, ti, ui);
                double[] vector2 = new double[tamanio];
                vector2[0] = ((vector1[0] * inverza[0][0]) + (vector1[0] * inverza[0][1]) + (vector1[0] * inverza[0][2]) + (vector1[0] * inverza[0][3]) + (vector1[0] * inverza[0][4]) + (vector1[0] * inverza[0][5]));
                vector2[1] = ((vector1[1] * inverza[1][0]) + (vector1[1] * inverza[1][1]) + (vector1[1] * inverza[1][2]) + (vector1[1] * inverza[1][3]) + (vector1[1] * inverza[1][4]) + (vector1[1] * inverza[1][5]));
                vector2[2] = ((vector1[2] * inverza[2][0]) + (vector1[2] * inverza[2][1]) + (vector1[2] * inverza[2][2]) + (vector1[2] * inverza[2][3]) + (vector1[2] * inverza[2][4]) + (vector1[2] * inverza[2][5]));
                vector2[3] = ((vector1[3] * inverza[3][0]) + (vector1[3] * inverza[3][1]) + (vector1[3] * inverza[3][2]) + (vector1[3] * inverza[3][3]) + (vector1[3] * inverza[3][4]) + (vector1[3] * inverza[3][5]));
                vector2[4] = ((vector1[4] * inverza[4][0]) + (vector1[4] * inverza[4][1]) + (vector1[4] * inverza[4][2]) + (vector1[4] * inverza[4][3]) + (vector1[4] * inverza[4][4]) + (vector1[4] * inverza[4][5]));
                vector2[5] = ((vector1[5] * inverza[5][0]) + (vector1[5] * inverza[5][1]) + (vector1[5] * inverza[5][2]) + (vector1[5] * inverza[5][3]) + (vector1[5] * inverza[5][4]) + (vector1[5] * inverza[5][5]));
                x = (xi - vector2[0]);
                y = (yi - vector2[1]);
                z = (zi - vector2[2]);
                w = (wi - vector2[3]);
                t = (ti - vector2[4]);
                u = (ui - vector2[5]);
                double restax = x - xi;
                double restay = y - yi;
                double restaz = z - zi;
                double restaw = w - wi;
                double restat = t - ti;
                double restau = u - ui;
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println("w = " + w);
                System.out.println("t = " + t);
                System.out.println("u = " + u);
                System.out.println();
                if (( Math.sqrt( (Math.pow(restax, 2)) + (Math.pow(restay, 2)) + (Math.pow(restaz, 2)) + (Math.pow(restaw, 2)) + (Math.pow(restat, 2)) + (Math.pow(restau, 2)) ) ) < error){
                    System.out.println("Solucion: ");
                    System.out.println("x = " + x);
                    System.out.println("y = " + y);
                    System.out.println("z = " + z);
                    System.out.println("w = " + w);
                    System.out.println("t = " + t);
                    System.out.println("u = " + u);
                    break;
                } else if (i == 20) {
                    System.out.println("No hay solucion");
                    break;
                }
            }
        }
    }
}
