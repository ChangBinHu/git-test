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
        return res;
    }
}