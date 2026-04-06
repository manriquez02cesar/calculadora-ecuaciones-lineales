package com.parcial1.cesman;

import com.parcial1.cesman.Determinantes;

import java.util.Scanner;

public class MetodoJacobi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Tamanio de la matriz");
        int tamanio = s.nextInt();
        if (tamanio == 3) {//se puede cambiar
            double x, y, z, xi, yi, zi;
            double[][] ecuacion3x3 = new double[tamanio][tamanio + 1];
            for (int i = 0; i < tamanio; i++) {
                int q = i;
                for (int j = 0; j < tamanio + 1; j++){
                    int k = j;
                    System.out.println("Ingresa el termino " + ++k + " de la " + (q + 1) + " ecuacion");
                    ecuacion3x3[i][j] = s.nextDouble();
                }
            }
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++){
                    System.out.print("[" + ecuacion3x3[i][j] + "]");
                }
                System.out.println();
            }
            double determinanteTotal = Determinantes.determinante3x3(ecuacion3x3);
            if (determinanteTotal != 0){
                System.out.println("Ingrese el error");
                double error = s.nextDouble();
                System.out.println("Ingresa el punto de partida para x: ");
                x = s.nextDouble();
                System.out.println("Ingresa el punto de partida para y: ");
                y = s.nextDouble();
                System.out.println("Ingresa el punto de partida para z: ");
                z = s.nextDouble();
                for (int i = 0; i < 500; i++) {
                    int a, b, c;
                    a = i;
                    b = i;
                    c = i;
                    xi = x;
                    yi = y;
                    zi = z;
                    x = (((ecuacion3x3[0][3]) - ((ecuacion3x3[0][1]) * yi) - ((ecuacion3x3[0][2]) * zi)) / ecuacion3x3[0][0]);
                    y = (((ecuacion3x3[1][3]) - ((ecuacion3x3[1][0]) * xi) - ((ecuacion3x3[1][2]) * zi)) / ecuacion3x3[1][1]);
                    z = (((ecuacion3x3[2][3]) - ((ecuacion3x3[2][0]) * xi) - ((ecuacion3x3[2][1]) * yi)) / ecuacion3x3[2][2]);
                    System.out.println("x" + (++a) + " = " + x);
                    System.out.println("y" + (++b) + " = " + y);
                    System.out.println("z" + (++c) + " = " + z);
                    System.out.println();
                    double restax = x - xi;
                    double restay = y - yi;
                    double restaz = z - zi;
                    if ((Math.sqrt((Math.pow(restax, 2)) + (Math.pow(restay, 2)) + (Math.pow(restaz, 2)))) < error) {
                        System.out.println("Solucion: ");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                        break;
                    }
                }
            }else {
                System.out.println("La matriz no tiene solucion!");
            }
        }
        if (tamanio == 4){
            double x, y, z, w, xi, yi, zi, wi;
            double[][] ecuacion4X4 = new double[tamanio][tamanio + 1];
            for (int i = 0; i < tamanio; i++) {
                int q = i;
                for (int j = 0; j < tamanio + 1; j++){
                    int k = j;
                    System.out.println("Ingresa el termino " + ++k + " de la " + (q + 1) + " ecuacion");
                    ecuacion4X4[i][j] = s.nextDouble();
                }
            }
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++){
                    System.out.print("[" + ecuacion4X4[i][j] + "]");
                }
                System.out.println();
            }
            double determinanteTotal = Determinantes.determinante4x4(ecuacion4X4);
            if (determinanteTotal != 0){
                System.out.println("Ingrese el error");
                double error = s.nextDouble();
                System.out.println("Ingresa el punto de partida para x: ");
                x = s.nextDouble();
                System.out.println("Ingresa el punto de partida para y: ");
                y = s.nextDouble();
                System.out.println("Ingresa el punto de partida para z: ");
                z = s.nextDouble();
                System.out.println("Ingresa el punto de partida para w: ");
                w = s.nextDouble();
                for (int i = 0; i < 500; i++) {
                    int a, b, c, d;
                    a = i;
                    b = i;
                    c = i;
                    d = i;
                    xi = x;
                    yi = y;
                    zi = z;
                    wi = w;
                    x = (((ecuacion4X4[0][4]) - ((ecuacion4X4[0][1]) * yi) - ((ecuacion4X4[0][2]) * zi) - (ecuacion4X4[0][3] * wi)) / ecuacion4X4[0][0]);
                    y = (((ecuacion4X4[1][4]) - ((ecuacion4X4[1][0]) * xi) - ((ecuacion4X4[1][2]) * zi) - (ecuacion4X4[1][3] * wi)) / ecuacion4X4[1][1]);
                    z = (((ecuacion4X4[2][4]) - ((ecuacion4X4[2][0]) * xi) - ((ecuacion4X4[2][1]) * yi) - (ecuacion4X4[2][3] * wi)) / ecuacion4X4[2][2]);
                    w = (((ecuacion4X4[3][4]) - ((ecuacion4X4[3][0]) * xi) - ((ecuacion4X4[3][1]) * yi) - (ecuacion4X4[3][2] * zi)) / ecuacion4X4[3][3]);
                    System.out.println("x" + (++a) + " = " + x);
                    System.out.println("y" + (++b) + " = " + y);
                    System.out.println("z" + (++c) + " = " + z);
                    System.out.println("w" + (++d) + " = " + w);
                    System.out.println();
                    double restax = x - xi;
                    double restay = y - yi;
                    double restaz = z - zi;
                    double restaw = w - wi;
                    if (((Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2) + Math.pow(restaz, 2) + Math.pow(restaw, 2))) <= error)) {
                        System.out.println("Solucion: ");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                        System.out.println("w = " + w);
                        break;
                    }
                }
            }else {
                System.out.println("La matriz no tiene solucion!");
            }
        }
        if (tamanio == 5){
            double x, y, z, w, t, xi, yi, zi, wi, ti;
            double[][] ecuacion5x5 = new double[tamanio][tamanio + 1];
            for (int i = 0; i < tamanio; i++) {
                int q = i;
                for (int j = 0; j < tamanio + 1; j++){
                    int k = j;
                    System.out.println("Ingresa el termino " + ++k + " de la " + (q + 1) + " ecuacion");
                    ecuacion5x5[i][j] = s.nextDouble();
                }
            }
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++){
                    System.out.print("[" + ecuacion5x5[i][j] + "]");
                }
                System.out.println();
            }
            double determinanteTotal = Determinantes.determinante5x5(ecuacion5x5);
            if (determinanteTotal != 0){
                System.out.println("Ingrese el error");
                double error = s.nextDouble();
                System.out.println("Ingresa el punto de partida para x: ");
                x = s.nextDouble();
                System.out.println("Ingresa el punto de partida para y: ");
                y = s.nextDouble();
                System.out.println("Ingresa el punto de partida para z: ");
                z = s.nextDouble();
                System.out.println("Ingresa el punto de partida para w: ");
                w = s.nextDouble();
                System.out.println("Ingresa el punto de partida para t: ");
                t = s.nextDouble();
                for (int i = 0; i < 500; i++) {
                    int a, b, c, d, e;
                    a = i;
                    b = i;
                    c = i;
                    d = i;
                    e = i;
                    xi = x;
                    yi = y;
                    zi = z;
                    wi = w;
                    ti = t;
                    x = (((ecuacion5x5[0][5]) - ((ecuacion5x5[0][1]) * yi) - ((ecuacion5x5[0][2]) * zi) - (ecuacion5x5[0][3] * wi) - (ecuacion5x5[0][4] * ti)) / ecuacion5x5[0][0]);
                    y = (((ecuacion5x5[1][5]) - ((ecuacion5x5[1][0]) * xi) - ((ecuacion5x5[1][2]) * zi) - (ecuacion5x5[1][3] * wi) - (ecuacion5x5[1][4] * ti)) / ecuacion5x5[1][1]);
                    z = (((ecuacion5x5[2][5]) - ((ecuacion5x5[2][0]) * xi) - ((ecuacion5x5[2][1]) * yi) - (ecuacion5x5[2][3] * wi) - (ecuacion5x5[2][4] * ti)) / ecuacion5x5[2][2]);
                    w = (((ecuacion5x5[3][5]) - ((ecuacion5x5[3][0]) * xi) - ((ecuacion5x5[3][1]) * yi) - (ecuacion5x5[3][2] * zi) - (ecuacion5x5[3][4] * ti)) / ecuacion5x5[3][3]);
                    t = (((ecuacion5x5[4][5]) - ((ecuacion5x5[4][0]) * xi) - ((ecuacion5x5[4][1]) * yi) - (ecuacion5x5[4][2] * zi) - (ecuacion5x5[4][3] * wi)) / ecuacion5x5[4][4]);
                    System.out.println("x" + (++a) + " = " + x);
                    System.out.println("y" + (++b) + " = " + y);
                    System.out.println("z" + (++c) + " = " + z);
                    System.out.println("w" + (++d) + " = " + w);
                    System.out.println("t" + (++e) + " = " + t);
                    System.out.println();
                    double restax = x - xi;
                    double restay = y - yi;
                    double restaz = z - zi;
                    double restaw = w - wi;
                    double restat = t - ti;
                    if (((Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2) + Math.pow(restaz, 2) + Math.pow(restaw, 2) + Math.pow(restat, 2))) < error)) {
                        System.out.println("Solucion: ");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                        System.out.println("w = " + w);
                        System.out.println("t = " + t);
                        break;
                    }
                }
            }else {
                System.out.println("La matriz no tiene solucion!");
            }
        }
        if (tamanio == 6){
            double x, y, z, w, t, u, xi, yi, zi, wi, ti, ui;
            double[][] ecuacion6x6 = new double[tamanio][tamanio + 1];
            for (int i = 0; i < tamanio; i++) {
                int q = i;
                for (int j = 0; j < tamanio + 1; j++){
                    int k = j;
                    System.out.println("Ingresa el termino " + ++k + " de la " + (q + 1) + " ecuacion");
                    ecuacion6x6[i][j] = s.nextDouble();
                }
            }
            for (int i = 0; i < tamanio; i++) {
                for (int j = 0; j < tamanio; j++){
                    System.out.print("[" + ecuacion6x6[i][j] + "]");
                }
                System.out.println();
            }
            double determinanteTotal = Determinantes.determinante6x6(ecuacion6x6);
            if (determinanteTotal != 0){
                System.out.println("Ingrese el error");
                double error = s.nextDouble();
                System.out.println("Ingresa el punto de partida para x: ");
                x = s.nextDouble();
                System.out.println("Ingresa el punto de partida para y: ");
                y = s.nextDouble();
                System.out.println("Ingresa el punto de partida para z: ");
                z = s.nextDouble();
                System.out.println("Ingresa el punto de partida para w: ");
                w = s.nextDouble();
                System.out.println("Ingresa el punto de partida para t: ");
                t = s.nextDouble();
                System.out.println("Ingresa el punto de partida para u: ");
                u = s.nextDouble();
                for (int i = 0; i < 500; i++) {
                    int a, b, c, d, e, f;
                    a = i;
                    b = i;
                    c = i;
                    d = i;
                    e = i;
                    f = i;
                    xi = x;
                    yi = y;
                    zi = z;
                    wi = w;
                    ti = t;
                    ui = u;
                    x = (((ecuacion6x6[0][6]) - ((ecuacion6x6[0][1]) * yi) - ((ecuacion6x6[0][2]) * zi) - (ecuacion6x6[0][3] * wi) - (ecuacion6x6[0][4] * ti) - (ecuacion6x6[0][5] * ui)) / ecuacion6x6[0][0]);
                    y = (((ecuacion6x6[1][6]) - ((ecuacion6x6[1][0]) * xi) - ((ecuacion6x6[1][2]) * zi) - (ecuacion6x6[1][3] * wi) - (ecuacion6x6[1][4] * ti) - (ecuacion6x6[1][5] * ui)) / ecuacion6x6[1][1]);
                    z = (((ecuacion6x6[2][6]) - ((ecuacion6x6[2][0]) * xi) - ((ecuacion6x6[2][1]) * yi) - (ecuacion6x6[2][3] * wi) - (ecuacion6x6[2][4] * ti) - (ecuacion6x6[2][5] * ui)) / ecuacion6x6[2][2]);
                    w = (((ecuacion6x6[3][6]) - ((ecuacion6x6[3][0]) * xi) - ((ecuacion6x6[3][1]) * yi) - (ecuacion6x6[3][2] * zi) - (ecuacion6x6[3][4] * ti) - (ecuacion6x6[3][5] * ui)) / ecuacion6x6[3][3]);
                    t = (((ecuacion6x6[4][6]) - ((ecuacion6x6[4][0]) * xi) - ((ecuacion6x6[4][1]) * yi) - (ecuacion6x6[4][2] * zi) - (ecuacion6x6[4][3] * wi) - (ecuacion6x6[4][5] * ui)) / ecuacion6x6[4][4]);
                    u = (((ecuacion6x6[5][6]) - ((ecuacion6x6[5][0]) * xi) - ((ecuacion6x6[5][1]) * yi) - (ecuacion6x6[5][2] * zi) - (ecuacion6x6[5][3] * wi) - (ecuacion6x6[5][4] * ti)) / ecuacion6x6[5][5]);
                    System.out.println("x" + (++a) + " = " + x);
                    System.out.println("y" + (++b) + " = " + y);
                    System.out.println("z" + (++c) + " = " + z);
                    System.out.println("w" + (++d) + " = " + w);
                    System.out.println("t" + (++e) + " = " + t);
                    System.out.println("u" + (++f) + " = " + u);
                    System.out.println();
                    double restax = x - xi;
                    double restay = y - yi;
                    double restaz = z - zi;
                    double restaw = w - wi;
                    double restat = t - ti;
                    double restau = u - ui;
                    if (((Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2) + Math.pow(restaz, 2) + Math.pow(restaw, 2) + Math.pow(restat, 2) + Math.pow(restau, 2))) < error)) {
                        System.out.println("Solucion: ");
                        System.out.println("x = " + x);
                        System.out.println("y = " + y);
                        System.out.println("z = " + z);
                        System.out.println("w = " + w);
                        System.out.println("t = " + t);
                        System.out.println("u = " + u);
                        break;
                    }
                }
            }else {
                System.out.println("La matriz no tiene solucion!");
            }
        }
    }
}
