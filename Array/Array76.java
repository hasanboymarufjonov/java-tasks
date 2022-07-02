package Array;

import Array.ArrayLibrary;

public class Array76 {
    public static void main(String[] args) {
        int[] massiv = { 1, 4, 2, 8, 9, 41, 25, 31 };
        // local max => 4 41
        local(massiv);
        ArrayLibrary.showArray(massiv);
    }

    static int[] local(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1])
                array[i] = 0;
        }

        return array;

    }

}
