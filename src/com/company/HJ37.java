package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 描述
 * 有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
 *
 * 本题有多组数据。
 *
 * 输入描述：
 * 输入int型表示month
 *
 * 输出描述：
 * 输出兔子总数int型
 */
public class HJ37 {
    /**
     * 兔子类
     */
    static class Rabbit{
        private int age;

        public Rabbit(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int month = scanner.nextInt();
            ArrayList<Rabbit> farm = new ArrayList<>();
            farm.add(new Rabbit(0));

            for (int i = 0; i < month; i++) {
                int n = farm.size();
                for (int j = 0; j < n; j++) {
                    Rabbit rabbit = farm.get(j);
                    if (rabbit.getAge()>=2){
                        farm.add(new Rabbit(1));
                    }
                    rabbit.setAge(rabbit.age+1);

                }
            }
            int num = farm.size();
            System.out.println(num);
        }
    }
}
