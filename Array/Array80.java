package Array;

import Array.ArrayLibrary;

public class Array80 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // massiv elementlarini 1 ta hapga siljitish kerak
        ArrayLibrary.showArray(remove_left(array));

    }

    static int[] remove_left(int[] array) {
        int[] massiv = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            massiv[i] = array[i + 1];
        }
        return massiv;
    }

}
