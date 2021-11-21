package com.company;

import java.util.Locale;
import java.util.Scanner;

/**
 * 描述
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 *
 * 数据范围：  ，输入的数据有可能包含大小写字母、数字和空格
 * 输入描述：
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述：
 * 输出输入字符串中含有该字符的个数。（不区分大小写字母）
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String letter = scanner.next();
        String sTemp = s.toLowerCase(Locale.ROOT);
        String[] sArray = sTemp.split("");
        int count = 0;
        for (int i=0;i<sArray.length;i++){
            if(sArray[i].equals(letter))
                count ++;
        }
        System.out.println(count);
    }
}
