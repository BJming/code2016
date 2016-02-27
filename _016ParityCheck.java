package com.mingrisoft_016;

import java.util.Scanner;

/**
 * Created by bjming on 16-2-27.
 */
public class _016ParityCheck {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        long number=scanner.nextLong();
        String check=(number%2==0)?"这个数字是：偶数":"这个数字是：奇数";
        System.out.println(check);
    }
}
