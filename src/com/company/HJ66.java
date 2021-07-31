package com.company;

import java.util.Scanner;

/**
 * 描述
 * 有6条配置命令，它们执行的结果分别是：
 * <p>
 * 命   令	执   行
 * reset	reset what
 * reset board	board fault
 * board add	where to add
 * board delete	no board at all
 * reboot backplane	impossible
 * backplane abort	install first
 * he he	unknown command
 * 注意：he he不是命令。
 * <p>
 * 为了简化输入，方便用户，以“最短唯一匹配原则”匹配：
 * 1、若只输入一字串，则只匹配一个关键字的命令行。例如输入：r，根据该规则，匹配命令reset，执行结果为：reset what；输入：res，根据该规则，匹配命令reset，执行结果为：reset what；
 * 2、若只输入一字串，但本条命令有两个关键字，则匹配失败。例如输入：reb，可以找到命令reboot backpalne，但是该命令有两个关键词，所有匹配失败，执行结果为：unknown command
 * 3、若输入两字串，则先匹配第一关键字，如果有匹配但不唯一，继续匹配第二关键字，如果仍不唯一，匹配失败。例如输入：r b，找到匹配命令reset board 和 reboot backplane，执行结果为：unknown command。
 * <p>
 * 4、若输入两字串，则先匹配第一关键字，如果有匹配但不唯一，继续匹配第二关键字，如果唯一，匹配成功。例如输入：b a，无法确定是命令board add还是backplane abort，匹配失败。
 * 5、若输入两字串，第一关键字匹配成功，则匹配第二关键字，若无匹配，失败。例如输入：bo a，确定是命令board add，匹配成功。
 * 6、若匹配失败，打印“unknown command”
 */
public class HJ66{
    static String[] command = {"reset", "reset board", "board add", "board delete", "reboot backplane", "backplane abort"};
    static String[] operation = {"reset what", "board fault", "where to add", "no board at all", "impossible", "install first", "unknown command"};

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int index;
        while(sc.hasNext()){
            // store the index of match
            int match = 0;
            // marke whether find&nbs***bsp;not
            boolean flag = false;
            String[] line = sc.nextLine().split(" ");
            // only 1 key word
            if(line.length == 1){
                index = command[0].indexOf(line[0]);
                if(index == 0){
                    flag = true;
                    match = 0;
                }
                else{
                    flag = false;
                }
            }
            // only 2 key word
            else if(line.length == 2){
                String left = line[0];
                String right = line[1];
                for(int i = 1; i < command.length; i++){
                    String[] spcommand = command[i].split(" ");
                    index = spcommand[0].indexOf(left);
                    // if keyword 1 mismatch
                    if(index != 0){
                        continue;
                    }
                    index = spcommand[1].indexOf(right);
                    // if keyword 2 mismatch
                    if(index != 0){
                        continue;
                    }
                    // if multiple matches
                    if(!flag){
                        flag = true;
                    }
                    else{
                        match = -1;
                        break;
                    }
                    match = i;

                }

            }
            // print out result
            if(flag && match >= 0){
                System.out.println(operation[match]);
            }
            else{
                System.out.println(operation[operation.length - 1]);
            }

        }

    }
}