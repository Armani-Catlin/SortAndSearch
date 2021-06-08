package com.company;

public class Search {
    public Search() {
    }

    public static int findNum(int[] arr, int O) {
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int j = var2[var4];
            if (j == O) {
                return j;
            }
        }
        return -1;
    }
}