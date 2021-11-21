package com.company;

import java.util.Scanner;

/**
 * 描述
 * •连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 * 输入描述：
 * 连续输入字符串(输入多次,每个字符串长度小于等于100)
 *
 * 输出描述：
 * 依次输出所有分割后的长度为8的新字符串
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.length()<8){
                StringBuffer sb = new StringBuffer(line);
                while (sb.length()<8){
                    sb.append("0");
                }
                System.out.println(sb);
            }else if(line.length() > 8){
                StringBuffer sb = new StringBuffer(line);
                while (sb.length() >8){
                    String tempStr = sb.substring(0,8);
                    System.out.println(tempStr);
                    sb.delete(0,8);
                }
                while (sb.length() < 8){
                    sb.append("0");
                }
                System.out.println(sb);
            }else {
                System.out.println(line);
            }
        }
    }
}
