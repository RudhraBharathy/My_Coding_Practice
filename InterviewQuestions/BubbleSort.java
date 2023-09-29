package com.My_Coding_Practice.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] arr1 = new int[x];
        for (int k = 0; k < arr1.length; k++) {
            arr1[k] = in.nextInt();
        }
        BubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] BubbleSort(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 1; j < arr1.length - i; j++) {
                if (arr1[j]<arr1[j-1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j-1];
                    arr1[j-1] = temp;
                }
            }
        }

        return arr1;
    }
}
