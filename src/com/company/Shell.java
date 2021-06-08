package com.company;

public class Shell {
    public Shell() {
    }

    static int sorter(int[] arr) {
        int len = arr.length;

        for(int space = len / 2; space > 0; space /= 2) {
            for(int i = space; i < len; ++i) {
                int flow = arr[i];

                int j;
                for(j = i; j >= space && arr[j - space] > flow; j -= space) {
                    arr[j] = arr[j - space];
                }
                arr[j] = flow;
            }
        }
        return 0;
    }
}