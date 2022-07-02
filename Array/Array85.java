package Array;

import Array.ArrayLibrary;

public class Array85 {
    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        // k ta birlik ongga siljib qoladi
        // k=2;
        // 10 11 1 2 3 4 5 6 7 8 9
        ArrayLibrary.showArray(remove_k(test, 2));
    }

    static int[] remove_k(int[] array, int k) {
        int[] massiv = new int[array.length];
        int index = array.length - 1;
        ;
        for (int i = k; i < array.length; i++) {
            massiv[i] = array[i - k];
        }
        for (int i = 0; i < k; i++) {
            massiv[i] = array[index];
            index--;
        }

        return massiv;
    }
}
