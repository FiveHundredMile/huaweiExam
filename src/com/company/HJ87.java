package com.company;

import java.util.Scanner;

/**
 * 描述
 * 密码按如下规则进行计分，并根据不同的得分为密码进行安全等级划分。
 * <p>
 * 一、密码长度:
 * <p>
 * 5 分: 小于等于4 个字符
 * <p>
 * 10 分: 5 到7 字符
 * <p>
 * 25 分: 大于等于8 个字符
 * <p>
 * 二、字母:
 * <p>
 * 0 分: 没有字母
 * <p>
 * 10 分: 全都是小（大）写字母
 * <p>
 * 20 分: 大小写混合字母
 * <p>
 * 三、数字:
 * <p>
 * 0 分: 没有数字
 * <p>
 * 10 分: 1 个数字
 * <p>
 * 20 分: 大于1 个数字
 * <p>
 * 四、符号:
 * <p>
 * 0 分: 没有符号
 * <p>
 * 10 分: 1 个符号
 * <p>
 * 25 分: 大于1 个符号
 * <p>
 * 五、奖励:
 * <p>
 * 2 分: 字母和数字
 * <p>
 * 3 分: 字母、数字和符号
 * <p>
 * 5 分: 大小写字母、数字和符号
 * <p>
 * 最后的评分标准:
 * <p>
 * >= 90: 非常安全
 * <p>
 * >= 80: 安全（Secure）
 * <p>
 * >= 70: 非常强
 * <p>
 * >= 60: 强（Strong）
 * <p>
 * >= 50: 一般（Average）
 * <p>
 * >= 25: 弱（Weak）
 * <p>
 * >= 0:  非常弱
 * <p>
 * <p>
 * 对应输出为：
 * <p>
 * VERY_SECURE
 * <p>
 * SECURE,
 * <p>
 * VERY_STRONG,
 * <p>
 * STRONG,
 * <p>
 * AVERAGE,
 * <p>
 * WEAK,
 * <p>
 * VERY_WEAK,
 * <p>
 * <p>
 * 请根据输入的密码字符串，进行安全评定。
 * <p>
 * 注：
 * <p>
 * 字母：a-z, A-Z
 * <p>
 * 数字：-9
 * <p>
 * 符号包含如下： (ASCII码表可以在UltraEdit的菜单view->ASCII Table查看)
 * <p>
 * !"#$%&'()*+,-./     (ASCII码：x21~0x2F)
 * <p>
 * :;<=>?@             (ASCII<=><=><=><=><=>码：x3A~0x40)
 * <p>
 * [\]^_`              (ASCII码：x5B~0x60)
 * <p>
 * {|}~                (ASCII码：x7B~0x7E)
 */
public class HJ87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            printLevel(s);
        }
    }

    private static void printLevel(String s) {
        int[] arr = new int[5];
        // 1.长度
        if (s.length() <= 4) {
            arr[0] = 5;
        } else if(5<= s.length() && s.length()<=7) {
            arr[0] = 10;
        } else{
            arr[0] = 25;
        }
        // 2.字母
        int lowerCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        for(int i = 0; i< s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCount++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lowerCount++;
            }else if (Character.isDigit(s.charAt(i))) {
                digitCount++;
            } else{   // 这里包括了字符串中可能存在的空格
                symbolCount++;
            }
        }
        if(lowerCount == 0 && upperCount == 0) {
            arr[1] = 0;
        } else if (lowerCount !=0 && upperCount != 0) {
            arr[1] = 20;
        } else if (lowerCount != 0 || upperCount != 0) {
            arr[1] = 10;
        }
        // 3.数字
        if (digitCount == 0) {
            arr[2] = 0;
        } else if (digitCount == 1) {
            arr[2] = 10;
        } else if (digitCount > 1) {
            arr[2] = 20;
        }
        // 4.符号
        if (symbolCount == 0) {
            arr[3] = 0;
        } else if (symbolCount == 1) {
            arr[3] = 10;
        } else if (symbolCount > 1) {
            arr[3] = 25;
        }
        // 5.奖励
        if ((lowerCount+upperCount) > 0 && digitCount > 0 && symbolCount == 0) {
            arr[4] = 2;
        }else if (lowerCount>0 && upperCount > 0 && digitCount > 0 && symbolCount > 0) {
            arr[4] = 5;
        } else if ((lowerCount+upperCount) > 0 && digitCount > 0 && symbolCount > 0) {
            arr[4] = 3;
        }
        int totalCount = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        if (totalCount >= 90) System.out.println("VERY_SECURE");
        if (totalCount >= 80 && totalCount < 90) System.out.println("SECURE");
        if (totalCount >= 70 && totalCount < 80) System.out.println("VERY_STRONG");
        if (totalCount >= 60 && totalCount < 70) System.out.println("STRONG");
        if (totalCount >= 50 && totalCount < 60) System.out.println("AVERAGE");

        if (totalCount >= 25 && totalCount < 50) System.out.println("WEAK");
        if (totalCount >= 0 && totalCount < 25) System.out.println("VERY_WEAK");
    }
}
