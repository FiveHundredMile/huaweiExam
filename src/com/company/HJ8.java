package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 提示:
 * 0 <= index <= 11111111
 * 1 <= value <= 100000
 * <p>
 * 输入描述：
 * 先输入键值对的个数n（1 <= n <= 500）
 * 然后输入成对的index和value值，以空格隔开
 * <p>
 * 输出描述：
 * 输出合并后的键值对（多行）
 */
public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int num = Integer.parseInt(line);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            String s = scanner.nextLine();
            int key = Integer.parseInt(s.split(" ")[0]);
            int value = Integer.parseInt(s.split(" ")[1]);
            if(map.containsKey(key)){
                int newValue = map.get(key) + value;
                map.put(key,newValue);
            }else {
                map.put(key,value);
            }
        }
        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
    }
}
