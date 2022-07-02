package Array;

import Array.ArrayLibrary;

public class Array75 {
    public static void main(String[] args) {
        int[] number = { 2, 4, -5, 6, 8, 10, 12 };
        // result -> 2 4 12 10 8 6 -5
        high_sorting(number);
        ArrayLibrary.showArray(number);

    }

    static int[] high_sorting(int[] array) {
        int min = array[0], max = array[0];
        int k = 0, n = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                k = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                n = i;
            }
        }

        for (int i = k; i <= n - k; i++) {
            int t = array[i];
            array[i] = array[n];
            array[n] = t;
            n--;
        }

        return array;
    }

}
