package com.company;

public class Bubble {
    public Bubble() {
    }

    static void bubbleGet(int[] arr) {
        int len = arr.length;
        int flow;

        for(int i = 0; i < len; ++i) {
            for(int j = 1; j < len - i; ++j) {
                if (arr[j - 1] > arr[j]) {
                    flow = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = flow;
                }
            }
        }

    }
}