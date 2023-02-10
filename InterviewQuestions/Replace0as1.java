package com.My_Coding_Practice.InterviewQuestions;

public class Replace0as1 {
    public static void main(String[] args) {
        int x = 1003400500;
        String st ="";
        String y = Integer.toString(x);
        for (int i = 0; i < y.length(); i++) {
            if(y.charAt(i)=='0'){
                 st += "1";
            }
            else {
                st += y.charAt(i);
            }
        }
        System.out.println(st);
    }
}
