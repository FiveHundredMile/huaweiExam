package com.company;

import java.util.Scanner;

/**
 * 描述
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * 详细描述：
 * 接口说明
 * 原型：
 * int GetResult(vector &list)
 * 输入参数：
 *         无
 * 输出参数（指针指向的内存区域保证有效）：
 *     list  鸡翁、鸡母、鸡雏组合的列表
 * 返回值：
 *      -1 失败
 *      0 成功
 */
public class HJ72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        getResult();
    }

    private static void getResult() {
        int x=0,y=0,z=0;

    }
}
