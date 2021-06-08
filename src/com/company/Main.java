package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    static Random r = new Random();


    public static void main(String[] args) {
        /*
         * Call your sorting and searching Algorithms here...
         *
         * */
        int[] large = largeBatch();
        int[] small = smallBatch();
        int[] expectedLrg = expected(large);
        int[] expectedSml = expected(small);

        System.out.println("input: " + arrayToString(small));
        System.out.println("input: " + arrayToString(large));

        int resultSearchSmall = Search.findNum(small, 6);
        if (resultSearchSmall == -1)
            System.out.println("The number wasn't found with a search.");
        else
            System.out.println("The number was found on index " + resultSearchSmall + ".");
        int resultSearchLarge = Search.findNum(large, 600);
        if (resultSearchLarge == -1)
            System.out.println("The number wasn't found with a search.");
        else
            System.out.println("The number was found on index " + resultSearchLarge + ".");
        Sort.order(small);
        System.out.println("Small Sorted: " + Arrays.toString(small));
        Sort.order(large);
        System.out.println("Large Sorted: " + Arrays.toString(large));
        Bubble.bubbleGet(small);
        System.out.println("Small Bubble Sorted: " + Arrays.toString(small));
        Bubble.bubbleGet(large);
        System.out.println("Large Bubble Sorted: " + Arrays.toString(large));
        Insertion.insertionGet(small);
        System.out.println("Small Insertion Sorted: " + Arrays.toString(small));
        Insertion.insertionGet(large);
        System.out.println("Large Insertion Sorted: " + Arrays.toString(large));
        int resultBinSmall = Binary.binaryGet(small, 0, small.length - 1, 10);
        if (resultBinSmall == -1)
            System.out.println("The mark wasn't found in the binary search.");
        else
            System.out.println("The mark was found on index " + resultBinSmall + ".");
        int resultBinLarge = Binary.binaryGet(small, 0, small.length - 1, 10);
        if (resultBinLarge == -1)
            System.out.println("The mark wasn't found in the binary search.");
        else
            System.out.println("The mark was found on index " + resultBinLarge + ".");
        Shell.sorter(small);
        System.out.println("Small Shell Sorted: " + Arrays.toString(small));
        Shell.sorter(large);
        System.out.println("Small Shell Sorted: " + Arrays.toString(small));
        System.out.println("Sorting output: " + arrayToString(small));
        System.out.println("Expected: " + arrayToString(expectedSml));
    }

    public static int[] largeBatch() {
        int[] largeBatch = new int[2000];
        for (int i = 0; i < 2000; i++) {

            largeBatch[i] = r.nextInt(10000);
        }
        return largeBatch;
    }

    public static int[] smallBatch() {
        int[] smallBatch = new int[20];
        for (int i = 0; i < 20; i++) {
            smallBatch[i] = r.nextInt(100);
        }
        return smallBatch;
    }

    public static int[] expected(int[] unsorted) {
        int[] sorted = unsorted.clone();
        Arrays.sort(sorted);
        return sorted;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder output = new StringBuilder();
        for (int value : arr) {
            output.append(value).append(", ");
        }
        output = new StringBuilder(output.substring(0, output.length() - 2));
        return output.toString();
    }
}