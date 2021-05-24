package com.company;

public class Search {
    public static int findNum(int[] arr, int O){
        for (int j : arr) {
            if (j == (O)) {
                return j;
            }
        }
        return -1;
    }
}
