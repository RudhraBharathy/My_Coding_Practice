package com.InterviewQuestions;

public class GreatestOfThreeNums {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 90;
        int num3 = 80;
        if (num1 > num2 && num1 > num3){
            System.out.println("1 is greatest");
        } else if (num2>num3) {
            System.out.println("2 is greatest");
        }
        else {
            System.out.println("3 is greatest");
        }
    }
}
