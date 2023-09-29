package com.My_Coding_Practice.InterviewQuestions;

public class RevInt {
    public static void main(String[] args) {
        int val = 123;
        int y = 0;
        int temp;
        while(val>0){
            temp = val%10;
            y  = y * 10 + temp;
            val = val/10;
        }
        System.out.println(y);
    }
}
