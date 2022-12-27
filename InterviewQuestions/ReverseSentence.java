package com.InterviewQuestions;

public class ReverseSentence {
    public static void main(String[] args) {
        String str = " I am a software engineer ".trim();
        String[] updatedStr = str.split(" ");
        for (int i = updatedStr.length-1; i >= 0; i--) {
            System.out.println(updatedStr[i]);
        }
    }
}
