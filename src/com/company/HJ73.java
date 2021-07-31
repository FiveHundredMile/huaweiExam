package com.company;

import java.util.Scanner;

/**
 * 描述
 * 根据输入的日期，计算是这一年的第几天。
 * <p>
 * <p>
 * 输入描述：
 * 输入一行，每行空格分割，分别是年，月，日
 * <p>
 * 输出描述：
 * 输出是这一年的第几天
 */
public class HJ73 {
    // 平年
    private static int[] aArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    // 闰年
    private static int[] bArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int dayCount = 0;
        // 判断平年闰年
        if(isRunYear(year)){
            for (int i = 0; i < month-1; i++) {
                dayCount+=bArr[i];
            }
        }else {
            for (int i = 0; i < month-1; i++) {
                dayCount+=aArr[i];
            }
        }
        dayCount+=day;
        System.out.println(dayCount);
    }

    private static boolean isRunYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
