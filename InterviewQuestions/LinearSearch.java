package com.My_Coding_Practice.InterviewQuestions;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,5,7,5,3,6};
        boolean flag = false;
        int find  = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==find){
                flag = true;
                break;
            }
        }


        if (flag){
            System.out.println("Element Found in the array");
        }
        else {
            System.out.println("Element not present in the array");
        }
    }
}
