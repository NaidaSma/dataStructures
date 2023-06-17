package org.example.labs;

public abstract class AbstractSort {
    /* Returns whether the first element is less than the second one */
    public static boolean less(int v, int w) {
        return v < w;
    }
    public static boolean greater(int a, int b) {
        return a > b;
    }

    /* Swaps the two elements in an array */
    public static void swap (int[] elements, int a, int b) {
        int tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }
}
