package com.parcial1.cesman;

import com.parcial1.cesman.Determinantes;

public class MetodosNewtonRamphson {
    public static double[][] matrizInverza2x2(double[][] matriz) {
        double[][] matrizInv = new double[2][2];
        if (Determinantes.determinante2x2(matriz) != 0){
            double det2x2 = Determinantes.determinante2x2(matriz);
            matrizInv[0][0] = (matriz[1][1]) / det2x2;
            matrizInv[1][1] = (matriz[0][0]) / det2x2;
            matrizInv[0][1] = (-1 * matriz[0][1]) / det2x2;
            matrizInv[1][0] = (-1 * matriz[1][0]) / det2x2;
        }else {
            System.out.println("No existe su inverza, el determinantes es igual a 0");
            System.exit(-1);
        }
        return matrizInv;
    }
    public static double f2x21(double x, double y) {
        return ((Math.pow(x, 2)) + (Math.pow(y, 2)) - (x));
    }
    public static double f2x22(double x, double y) {
        return ((Math.pow(x, 2)) - (Math.pow(y, 2)) - (y));
    }



    //Matrices de 3
    public static double[][] matrizInverza3x3(double[][] matriz) {
        double[][] matrizInv = new double[3][3];
        double[][] matrizAdj = new double[3][3];
        double[][] matriz2 = new double[2][2];
        double[][] matrizTot = new double[3][3];
        if (Determinantes.determinante3x3(matriz) != 0){
            double det3x3 = Determinantes.determinante3x3(matriz);
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    matrizInv[i][j] = matriz[j][i];
                }
            }

            matriz2[0][0] = matrizInv[1][1];
            matriz2[0][1] = matrizInv[1][2];
            matriz2[1][0] = matrizInv[2][1];
            matriz2[1][1] = matrizInv[2][2];
            matrizAdj[0][0] = (Determinantes.determinante2x2(matriz2));

            matriz2[0][0] = matrizInv[1][0];
            matriz2[0][1] = matrizInv[1][2];
            matriz2[1][0] = matrizInv[2][0];
            matriz2[1][1] = matrizInv[2][2];
            matrizAdj[0][1] = (Determinantes.determinante2x2(matriz2));

            matriz2[0][0] = matrizInv[1][0];
            matriz2[0][1] = matrizInv[1][1];
            matriz2[1][0] = matrizInv[2][0];
            matriz2[1][1] = matrizInv[2][1];
            matrizAdj[0][2] = (Determinantes.determinante2x2(matriz2));
            //
            matriz2[0][0] = matrizInv[0][1];
            matriz2[0][1] = matrizInv[0][2];
            matriz2[1][0] = matrizInv[2][1];
            matriz2[1][1] = matrizInv[2][2];
            matrizAdj[1][0] = (Determinantes.determinante2x2(matriz2));

            matriz2[0][0] = matrizInv[0][0];
            matriz2[0][1] = matrizInv[0][2];
            matriz2[1][0] = matrizInv[2][0];
            matriz2[1][1] = matrizInv[2][2];
            matrizAdj[1][1] = (Determinantes.determinante2x2(matriz2));

            matriz2[0][0] = matrizInv[0][0];
            matriz2[0][1] = matrizInv[0][1];
            matriz2[1][0] = matrizInv[2][0];
            matriz2[1][1] = matrizInv[2][1];
            matrizAdj[1][2] = (Determinantes.determinante2x2(matriz2));
            //
            matriz2[0][0] = matrizInv[0][1];
            matriz2[0][1] = matrizInv[0][2];
            matriz2[1][0] = matrizInv[1][1];
            matriz2[1][1] = matrizInv[1][2];
            matrizAdj[2][0] = (Determinantes.determinante2x2(matriz2));

            matriz2[0][0] = matrizInv[0][0];
            matriz2[0][1] = matrizInv[0][2];
            matriz2[1][0] = matrizInv[1][0];
            matriz2[1][1] = matrizInv[1][2];
            matrizAdj[2][1] = (Determinantes.determinante2x2(matriz2));

            matriz2[0][0] = matrizInv[0][0];
            matriz2[0][1] = matrizInv[0][1];
            matriz2[1][0] = matrizInv[1][0];
            matriz2[1][1] = matrizInv[1][1];
            matrizAdj[2][2] = (Determinantes.determinante2x2(matriz2));
            for (int i = 0; i < 3 ; i++){
                for (int j = 0; j < 3; j++){
                    matrizTot[i][j] = (matrizAdj[i][j]) / det3x3;
                }
            }


        }else {
            System.out.println("No existe su inverza, el determinantes es igual a 0");
            System.exit(-1);
        }
        return matrizTot;
    }
    public static double f3x31(double x, double y, double z) {
        return (Math.sqrt((x) + (Math.cos(x * y * z)) - 1));
    }
    public static double f3x32(double x, double y, double z) {
        return ((Math.pow((1 - x), 1/4f)) + (y) + (z * (0.05 * z - 0.15)) - 1);
    }
    public static double f3x33(double x, double y, double z) {
        return (1 + (Math.pow(x, 2)) + (0.1 * Math.pow(y, 2)) - (0.01 * y) - z);
    }

    //Matrices 4
    public static double[][] matrizInverza4x4(double[][] matriz) {
        double[][] matrizInv = new double[4][4];
        double[][] matrizAdj = new double[4][4];
        double[][] matriz4 = new double[3][3];
        double[][] matrizTot = new double[4][4];
        if (Determinantes.determinante4x4(matriz) != 0){
            double det4x4 = Determinantes.determinante4x4(matriz);
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 4; j++){
                    matrizInv[i][j] = matriz[j][i];
                }
            }

            matriz4[0][0] = matrizInv[1][1];
            matriz4[0][1] = matrizInv[1][2];
            matriz4[0][2] = matrizInv[1][3];
            matriz4[1][0] = matrizInv[2][1];
            matriz4[1][1] = matrizInv[2][2];
            matriz4[1][2] = matrizInv[2][3];
            matriz4[2][0] = matrizInv[3][1];
            matriz4[2][1] = matrizInv[3][2];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[0][0] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[1][0];
            matriz4[0][1] = matrizInv[1][2];
            matriz4[0][2] = matrizInv[1][3];
            matriz4[1][0] = matrizInv[2][0];
            matriz4[1][1] = matrizInv[2][2];
            matriz4[1][2] = matrizInv[2][3];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][2];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[0][1] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[1][0];
            matriz4[0][1] = matrizInv[1][1];
            matriz4[0][2] = matrizInv[1][3];
            matriz4[1][0] = matrizInv[2][0];
            matriz4[1][1] = matrizInv[2][1];
            matriz4[1][2] = matrizInv[2][3];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][1];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[0][2] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[1][0];
            matriz4[0][1] = matrizInv[1][1];
            matriz4[0][2] = matrizInv[1][2];
            matriz4[1][0] = matrizInv[2][0];
            matriz4[1][1] = matrizInv[2][1];
            matriz4[1][2] = matrizInv[2][2];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][1];
            matriz4[2][2] = matrizInv[3][2];
            matrizAdj[0][3] = (Determinantes.determinante3x3(matriz4));
            //
            matriz4[0][0] = matrizInv[0][1];
            matriz4[0][1] = matrizInv[0][2];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[2][1];
            matriz4[1][1] = matrizInv[2][2];
            matriz4[1][2] = matrizInv[2][3];
            matriz4[2][0] = matrizInv[3][1];
            matriz4[2][1] = matrizInv[3][2];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[1][0] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][2];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[2][0];
            matriz4[1][1] = matrizInv[2][2];
            matriz4[1][2] = matrizInv[2][3];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][2];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[1][1] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][1];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[2][0];
            matriz4[1][1] = matrizInv[2][1];
            matriz4[1][2] = matrizInv[2][3];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][1];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[1][2] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][1];
            matriz4[0][2] = matrizInv[0][2];
            matriz4[1][0] = matrizInv[2][0];
            matriz4[1][1] = matrizInv[2][1];
            matriz4[1][2] = matrizInv[2][2];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][1];
            matriz4[2][2] = matrizInv[3][2];
            matrizAdj[1][3] = (Determinantes.determinante3x3(matriz4));
            //
            matriz4[0][0] = matrizInv[0][1];
            matriz4[0][1] = matrizInv[0][2];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[1][1];
            matriz4[1][1] = matrizInv[1][2];
            matriz4[1][2] = matrizInv[1][3];
            matriz4[2][0] = matrizInv[3][1];
            matriz4[2][1] = matrizInv[3][2];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[2][0] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][2];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[1][0];
            matriz4[1][1] = matrizInv[1][2];
            matriz4[1][2] = matrizInv[1][3];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][2];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[2][1] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][1];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[1][0];
            matriz4[1][1] = matrizInv[1][1];
            matriz4[1][2] = matrizInv[1][3];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][1];
            matriz4[2][2] = matrizInv[3][3];
            matrizAdj[2][2] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][1];
            matriz4[0][2] = matrizInv[0][2];
            matriz4[1][0] = matrizInv[1][0];
            matriz4[1][1] = matrizInv[1][1];
            matriz4[1][2] = matrizInv[1][2];
            matriz4[2][0] = matrizInv[3][0];
            matriz4[2][1] = matrizInv[3][1];
            matriz4[2][2] = matrizInv[3][2];
            matrizAdj[2][3] = (Determinantes.determinante3x3(matriz4));
            //
            matriz4[0][0] = matrizInv[0][1];
            matriz4[0][1] = matrizInv[0][2];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[1][1];
            matriz4[1][1] = matrizInv[1][2];
            matriz4[1][2] = matrizInv[1][3];
            matriz4[2][0] = matrizInv[2][1];
            matriz4[2][1] = matrizInv[2][2];
            matriz4[2][2] = matrizInv[2][3];
            matrizAdj[3][0] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][2];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[1][0];
            matriz4[1][1] = matrizInv[1][2];
            matriz4[1][2] = matrizInv[1][3];
            matriz4[2][0] = matrizInv[2][0];
            matriz4[2][1] = matrizInv[2][2];
            matriz4[2][2] = matrizInv[2][3];
            matrizAdj[3][1] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][1];
            matriz4[0][2] = matrizInv[0][3];
            matriz4[1][0] = matrizInv[1][0];
            matriz4[1][1] = matrizInv[1][1];
            matriz4[1][2] = matrizInv[1][3];
            matriz4[2][0] = matrizInv[2][0];
            matriz4[2][1] = matrizInv[2][1];
            matriz4[2][2] = matrizInv[2][3];
            matrizAdj[3][2] = (Determinantes.determinante3x3(matriz4));

            matriz4[0][0] = matrizInv[0][0];
            matriz4[0][1] = matrizInv[0][1];
            matriz4[0][2] = matrizInv[0][2];
            matriz4[1][0] = matrizInv[1][0];
            matriz4[1][1] = matrizInv[1][1];
            matriz4[1][2] = matrizInv[1][2];
            matriz4[2][0] = matrizInv[2][0];
            matriz4[2][1] = matrizInv[2][1];
            matriz4[2][2] = matrizInv[2][2];
            matrizAdj[3][3] = (Determinantes.determinante3x3(matriz4));
            for (int i = 0; i < 4 ; i++){
                for (int j = 0; j < 4; j++){
                    matrizTot[i][j] = (matrizAdj[i][j]) / det4x4;
                }
            }


        }else {
            System.out.println("No existe su inverza, el determinantes es igual a 0");
            System.exit(-1);
        }
        return matrizTot;
    }
    public static double f4x41(double x, double y, double z, double w) {
        return ((x * z) - (w) - 1);
    }
    public static double f4x42(double x, double y, double z, double w) {
        return ((Math.pow(y, 2) * Math.pow(z, 2)) + (w) - 17);
    }
    public static double f4x43(double x, double y, double z, double w) {
        return (x + y - 6);
    }
    public static double f4x44(double x, double y, double z, double w) {
        return ((Math.log(z * Math.pow(w, 2))) + (z * Math.pow(w, 2)));
    }

    //Matrices 6x6
    public static double[][] matrizInverza6x6(double[][] matriz) {
        double[][] matrizInv = new double[6][6];
        double[][] matrizAdj = new double[6][6];
        double[][] matriz6 = new double[5][5];
        double[][] matrizTot = new double[6][6];
        if (Determinantes.determinante6x6(matriz) != 0){
            double det6x6 = Determinantes.determinante6x6(matriz);
            for (int i = 0; i < 6; i++){
                for (int j = 0; j < 6; j++){
                    matrizInv[i][j] = matriz[j][i];
                }
            }

            matriz6[0][0] = matrizInv[1][1];
            matriz6[0][1] = matrizInv[1][2];
            matriz6[0][2] = matrizInv[1][3];
            matriz6[0][3] = matrizInv[1][4];
            matriz6[0][4] = matrizInv[1][5];
            matriz6[1][0] = matrizInv[2][1];
            matriz6[1][1] = matrizInv[2][2];
            matriz6[1][2] = matrizInv[2][3];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][1];
            matriz6[2][1] = matrizInv[3][2];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][1];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][1];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[0][0] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[1][0];
            matriz6[0][1] = matrizInv[1][2];
            matriz6[0][2] = matrizInv[1][3];
            matriz6[0][3] = matrizInv[1][4];
            matriz6[0][4] = matrizInv[1][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][2];
            matriz6[1][2] = matrizInv[2][3];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][2];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[0][1] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[1][0];
            matriz6[0][1] = matrizInv[1][1];
            matriz6[0][2] = matrizInv[1][3];
            matriz6[0][3] = matrizInv[1][4];
            matriz6[0][4] = matrizInv[1][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][3];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[0][2] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[1][0];
            matriz6[0][1] = matrizInv[1][1];
            matriz6[0][2] = matrizInv[1][2];
            matriz6[0][3] = matrizInv[1][4];
            matriz6[0][4] = matrizInv[1][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][2];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[0][3] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[1][0];
            matriz6[0][1] = matrizInv[1][1];
            matriz6[0][2] = matrizInv[1][2];
            matriz6[0][3] = matrizInv[1][3];
            matriz6[0][4] = matrizInv[1][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][2];
            matriz6[1][3] = matrizInv[2][3];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][3];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[0][4] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[1][0];
            matriz6[0][1] = matrizInv[1][1];
            matriz6[0][2] = matrizInv[1][2];
            matriz6[0][3] = matrizInv[1][3];
            matriz6[0][4] = matrizInv[1][4];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][2];
            matriz6[1][3] = matrizInv[2][3];
            matriz6[1][4] = matrizInv[2][4];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][3];
            matriz6[2][4] = matrizInv[3][4];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][4];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][4];
            matrizAdj[0][5] = (Determinantes.determinante5x5(matriz6));
            //
            matriz6[0][0] = matrizInv[0][1];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[2][1];
            matriz6[1][1] = matrizInv[2][2];
            matriz6[1][2] = matrizInv[2][3];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][1];
            matriz6[2][1] = matrizInv[3][2];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][1];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][1];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[1][0] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][2];
            matriz6[1][2] = matrizInv[2][3];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][2];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[1][1] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][3];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[1][2] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][2];
            matriz6[1][3] = matrizInv[2][4];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[1][3] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][2];
            matriz6[1][3] = matrizInv[2][3];
            matriz6[1][4] = matrizInv[2][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][3];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[1][4] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][4];
            matriz6[1][0] = matrizInv[2][0];
            matriz6[1][1] = matrizInv[2][1];
            matriz6[1][2] = matrizInv[2][2];
            matriz6[1][3] = matrizInv[2][3];
            matriz6[1][4] = matrizInv[2][4];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][3];
            matriz6[2][4] = matrizInv[3][4];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][4];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][4];
            matrizAdj[1][5] = (Determinantes.determinante5x5(matriz6));
            //
            matriz6[0][0] = matrizInv[0][1];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][1];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[3][1];
            matriz6[2][1] = matrizInv[3][2];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][1];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][1];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[2][0] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][2];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[2][1] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][3];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[2][2] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][4];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[2][3] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][3];
            matriz6[2][4] = matrizInv[3][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[2][4] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][4];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][4];
            matriz6[2][0] = matrizInv[3][0];
            matriz6[2][1] = matrizInv[3][1];
            matriz6[2][2] = matrizInv[3][2];
            matriz6[2][3] = matrizInv[3][3];
            matriz6[2][4] = matrizInv[3][4];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][4];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][4];
            matrizAdj[2][5] = (Determinantes.determinante5x5(matriz6));
            //
            matriz6[0][0] = matrizInv[0][1];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][1];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][1];
            matriz6[2][1] = matrizInv[2][2];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[4][1];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][1];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[3][0] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][2];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][2];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[3][1] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][3];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[3][2] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][4];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[3][3] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][3];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[3][4] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][4];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][4];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][3];
            matriz6[2][4] = matrizInv[2][4];
            matriz6[3][0] = matrizInv[4][0];
            matriz6[3][1] = matrizInv[4][1];
            matriz6[3][2] = matrizInv[4][2];
            matriz6[3][3] = matrizInv[4][3];
            matriz6[3][4] = matrizInv[4][4];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][4];
            matrizAdj[3][5] = (Determinantes.determinante5x5(matriz6));
            //
            matriz6[0][0] = matrizInv[0][1];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][1];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][1];
            matriz6[2][1] = matrizInv[2][2];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][1];
            matriz6[3][1] = matrizInv[3][2];
            matriz6[3][2] = matrizInv[3][3];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[5][1];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[4][0] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][2];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][2];
            matriz6[3][2] = matrizInv[3][3];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][2];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[4][1] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][3];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][3];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[4][2] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][2];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][4];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[4][3] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][3];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][2];
            matriz6[3][3] = matrizInv[3][3];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][5];
            matrizAdj[4][4] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][4];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][4];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][3];
            matriz6[2][4] = matrizInv[2][4];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][2];
            matriz6[3][3] = matrizInv[3][3];
            matriz6[3][4] = matrizInv[3][4];
            matriz6[4][0] = matrizInv[5][0];
            matriz6[4][1] = matrizInv[5][1];
            matriz6[4][2] = matrizInv[5][2];
            matriz6[4][3] = matrizInv[5][3];
            matriz6[4][4] = matrizInv[5][4];
            matrizAdj[4][5] = (Determinantes.determinante5x5(matriz6));
            //
            matriz6[0][0] = matrizInv[0][1];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][1];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][1];
            matriz6[2][1] = matrizInv[2][2];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][1];
            matriz6[3][1] = matrizInv[3][2];
            matriz6[3][2] = matrizInv[3][3];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[4][1];
            matriz6[4][1] = matrizInv[4][2];
            matriz6[4][2] = matrizInv[4][3];
            matriz6[4][3] = matrizInv[4][4];
            matriz6[4][4] = matrizInv[4][5];
            matrizAdj[5][0] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][2];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][2];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][2];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][2];
            matriz6[3][2] = matrizInv[3][3];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[4][0];
            matriz6[4][1] = matrizInv[4][2];
            matriz6[4][2] = matrizInv[4][3];
            matriz6[4][3] = matrizInv[4][4];
            matriz6[4][4] = matrizInv[4][5];
            matrizAdj[5][1] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][3];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][3];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][3];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][3];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[4][0];
            matriz6[4][1] = matrizInv[4][1];
            matriz6[4][2] = matrizInv[4][3];
            matriz6[4][3] = matrizInv[4][4];
            matriz6[4][4] = matrizInv[4][5];
            matrizAdj[5][2] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][4];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][4];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][4];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][2];
            matriz6[3][3] = matrizInv[3][4];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[4][0];
            matriz6[4][1] = matrizInv[4][1];
            matriz6[4][2] = matrizInv[4][2];
            matriz6[4][3] = matrizInv[4][4];
            matriz6[4][4] = matrizInv[4][5];
            matrizAdj[5][3] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][5];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][5];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][3];
            matriz6[2][4] = matrizInv[2][5];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][2];
            matriz6[3][3] = matrizInv[3][3];
            matriz6[3][4] = matrizInv[3][5];
            matriz6[4][0] = matrizInv[4][0];
            matriz6[4][1] = matrizInv[4][1];
            matriz6[4][2] = matrizInv[4][2];
            matriz6[4][3] = matrizInv[4][3];
            matriz6[4][4] = matrizInv[4][5];
            matrizAdj[5][4] = (Determinantes.determinante5x5(matriz6));

            matriz6[0][0] = matrizInv[0][0];
            matriz6[0][1] = matrizInv[0][1];
            matriz6[0][2] = matrizInv[0][2];
            matriz6[0][3] = matrizInv[0][3];
            matriz6[0][4] = matrizInv[0][4];
            matriz6[1][0] = matrizInv[1][0];
            matriz6[1][1] = matrizInv[1][1];
            matriz6[1][2] = matrizInv[1][2];
            matriz6[1][3] = matrizInv[1][3];
            matriz6[1][4] = matrizInv[1][4];
            matriz6[2][0] = matrizInv[2][0];
            matriz6[2][1] = matrizInv[2][1];
            matriz6[2][2] = matrizInv[2][2];
            matriz6[2][3] = matrizInv[2][3];
            matriz6[2][4] = matrizInv[2][4];
            matriz6[3][0] = matrizInv[3][0];
            matriz6[3][1] = matrizInv[3][1];
            matriz6[3][2] = matrizInv[3][2];
            matriz6[3][3] = matrizInv[3][3];
            matriz6[3][4] = matrizInv[3][4];
            matriz6[4][0] = matrizInv[4][0];
            matriz6[4][1] = matrizInv[4][1];
            matriz6[4][2] = matrizInv[4][2];
            matriz6[4][3] = matrizInv[4][3];
            matriz6[4][4] = matrizInv[4][4];
            matrizAdj[5][5] = (Determinantes.determinante5x5(matriz6));
            for (int i = 0; i < 6; i++){
                for (int j = 0; j < 6; j++){
                    matrizTot[i][j] = (matrizAdj[i][j]) / det6x6;
                }
            }


        }else {
            System.out.println("No existe su inverza, el determinantes es igual a 0");
            System.exit(-1);
        }
        return matrizTot;
    }
    public static double f6x61(double x, double y, double z, double w, double t, double u) {
        return ((x * y) + (u * w) - 18);
    }
    public static double f6x62(double x, double y, double z, double w, double t, double u) {
        return (y + t + u - 12);
    }
    public static double f6x63(double x, double y, double z, double w, double t, double u) {
        return (x + (Math.log(y / w)) - 3);
    }
    public static double f6x64(double x, double y, double z, double w, double t, double u) {
        return ((Math.pow(z, 2)) + (z) - 2);
    }
    public static double f6x65(double x, double y, double z, double w, double t, double u) {
        return (y + w - 4);
    }
    public static double f6x66(double x, double y, double z, double w, double t, double u) {
        return ((z * (z + 6)) - 7);
    }
}
