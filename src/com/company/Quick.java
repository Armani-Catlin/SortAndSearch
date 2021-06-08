package com.company;

public class Quick {
    static int divide(int array[], int low, int high) {
        int pivot = array[high];

        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return (i + 1);
    }

    static void quickGet(int array[], int low, int high) {
        if (low < high) {
            int pi = divide(array, low, high);
            quickGet(array, low, pi - 1);
            quickGet(array, pi + 1, high);
        }
    }
}