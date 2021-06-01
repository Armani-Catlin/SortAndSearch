package com.company;

import java.util.ArrayList;

public class Search {
    public static int findNum(ArrayList<Integer> arr, int O){
        for (int j : arr) {
            if (j == (O)) {
                return j;
            }
        }
        return -1;
    }
}
