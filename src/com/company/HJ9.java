package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 描述
 * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 *
 * 数据范围：
 * 输入描述：
 * 输入一个int型整数
 *
 * 输出描述：
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 *
 * 示例1
 * 输入：
 * 9876673
 * 输出：
 * 37689
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuffer sb = new StringBuffer(line).reverse();
        String[] split = sb.toString().split("");
        Set<String> set = new HashSet<>();
        for (String s : split) {
            if(set.add(s)){
                System.out.print(s);
            }
        }
    }
}
