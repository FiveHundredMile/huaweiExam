package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 描述
 * 给定n个字符串，请对n个字符串按照字典序排列。
 * 输入描述：
 * 输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
 * 输出描述：
 * 数据输出n行，输出结果为按照字典序排列的字符串。
 * 示例1
 * 输入：
 * 9
 * cap
 * to
 * cat
 * card
 * two
 * too
 * up
 * boat
 * boot
 * 复制
 * 输出：
 * boat
 * boot
 * cap
 * card
 * cat
 * to
 * too
 * two
 * up
 */
public class HJ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            ArrayList<String> strList = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                strList.add(in.next());
            }
            sortList(strList);
    }

    private static void sortList(ArrayList<String> arrayList) {
        ArrayList<String> resultList = (ArrayList<String>) arrayList.stream().sorted().collect(Collectors.toList());
        for (String str :
                resultList) {
            System.out.println(str);
        }
    }
}
