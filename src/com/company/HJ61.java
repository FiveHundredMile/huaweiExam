package com.company;

import java.util.Scanner;

/**
 * 描述
 * 题目描述
 * <p>
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 * <p>
 * 数据范围：0<=m<=10，1<=n<=10。
 * 本题含有多组样例输入。
 * <p>
 * <p>
 * 输入描述：
 * 输入两个int整数
 * <p>
 * 输出描述：
 * 输出结果，int型
 */
public class HJ61 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int apple = in.nextInt();
            int dish = in.nextInt();
            System.out.println(func(apple,dish));
        }

    }

    private static int func(int m, int n) {
        if (m < 1 || n <= 1) {
            return 1;
        }
        // 盘子数大于苹果数，转化为m个苹果放入m个盘子中
        if (m < n) {
            return func(m, m);
        } else {
            return func(m, n - 1) + func(m - n, n);
        }
    }
}
