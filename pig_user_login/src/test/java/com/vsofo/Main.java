package com.vsofo;

import java.util.Scanner;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 14:35
 * @description 测试用例
 */
public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String inputString = scanner.nextLine();
        // String[] s = inputString.split(" ");
        // System.out.println(s[s.length-1].length());

        Scanner scanner_01 = new Scanner(System.in);
        String s1 = scanner_01.nextLine();
        Scanner scanner_02 = new Scanner(System.in);
        String s2 = scanner_02.next();
        int num = 0;
        char[] chars = s1.toCharArray();
        for (char c : chars) {
            if ((c+"").equals(s2+"")){
                num++;
            }
        }
        System.out.println(num);
    }
}
