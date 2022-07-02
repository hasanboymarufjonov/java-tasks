package Array;

import Array.ArrayLibrary;

public class Array81 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ArrayLibrary.showArray(remove_k(array, 5));
    }

    static int[] remove_k(int[] array, int k) {
        int[] Newarray = new int[array.length];
        for (int i = k; i < array.length; i++) {
            Newarray[i] = array[i - k];
        }
        return Newarray;
    }

}
