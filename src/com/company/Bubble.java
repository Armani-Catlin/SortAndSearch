package com.company;

import java.util.ArrayList;

public class Bubble {
    static void bubbleGet(ArrayList<Integer> arr[]) {
        int len = arr.size;
        int flow = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (arr(j - 1) > arr[j]) {
                    flow = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = flow;
                }

            }
        }
    }
}
