package com.kushmyruk.CodeWarsSolutions.level8ku;

/**
 * Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ().
 */
public class ExpressionsMatter {

    //My decision
    public static int expressionsMatter(int a, int b, int c) {
        String x = "   ";
        x.replace(" ", "");
        if (a == 1 && c == 1) {
            return a + b + c;
        }

        int d1 = a * (b + c);
        int d2 = a * b * c;
        int d3 = a + b * c;
        int d4 = (a + b) * c;

        int d5 = d1 > d2 ? d1 : d2;
        int d6 = d3 > d4 ? d3 : d4;

        return d5 > d6 ? d5 : d6;
    }

//    public static int expressionsMatter(int a, int b, int c) {
//        return Math.max(Math.max(a + b + c, a * b * c), Math.max((a + b) * c, a * (b + c)));
//    }

}
