package com.company;

import java.util.Scanner;

/**
 * 描述
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * 输入描述：
 *  输入一个整数（int类型）
 * 输出描述：
 *  这个数转换成2进制后，输出1的个数
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String binaryString = Integer.toBinaryString(input);
        String[] sArr = binaryString.split("");
        int count = 0;
        for (String i :
                sArr) {
            if("1".equals(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
