/**
 * @(#)Main.java, 5月 02, 2022.
 * <p>
 * Copyright 2022 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.noodles.web;

/**
 * @author huchangbin
 */
public class Main {
    public static void main(String[] args) {
        double res = forDivision(3 ,5);
        System.out.println(res);
    }
    public static double forDivision(double a,double b){
        double res = a / b;
        if(b == 0){
            System.out.println("制造git Rebase合并冲突");
            throw new ArithmeticException("除数8888不能为零");
        }
        return res;
    }
    public static double forSum(double a, double b){
        return a+b;
    }

    public static double forMultiplication(int a, int b){
        return a*b;
    }
}