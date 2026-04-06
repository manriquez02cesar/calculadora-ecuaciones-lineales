package com.parcial1.cesman;

public class Determinantes {
    public static double determinante2x2(double[][] matriz){
        double det = 0;
        det = ((matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]));
        return det;
    }
    public static double determinante3x3(double[][] matriz){
        double det = 0;
        double semiDet1 = (matriz[0][0] * ((matriz[1][1] * matriz[2][2]) - (matriz[2][1] * matriz[1][2])));
        double semiDet2 = ((-1 * matriz[0][1]) * ((matriz[1][0] * matriz[2][2]) - (matriz[2][0] * matriz[1][2])));
        double semiDet3 = (matriz[0][2] * ((matriz[1][0] * matriz[2][1]) - (matriz[2][0] * matriz[1][1])));
        det = semiDet1 + semiDet2 + semiDet3;
        return det;
    }
    public static double determinante4x4(double[][] matriz){
        double det = 0;
        double semiDet1 = ((matriz[0][0]) * ( ( ((matriz[1][1]) * ((matriz[2][2] * matriz[3][3]) - (matriz[3][2] * matriz[2][3])))
                + ((-1 * matriz[1][2]) * ((matriz[2][1] * matriz[3][3]) - (matriz[3][1] * matriz[2][3])))
                + ((matriz[1][3]) * ((matriz[2][1] * matriz[3][2]) - (matriz[3][1] * matriz[2][2]))))) );
        double semiDet2 = ((-1 * matriz[0][1]) * ((matriz[1][0] * ((matriz[2][2] * matriz[3][3]) - (matriz[3][2] * matriz[2][3])))
                + ((-1 * matriz[1][2]) * ((matriz[2][0] * matriz[3][3]) - (matriz[3][0] * matriz[2][3])))
                + ((matriz[1][3]) * ((matriz[2][0] * matriz[3][2]) - (matriz[3][0] * matriz[2][2])))) );
        double semiDet3 = ((matriz[0][2]) * ((matriz[1][0] * ((matriz[2][1] * matriz[3][3]) - (matriz[3][1] * matriz[2][3])))
                + ((-1 * matriz[1][1]) * ((matriz[2][0] * matriz[3][3]) - (matriz[3][0] * matriz[2][3])))
                + ((matriz[1][3]) * ((matriz[2][0] * matriz[3][1]) - (matriz[3][0] * matriz[2][1])))) );
        double semiDet4 = ((-1 * matriz[0][3]) * ((matriz[1][0] * ((matriz[2][1] * matriz[3][2]) - (matriz[3][1] * matriz[2][2])))
                + ((-1 * matriz[1][1]) * ((matriz[2][0] * matriz[3][2]) - (matriz[3][0] * matriz[2][2])))
                + ((matriz[1][2]) * ((matriz[2][0] * matriz[3][1]) - (matriz[3][0] * matriz[2][1])))) );
        det = semiDet1 + semiDet2 + semiDet3 + semiDet4;
        return det;
    }
    public static double determinante5x5(double[][] matriz){
        double det = 0;
        double mat00 = matriz[0][0];
        double mat01 = (-1 * matriz[0][1]);
        double mat02 = matriz[0][2];
        double mat03 = (-1 * matriz[0][3]);
        double mat04 = matriz[0][4];
        double semi1Det4x4 = ((matriz[1][1]) * (((matriz[2][2]) * ((matriz[3][3] * matriz[4][4]) - (matriz[4][3] * matriz[3][4])))
                + ((-1 * matriz[2][3]) * ((matriz[3][2] * matriz[4][4]) - (matriz[4][2] * matriz[3][4])))
                + ((matriz[2][4]) * ((matriz[3][2] * matriz[4][3]) - (matriz[4][2] * matriz[3][3]))))) +
                ((-1 * matriz[1][2]) * (((matriz[2][1]) * ((matriz[3][3] * matriz[4][4]) - (matriz[4][3] * matriz[3][4])))
                        + ((-1 * matriz[2][3]) * ((matriz[3][1] * matriz[4][4]) - (matriz[4][1] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][1] * matriz[4][3]) - (matriz[4][1] * matriz[3][3]))))) +
                ((matriz[1][3]) * (((matriz[2][1]) * ((matriz[3][2] * matriz[4][4]) - (matriz[4][2] * matriz[3][4])))
                        + ((-1 * matriz[2][2]) * ((matriz[3][1] * matriz[4][4]) - (matriz[4][1] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][1] * matriz[4][2]) - (matriz[4][1] * matriz[3][2]))))) +
                ((-1 * matriz[1][4]) * (((matriz[2][1]) * ((matriz[3][2] * matriz[4][3]) - (matriz[4][2] * matriz[3][3])))
                        + ((-1 * matriz[2][2]) * ((matriz[3][1] * matriz[4][3]) - (matriz[4][1] * matriz[3][3])))
                        + ((matriz[2][3]) * ((matriz[3][1] * matriz[4][2]) - (matriz[4][1] * matriz[3][2])))));
        double semi1Det5x5 = semi1Det4x4 * mat00;
        double semi2Det4x4 = ((matriz[1][0]) * (((matriz[2][2]) * ((matriz[3][3] * matriz[4][4]) - (matriz[4][3] * matriz[3][4])))
                + ((-1 * matriz[2][3]) * ((matriz[3][2] * matriz[4][4]) - (matriz[4][2] * matriz[3][4])))
                + ((matriz[2][4]) * ((matriz[3][2] * matriz[4][3]) - (matriz[4][2] * matriz[3][3]))))) +
                ((-1 * matriz[1][2]) * (((matriz[2][0]) * ((matriz[3][3] * matriz[4][4]) - (matriz[4][3] * matriz[3][4])))
                        + ((-1 * matriz[2][3]) * ((matriz[3][0] * matriz[4][4]) - (matriz[4][0] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][0] * matriz[4][3]) - (matriz[4][0] * matriz[3][3]))))) +
                ((matriz[1][3]) * (((matriz[2][0]) * ((matriz[3][2] * matriz[4][4]) - (matriz[4][2] * matriz[3][4])))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * matriz[4][4]) - (matriz[4][0] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][0] * matriz[4][2]) - (matriz[4][0] * matriz[3][2]))))) +
                ((-1 * matriz[1][4]) * (((matriz[2][0]) * ((matriz[3][2] * matriz[4][3]) - (matriz[4][2] * matriz[3][3])))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * matriz[4][3]) - (matriz[4][0] * matriz[3][3])))
                        + ((matriz[2][3]) * ((matriz[3][0] * matriz[4][2]) - (matriz[4][0] * matriz[3][2])))));
        double semi2Det5x5 = semi2Det4x4 * mat01;
        double semi3Det4x4 = ((matriz[1][0]) * (((matriz[2][1]) * ((matriz[3][3] * matriz[4][4]) - (matriz[4][3] * matriz[3][4])))
                + ((-1 * matriz[2][3]) * ((matriz[3][1] * matriz[4][4]) - (matriz[4][1] * matriz[3][4])))
                + ((matriz[2][4]) * ((matriz[3][1] * matriz[4][3]) - (matriz[4][1] * matriz[3][3]))))) +
                ((-1 * matriz[1][1]) * (((matriz[2][0]) * ((matriz[3][3] * matriz[4][4]) - (matriz[4][3] * matriz[3][4])))
                        + ((-1 * matriz[2][3]) * ((matriz[3][0] * matriz[4][4]) - (matriz[4][0] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][0] * matriz[4][3]) - (matriz[4][0] * matriz[3][3]))))) +
                ((matriz[1][3]) * (((matriz[2][0]) * ((matriz[3][1] * matriz[4][4]) - (matriz[4][1] * matriz[3][4])))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * matriz[4][4]) - (matriz[4][0] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][0] * matriz[4][1]) - (matriz[4][0] * matriz[3][1]))))) +
                ((-1 * matriz[1][4]) * (((matriz[2][0]) * ((matriz[3][1] * matriz[4][3]) - (matriz[4][1] * matriz[3][3])))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * matriz[4][3]) - (matriz[4][0] * matriz[3][3])))
                        + ((matriz[2][3]) * ((matriz[3][0] * matriz[4][1]) - (matriz[4][0] * matriz[3][1])))));
        double semi3Det5x5 = semi3Det4x4 * mat02;
        double semi4Det4x4 = ((matriz[1][0]) * (((matriz[2][1]) * ((matriz[3][2] * matriz[4][4]) - (matriz[4][2] * matriz[3][4])))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * matriz[4][4]) - (matriz[4][1] * matriz[3][4])))
                + ((matriz[2][4]) * ((matriz[3][1] * matriz[4][2]) - (matriz[4][1] * matriz[3][2]))))) +
                ((-1 * matriz[1][1]) * (((matriz[2][0]) * ((matriz[3][2] * matriz[4][4]) - (matriz[4][2] * matriz[3][4])))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * matriz[4][4]) - (matriz[4][0] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][0] * matriz[4][2]) - (matriz[4][0] * matriz[3][2]))))) +
                ((matriz[1][2]) * (((matriz[2][0]) * ((matriz[3][1] * matriz[4][4]) - (matriz[4][1] * matriz[3][4])))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * matriz[4][4]) - (matriz[4][0] * matriz[3][4])))
                        + ((matriz[2][4]) * ((matriz[3][0] * matriz[4][1]) - (matriz[4][0] * matriz[3][1]))))) +
                ((-1 * matriz[1][4]) * (((matriz[2][0]) * ((matriz[3][1] * matriz[4][2]) - (matriz[4][1] * matriz[3][2])))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * matriz[4][2]) - (matriz[4][0] * matriz[3][2])))
                        + ((matriz[2][2]) * ((matriz[3][0] * matriz[4][1]) - (matriz[4][0] * matriz[3][1])))));
        double semi4Det5x5 = semi4Det4x4 * mat03;
        double semi5Det4x4 = ((matriz[1][0]) * (((matriz[2][1]) * ((matriz[3][2] * matriz[4][3]) - (matriz[4][2] * matriz[3][3])))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * matriz[4][3]) - (matriz[4][1] * matriz[3][3])))
                + ((matriz[2][3]) * ((matriz[3][1] * matriz[4][2]) - (matriz[4][1] * matriz[3][2]))))) +
                ((-1 * matriz[1][1]) * (((matriz[2][0]) * ((matriz[3][2] * matriz[4][3]) - (matriz[4][2] * matriz[3][3])))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * matriz[4][3]) - (matriz[4][0] * matriz[3][3])))
                        + ((matriz[2][3]) * ((matriz[3][0] * matriz[4][2]) - (matriz[4][0] * matriz[3][2]))))) +
                ((matriz[1][2]) * (((matriz[2][0]) * ((matriz[3][1] * matriz[4][3]) - (matriz[4][1] * matriz[3][3])))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * matriz[4][3]) - (matriz[4][0] * matriz[3][3])))
                        + ((matriz[2][3]) * ((matriz[3][0] * matriz[4][1]) - (matriz[4][0] * matriz[3][1]))))) +
                ((-1 * matriz[1][3]) * (((matriz[2][0]) * ((matriz[3][1] * matriz[4][2]) - (matriz[4][1] * matriz[3][2])))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * matriz[4][2]) - (matriz[4][0] * matriz[3][2])))
                        + ((matriz[2][2]) * ((matriz[3][0] * matriz[4][1]) - (matriz[4][0] * matriz[3][1])))));
        double semi5Det5x5 = semi5Det4x4 * mat04;
        det = semi1Det5x5 + semi2Det5x5 + semi3Det5x5 + semi4Det5x5 + semi5Det5x5;
        return det;
    }
    public static double determinante6x6(double[][] matriz){
        double det = 0;
        double semiDet16x6 = matriz[0][0];
        double semiDet26x6 = -1 * matriz[0][1];
        double semiDet36x6 = matriz[0][2];
        double semiDet46x6 = -1 * matriz[0][3];
        double semiDet56x6 = matriz[0][4];
        double semiDet66x6 = -1 * matriz[0][5];

        double det1 = ( (matriz[1][1] * ( (matriz[2][2] * ((matriz[3][3] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4])))))
                + ((-1 * matriz[2][3]) * ((matriz[3][2] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][2] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))))) )) +

                ((-1 * matriz[1][2]) * ( (matriz[2][1] * ((matriz[3][3] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][1] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][1] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))))) )) +

                (matriz[1][3] * ( (matriz[2][1] * ((matriz[3][2] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][1] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))))) )) +

                ((-1 * matriz[1][4]) * ( (matriz[2][1] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + (matriz[2][3] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][1] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                (matriz[3][3] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))))) )) +

                (matriz[1][5] * ( (matriz[2][1] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + (matriz[2][3] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                + ((-1 * matriz[2][4]) * ((matriz[3][1] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                (matriz[3][3] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))))) )) ) * semiDet16x6;

        double det2 = ((matriz[1][0] * ( (matriz[2][2] * ((matriz[3][3] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4])))))
                + ((-1 * matriz[2][3]) * ((matriz[3][2] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][2] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))))) )) +

                ((-1 * matriz[1][2]) * ( (matriz[2][0] * ((matriz[3][3] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4])))))
                        + ((-1 * matriz[2][3]) * ((matriz[3][0] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4])))))
                        + (matriz[2][4] * ((matriz[3][0] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))))) )) +

                (matriz[1][3] * ( (matriz[2][0] * ((matriz[3][2] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4])))))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4])))))
                        + (matriz[2][4] * ((matriz[3][0] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))))) )) +

                ((-1 * matriz[1][4]) * ( (matriz[2][0] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))))) )) +

                (matriz[1][5] * ( (matriz[2][0] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + ((-1 * matriz[2][4]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))))) )) ) * semiDet26x6;

        double det3 = ((matriz[1][0] * ( (matriz[2][1] * ((matriz[3][3] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4])))))
                + ((-1 * matriz[2][3]) * ((matriz[3][1] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][1] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][1] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))))) )) +

                ((-1 * matriz[1][1]) * ( (matriz[2][0] * ((matriz[3][3] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4])))))
                + ((-1 * matriz[2][3]) * ((matriz[3][0] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][0] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))))) )) +

                (matriz[1][3] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4])))))
                + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                ((-1 * matriz[1][4]) * ((matriz[2][0] * ((matriz[3][1] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                (matriz[3][3] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                (matriz[1][5] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                + ((-1 * matriz[2][4]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                (matriz[3][3] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) ) * semiDet36x6;

        double det4 = ((matriz[1][0] * ( (matriz[2][1] * ((matriz[3][2] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                ((-1 * matriz[3][4]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4])))))
                + (matriz[2][4] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][1] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))))) )) +

                ((-1 * matriz[1][1]) * ( (matriz[2][0] * ((matriz[3][2] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4])))))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4])))))
                        + (matriz[2][4] * ((matriz[3][0] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))))) )) +

                (matriz[1][2] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][4] * matriz[5][5]) - (matriz[5][4] * matriz[4][5]))) +
                        ((-1 * matriz[3][4]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4])))))
                        + (matriz[2][4] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                ((-1 * matriz[1][4]) * ((matriz[2][0] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + (matriz[2][2] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))) +
                        (matriz[3][2] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                (matriz[1][5] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + (matriz[2][2] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][4]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))) +
                        (matriz[3][2] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) ) * semiDet46x6;

        double det5 = ((matriz[1][0] * ( (matriz[2][1] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + (matriz[2][3] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                (matriz[3][5] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                + ((-1 * matriz[2][5]) * ((matriz[3][1] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                (matriz[3][3] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))))) )) +

                ((-1 * matriz[1][1]) * ( (matriz[2][0] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))))) )) +

                (matriz[1][2] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][5]) - (matriz[5][3] * matriz[4][5]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                ((-1 * matriz[1][3]) * ((matriz[2][0] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][5]) - (matriz[5][2] * matriz[4][5]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + (matriz[2][2] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][5]) - (matriz[5][1] * matriz[4][5]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][5]) - (matriz[5][0] * matriz[4][5]))) +
                        (matriz[3][5] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][5]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))) +
                        (matriz[3][2] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                (matriz[1][5] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + (matriz[2][2] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][3]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))) +
                        (matriz[3][2] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) ) * semiDet56x6;

        double det6 = ((matriz[1][0] * ( (matriz[2][1] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                + ((-1 * matriz[2][2]) * ((matriz[3][1] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                + (matriz[2][3] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                (matriz[3][4] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                + ((-1 * matriz[2][4]) * ((matriz[3][1] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                (matriz[3][3] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))))) )) +

                ((-1 * matriz[1][1]) * ( (matriz[2][0] * ((matriz[3][2] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3])))))
                        + ((-1 * matriz[2][2]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + ((-1 * matriz[2][4]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))))) )) +

                (matriz[1][2] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][3] * matriz[5][4]) - (matriz[5][3] * matriz[4][4]))) +
                        ((-1 * matriz[3][3]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3])))))
                        + (matriz[2][3] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][4]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                ((-1 * matriz[1][3]) * ((matriz[2][0] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][4]) - (matriz[5][2] * matriz[4][4]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + (matriz[2][2] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][4]) - (matriz[5][1] * matriz[4][4]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][4]) - (matriz[5][0] * matriz[4][4]))) +
                        (matriz[3][4] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][4]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))) +
                        (matriz[3][2] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) +

                (matriz[1][4] * ( (matriz[2][0] * ((matriz[3][1] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2])))))
                        + ((-1 * matriz[2][1]) * ((matriz[3][0] * ((matriz[4][2] * matriz[5][3]) - (matriz[5][2] * matriz[4][3]))) +
                        ((-1 * matriz[3][2]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2])))))
                        + (matriz[2][2] * ((matriz[3][0] * ((matriz[4][1] * matriz[5][3]) - (matriz[5][1] * matriz[4][3]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][3]) - (matriz[5][0] * matriz[4][3]))) +
                        (matriz[3][3] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1])))))
                        + ((-1 * matriz[2][3]) * ((matriz[3][0] * ((matriz[4][1] * matriz[5][2]) - (matriz[5][1] * matriz[4][2]))) +
                        ((-1 * matriz[3][1]) * ((matriz[4][0] * matriz[5][2]) - (matriz[5][0] * matriz[4][2]))) +
                        (matriz[3][2] * ((matriz[4][0] * matriz[5][1]) - (matriz[5][0] * matriz[4][1]))))) )) ) * semiDet66x6;
        det = det1 + det2 + det3 + det4 + det5 + det6;
        return det;
    }
}
