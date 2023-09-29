package com.My_Coding_Practice.InterviewQuestions;

public class Swappingnumbers {
    public static void main(String[] args) {
        int a = 10,b = 20;
        swap(a,b);

    }

    static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
