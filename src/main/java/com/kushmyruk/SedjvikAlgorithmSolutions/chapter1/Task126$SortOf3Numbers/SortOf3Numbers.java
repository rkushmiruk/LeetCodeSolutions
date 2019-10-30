package com.kushmyruk.SedjvikAlgorithmSolutions.chapter1.Task126$SortOf3Numbers;

public class SortOf3Numbers {

    public double[] sort3Numbers(double a, double b, double c) {
        double t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        return new double[]{a, b, c};
    }


//    private double swap(double a, double c) {
//    }
}
