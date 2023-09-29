package com.My_Coding_Practice.InterviewQuestions;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        boolean finalval = isPrime(userInput);
        System.out.println(finalval);
    }

    public static boolean isPrime(int input) {
        if (input<=1){
            return false;
        }
        int x = 2;
        while (x * x <= input){
            if (input % x == 0){
                return false;
            }
            x++;
        }

        return x * x > input ;
    }
}
