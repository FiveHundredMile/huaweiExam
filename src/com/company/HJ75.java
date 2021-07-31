package com.company;

import java.util.Scanner;

/**
 * 描述
 * 给定两个只包含小写字母的字符串，计算两个字符串的最大公共子串的长度。
 * 注：子串的定义指一个字符串删掉其部分前缀和后缀（也可以不删）后形成的字符串。
 * 输入描述：
 * 输入两个只包含小写字母的字符串
 * <p>
 * 输出描述：
 * 输出一个整数，代表最大公共子串的长度
 */
public class HJ75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.print(getSum(a, b));
        }
    }

    public static int getSum(String a, String b) {
        int maxLength = 0;
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String subStr = b.substring(j, i);
                if (a.indexOf((subStr)) != -1) {
                    int tempLength = subStr.length();
                    maxLength = tempLength > maxLength ? tempLength : maxLength;
                }
            }
        }
        return maxLength;
    }
}
