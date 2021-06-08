package com.company;

public class Insertion {
    public Insertion() {
    }

    public static void insertionGet(int[] arr) {
        int len = arr.length;

        for(int j = 1; j < len; ++j) {
            int mark = arr[j];

            int i;
            for(i = j - 1; i > -1 && arr[i] > mark; --i) {
                arr[i + 1] = arr[i];
            }

            arr[i + 1] = mark;
        }

    }
}