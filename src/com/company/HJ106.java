package com.company;

import java.util.Scanner;

/**
 * 描述
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 */
public class HJ106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuffer sb = new StringBuffer(input);
        System.out.println(sb.reverse());
    }
}
