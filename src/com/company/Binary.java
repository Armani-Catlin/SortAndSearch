package com.company;

public class Binary {
    int binaryGet(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binaryGet(arr, l, mid - 1, x);
            }
            return binaryGet(arr, mid + 1, r, x);
        }
        return -1;
    }
}