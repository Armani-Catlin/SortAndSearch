package com.company;

import java.util.ArrayList;

public class Binary {
    int binaryGet(ArrayList<Integer> arr[], int stand1, int stand2, int stand3) {
        if (stand2 >= stand1) {
            int middle = stand1 + (stand2 - stand1) / 2;
            if (arr[middle] = stand3) {
                return middle;
            }
            if (arr[middle] > stand3) {
                return binaryGet(arr, stand1, middle - 1, stand3);
            }
            return binaryGet(arr, middle + 1, stand2, stand3);
        }
        return -1;
    }
}