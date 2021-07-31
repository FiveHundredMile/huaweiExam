package com.company;

import java.util.Scanner;

/**
 * 描述
 * 请计算n*m的棋盘格子（n为横向的格子数，m为竖向的格子数）沿着各自边缘线从左上角走到右下角，总共有多少种走法，要求不能走回头路，即：只能往右和往下走，不能往左和往上走。
 */
public class HJ91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(getCount(m, n));
        }
    }

    private static int getCount(int m, int n) {
        if (m == 0 || n == 0) return 1;
        return getCount(m, n - 1) + getCount(m - 1, n);
    }
}
