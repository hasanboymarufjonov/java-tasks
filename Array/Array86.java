package Array;

import Array.ArrayLibrary;

public class Array86 {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        // k ta birlik chapga siljituvchi
        // k=2;
        // 3 4 5 6 7 8 9 10 1 2
        ArrayLibrary.showArray(remove_left_siclic(test, 3));
    }

    static int[] remove_left_siclic(int[] array, int k) {
        int[] massiv = new int[array.length];
        for (int i = 0; i < array.length - k; i++) {
            massiv[i] = array[i + k];
        }
        int j = 0;
        for (int i = array.length - k; i < array.length; i++) {
            massiv[i] = array[j];
            j++;
        }

        return massiv;
    }

}
