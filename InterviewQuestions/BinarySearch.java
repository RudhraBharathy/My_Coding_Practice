package com.My_Coding_Practice.InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,5,7,5,3,6};
        Arrays.sort(arr);
        int find = 10;
        int firstVal = 0;
        int lastVal = arr.length-1;
        int finalVal = binarySearch(arr,firstVal,lastVal,find);
        if (finalVal==1){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int firstVal, int lastVal, int find) {
        while (firstVal<=lastVal){
            int mid = (firstVal+lastVal)/2;
            if (find<arr[mid]){
                lastVal = mid - 1;
            }
            if (find>arr[mid]){
                firstVal = mid + 1;
            }
            if (find==arr[mid]){
                return 1;
            }
        }
        return 0;
    }
}
