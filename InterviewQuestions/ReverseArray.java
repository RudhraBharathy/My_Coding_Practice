package com.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 4};
        arr = reversedArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reversedArray(int[] nonrevarr) {
        int i=0,j=nonrevarr.length-1;
        while (i!=j){
            int temp = nonrevarr[i];
            nonrevarr[i] = nonrevarr[j];
            nonrevarr[j] = temp;
            i++;
            j--;
        }

        return nonrevarr;
    }
}
