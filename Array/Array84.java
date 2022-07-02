package Array;

import Array.ArrayLibrary;

public class Array84 {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5 };
        // result -> 2 3 4 5 1
        ArrayLibrary.showArray(remove_left(test));
    }

    static int[] remove_left(int[] array) {
        int[] mssiv = new int[array.length];
        int index = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            mssiv[i] = array[--index];
            index = i + 1;
        }
        return mssiv;
    }
}
