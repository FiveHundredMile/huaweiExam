package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 *
 * 输入描述：
 * 输入一个正浮点数值
 *
 * 输出描述：
 * 输出该数值的近似整数值
 */
public class HJ7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double val = in.nextDouble();
        BigDecimal bVal = BigDecimal.valueOf(val);
        int bigDecimal = Integer.parseInt(String.valueOf(bVal.setScale(0, BigDecimal.ROUND_HALF_UP)));
        System.out.println(bigDecimal);
    }
}
