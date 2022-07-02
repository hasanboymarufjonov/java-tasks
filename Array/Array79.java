package Array;

import Array.ArrayLibrary;

public class Array79 {
    /**
     * 1 2 3 4 5 6 7 8 9
     * right remove
     * result -> 0 1 2 3 4 5 6 7 8
     */
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayLibrary.showArray(remove_right(array));

    }

    static int[] remove_right(int[] array) {
        int[] New_array = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            New_array[i] = array[i - 1];
        }
        return New_array;
    }
}
