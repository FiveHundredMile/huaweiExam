package com.company;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ASCII码范围内(0~127，包括0和127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
 * 输入描述：
 * 输入一行没有空格的字符串。
 *
 * 输出描述：
 * 输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
 *
 * 示例1
 * 输入：
 * abc
 * 复制
 * 输出：
 * 3
 */
public class HJ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String input= in.nextLine();
            System.out.println(getCount(input));
        }
    }

    private static int getCount(String input) {
        char[] chars = input.toCharArray();
        HashSet<Character> chSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            chSet.add(chars[i]);
        }
        return chSet.size();
    }
}
