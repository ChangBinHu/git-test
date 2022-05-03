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
            System.out.println("和git rebase修改同一个内容");
            throw new ArithmeticException("除数不能为零");
        }
        return res;
    }
    public static double forSum(double a, double b){
        return a+b;
    }
}