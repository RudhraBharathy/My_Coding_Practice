package com.My_Coding_Practice.InterviewQuestions;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int val = input.nextInt(),a = 0,b = 1;
        for (int i = 0;i < val;i++){
            int c = a+b;
            a = b;
            b = c;
        }


        System.out.println(a);
    }
}
