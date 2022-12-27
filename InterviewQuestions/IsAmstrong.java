package com.InterviewQuestions;

import java.util.Scanner;

public class IsAmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        boolean finalval = isAmstrong(userInput);
        System.out.println(finalval);
    }
    public static boolean isAmstrong(int input) {
        int original=input,temp = 0;
        while (input > 0){
            int lastVal =input % 10;
            temp += lastVal*lastVal*lastVal;
            input/=10;
        }
        return temp == original;
    }
}
