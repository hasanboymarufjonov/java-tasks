package Array;

import Array.ArrayLibrary;

public class Array87 {
    public static void main(String[] args) {
        int[] test = { 6, 2, 3, 4, 5, 7, 8, 9, 10 };

        ArrayLibrary.showArray(sort(test));

    }

    static int[] sort(int[] array) {
        int[] massiv = new int[array.length];
        int index = 0, t = 0;
        for (int i = 1; i < massiv.length; i++) {
            if (array[0] > array[i])
                index = i;// 5

        }
        for (int i = 0; i < index - 2; i++) {
            massiv[i] = array[i + 1];
        }
        for (int i = index - 1; i < array.length; i++) {
            massiv[i] = array[t];
            t = i + 1;
        }

        return massiv;
    }

}
