package com.company;

public class Binary {
    public Binary() {
    }

    static int binaryGet(int[] arr, int stand1, int stand2, int stand3) {
        if (stand2 >= stand1) {
            int middle = stand1 + (stand2 - stand1) / 2;
            if (arr[middle] == stand3) {
                return middle;
            } else {
                return arr[middle] > stand3 ? binaryGet(arr, stand1, middle - 1, stand3) : binaryGet(arr, middle + 1, stand2, stand3);
            }
        } else {
            return -1;
        }
    }
}