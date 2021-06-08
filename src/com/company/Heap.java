package com.company;

public class Heap {
    public Heap(){
    }

    static void heapGet(int arr[]) {
        int len = arr.length;

        for (int i = len / 2 - 1; i >= 0; i--)
            morph(arr, len, i);

        for (int i = len - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            morph(arr, i, 0);
        }
    }

    static void morph(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            morph(arr, n, largest);
        }
    }
}