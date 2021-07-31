package com.company;

import java.util.Scanner;

/**
 * 描述
 * 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
 * <p>
 * 本题含有多组样例输入。
 */
public class HJ86 {

    // 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            System.out.println(getMax(a));
        }
    }

    private static int getMax(int a) {
        int max = 0;
        String binaryString = Integer.toBinaryString(a);
        int tempCount = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                tempCount++;
                if (tempCount > max) {
                    max = tempCount;
                }
            }else {
                tempCount=0;
            }
        }
        return max;
    }
}
