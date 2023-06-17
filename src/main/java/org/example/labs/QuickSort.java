package org.example.labs;

import java.util.Random;

public class QuickSort extends AbstractSort{
    public static void sort(int[] elements) {
        shuffle(elements); // Shuffle the elements to ensure better performance
        sort(elements, 0, elements.length - 1);
    }

    private static void sort(int[] elements, int low, int high) {
        if (low >= high) {
            return;
        }
        int partitionIndex = partition(elements, low, high);
        sort(elements, low, partitionIndex - 1);
        sort(elements, partitionIndex + 1, high);
    }

    private static void shuffle(int[] elements) {
        Random rand = new Random();
        for (int i = elements.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            swap(elements, i, j);
        }
    }
    private static int partition(int[] elements, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(elements[++i], elements[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(elements[low], elements[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(elements, i, j);
        }
        swap(elements, low, j);
        return j;
    }
}
