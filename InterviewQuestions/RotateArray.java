package com.My_Coding_Practice.InterviewQuestions;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int x = 5;//O(x*n)
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < x; i++) {
            int fVal = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = fVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
