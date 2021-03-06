package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 描述
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * <p>
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * <p>
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。s
 * <p>
 * 输入n，请输出n以内(含n)完全数的个数。计算范围, 0 < n <= 500000
 * <p>
 * <p>
 * 本题输入含有多组样例。
 */
public class HJ56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int num = in.nextInt();
            System.out.println(calPerfectNum(num));
        }
    }

    private static int calPerfectNum(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
//            ArrayList<Integer> perfectNumList = new ArrayList<>();
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != i) {
//                    perfectNumList.add(j);
                    sum+=j;
                }
            }
//            int total = perfectNumList.stream().reduce(Integer::sum).orElse(0);
            if (sum == i) {
                count++;
            }
        }
        return count;
    }
}
