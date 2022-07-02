package Array;

import Array.ArrayLibrary;

public class Array82 {
    public static void main(String[] args) {
        /***
         * 
         * 1 2 3 4 5 6 7 8 9
         * remove left 3
         * result ->
         * 4 5 6 7 8 9 0 0 0
         */
        int[] massiv = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayLibrary.showArray(remove_left_k(massiv, 3));
    }

    static int[] remove_left_k(int[] array, int k) {
        int[] massiv = new int[array.length];
        for (int i = 0; i < array.length - k; i++) {
            massiv[i] = array[i + k];
        }

        return massiv;
    }

}
