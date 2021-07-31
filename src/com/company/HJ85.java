package com.company;

import java.util.Scanner;

/**
 * 描述
 * 给定一个仅包含小写字母的字符串，求它的最长回文子串的长度。
 * 所谓回文串，指左右对称的字符串。
 * 所谓子串，指一个字符串删掉其部分前缀和后缀（也可以不删）的字符串
 * （注意：记得加上while处理多个测试用例）
 *
 * 输入描述：
 * 输入一个仅包含小写字母的字符串
 *
 * 输出描述：
 * 返回最长回文子串的长度
 */
public class HJ85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String s = in.nextLine();
            System.out.println(getMaxChildStr(s));
        }
    }

    private static int getMaxChildStr(String s) {
        char []chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            
        }
        return 0;
    }
}
