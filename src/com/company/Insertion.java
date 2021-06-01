package com.company;

import java.util.ArrayList;

public class Insertion {
    public static void insertionGet(ArrayList<Integer> arr) {
        int len = arr.size();
        for (int j = 1; j < len; j++) {
            int mark = arr.get(j);
            int i = j - 1;
            while ((i > -1) && (arr.get(i) > mark)) {
                arr.set(i + 1, arr.get(i));
                i--;
            }
            arr.set(i + 1, mark);
        }
    }
}
