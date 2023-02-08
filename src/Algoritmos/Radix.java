package Algoritmos;

import java.util.ArrayList;
import java.util.List;

public class Radix {

    public static void radixSort (int[] arr) {
        final int RADIX = 10;

        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        boolean maxLength = false;
        int temp = -1, placement = 1;
        while (!maxLength) {
            maxLength = true;

            for (int i : arr) {
                temp = i / placement;
                bucket[temp % RADIX].add(i);
                if (maxLength && temp > 0) {
                    maxLength = false;
                }
            }

            int a = 0;
            for (int b = 0; b < RADIX; b++) {
                for (int i : bucket[b]) {
                    arr[a++] = i;
                }
                bucket[b].clear();
            }

            placement *= RADIX;
        }
    }
}
