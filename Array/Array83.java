package Array;

import Array.ArrayLibrary;

public class Array83 {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayLibrary.showArray(siklik_remove(test));
    }

    static int[] siklik_remove(int[] array) {
        int[] massiv = new int[array.length];
        int index = array.length - 2;
        for (int i = 0; i < array.length; i++) {
            massiv[i] = array[++index];
            index = i - 1;
        }

        return massiv;
    }

}
