package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 描述
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 * 输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
 * 本题含有多组输入数据。
 * 输入描述：
 * 输入一个int整数
 * 输出描述：
 * 输出分解后的string
 * 示例1
 * 输入：
 * 6
 * 输出：
 * 31+33+35+37+39+41
 */
public class HJ76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            getResult(num);
        }

    }

    private static void getResult(int num) {
        int result = num*num*num;
        for (int i = 1; i < result; i+=2) {
            int temTotal = 0;
            ArrayList<Integer> expresstions = new ArrayList<>();
            for(int j=i;j<i+num*2;j+=2){
                temTotal+=j;
                expresstions.add(j);
            }
            if (result == temTotal){
//                String finalResult = expresstions.stream().map(Objects::toString).collect(Collectors.joining("+"));
                String finalResult = String.join("+", expresstions.stream().map(Objects::toString).collect(Collectors.toList()));
                System.out.println(finalResult);
                break;
            }
        }
    }

}
