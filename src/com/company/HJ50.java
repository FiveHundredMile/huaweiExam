package com.company;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 输入一个表达式（用字符串表示），求这个表达式的值。
 * 保证字符串中的有效字符包括[‘0’-‘9’],‘+’,‘-’, ‘*’,‘/’ ,‘(’， ‘)’,‘[’, ‘]’,‘{’ ,‘}’。且表达式一定合法。
 */
public class HJ50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(getResult(input));
        }
    }

    public static int getResult(String input) {
        Pattern pattern = Pattern.compile("((?<![\\d)])-?\\d+(\\.\\d+)?|[+\\-*/()])");
        input = input.replaceAll("[{\\[]", "(").replaceAll("[}\\]]", ")");
        Matcher matcher = pattern.matcher(input);
        Stack<String> number = new Stack<>();
        Stack<String> operator = new Stack<>();
        operator.push("null");
        while (matcher.find()) {
            String temp = matcher.group();
            if (temp.matches("[()]")) {
                if ("(".equals(temp)) {
                    operator.push("(");
                } else {
                    String b = null;
                    while (!(b = operator.pop()).equals("(")) {
                        number.push(calculate(b, number.pop(), number.pop()));
                    }
                }
            } else if (temp.matches("[+\\-*/]")) {
                if (getPriority(temp) > getPriority(operator.peek())) {
                    operator.push(temp);
                } else {
                    while (getPriority(temp) <= getPriority(operator.peek())) {
                        number.push(calculate(operator.pop(), number.pop(), number.pop()));
                    }
                    operator.push(temp);
                }
            } else {
                number.push(temp);
            }
        }
        while (number.size() > 1) {
            number.push(calculate(operator.pop(), number.pop(), number.pop()));
        }
        return (int) Double.parseDouble(number.pop());
    }

    private static int getPriority(String b) {
        switch (b) {
            case "null":
                return 1;
            case "(":
                return 2;
            case "+":
            case "-":
                return 3;
            case "*":
            case "/":
                return 4;
        }
        return 0;
    }

    private static String calculate(String b, String a1, String a2) {
        double result = 0;
        double d1 = Double.parseDouble(a2);
        double d2 = Double.parseDouble(a1);
        switch (b) {
            case "+":
                result = d1 + d2;
                break;
            case "-":
                result = d1 - d2;
                break;
            case "*":
                result = d1 * d2;
                break;
            case "/":
                result = d1 / d2;
                break;
        }
        return result + "";
    }
}
