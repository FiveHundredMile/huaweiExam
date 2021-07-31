package com.company;

import java.util.Scanner;

/**
 * 描述
 * 找出给定字符串中大写字符(即'A'-'Z')的个数。
 * <p>
 * 输入描述：
 * 本题含有多组样例输入
 * 对于每组样例，输入一行，代表待统计的字符串
 * <p>
 * 输出描述：
 * 对于每组样例，输出一个整数，代表字符串中大写字母的个数
 */
public class HJ84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String s = in.nextLine();
            System.out.println(getUpperCaseCount(s));
        }
    }

    private static int getUpperCaseCount(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                count++;
            }
        }
        return count;
    }
}
