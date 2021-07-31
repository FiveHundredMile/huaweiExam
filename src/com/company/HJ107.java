package com.company;

import java.util.Scanner;

public class HJ107 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double res = getCubeRoot(sc.nextDouble());
            System.out.printf("%.1f",res);
        }

    }

    private static double getCubeRoot(double num) {
        //负数的情况
        if(num<0)
            return -1 * getCubeRoot(-num);

        if(num == 0 || num==1)
            return num;

        //分y大于1和y小于1两种情况，只是区间改变，算法一致
        double min = num>1?1:0;
        double max = num>1?num:1;

        while(max-min>0.001) {
            double mid =  (max+min)/2;
            if(mid*mid*mid==num)
                return mid;
            else if(mid*mid*mid > num) {
                max = mid;
            }else {
                min = mid;
            }
        }
        return max;
    }

}