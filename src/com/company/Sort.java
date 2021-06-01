package com.company;

public class Sort {
    void order(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int low = i;
            for (int j = i + 1; j < len; j++)
                if (arr[j] < arr[low]) {
                    low = j;
                }
            int flow = arr[low];
            arr[low] = arr[i];
            arr[i] = flow;
        }
    }
}