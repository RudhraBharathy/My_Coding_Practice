package com.My_Coding_Practice.InterviewQuestions;


import java.util.Arrays;
import java.util.List;

public class isSorted {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,2,7,23,686);
        boolean finalVal = isArraySorted(ls,ls.size());
        System.out.println(finalVal ? "Array is Sorted" : "Array is not Sorted");
    }

    private static boolean isArraySorted(List<Integer> ls, int size) {
        boolean flag = false;
        for (int i = 0; i < size-1; i++) {
            if (ls.get(i)<ls.get(i+1)){
                flag = true;
            }
            else{
                flag = false;
                break;
            }
        }
        return flag;
    }
}
