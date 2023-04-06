package com.InterviewQuestions;

public class SmallestOfThreeNums {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 90;
        int num3 = 80;
        if (num1 < num2 && num1 < num3){
            System.out.println("1 is smallest");
        } else if (num2<num3) {
            System.out.println("2 is smallest");
        }
        else {
            System.out.println("3 is smallest");
        }

    }
}
