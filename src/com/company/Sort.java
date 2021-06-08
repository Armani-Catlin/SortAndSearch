package com.company;

public class Sort {
    public Sort() {
    }

    public static void order(int[] arr) {
        int len = arr.length;

        for(int i = 0; i < len - 1; ++i) {
            int low = i;

            int j;
            for(j = i + 1; j < len; ++j) {
                if (arr[j] < arr[low]) {
                    low = j;
                }
            }

            j = arr[low];
            arr[low] = arr[i];
            arr[i] = j;
        }
    }
}