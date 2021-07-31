package com.company;

import java.util.Scanner;

/**
 * 功能:等差数列 2，5，8，11，14。。。。
 *
 * 输入:正整数N >0
 *
 * 输出:求等差数列前N项和
 *
 * 本题为多组输入，请使用while(cin>>)等形式读取数据
 */
public class HJ100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            System.out.println(getSum(a));
        }
    }

    /**
     * 等差数列求和公式Sn = n(a1+an)/2 = na1+n*(n-1)/2*dim
     * @param a
     * @return
     */
    private static int getSum(int a) {
        int dim = 3;
        int sum = a*2+a*(a-1)/2*dim;
        return sum;
    }
}
