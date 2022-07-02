package Array;

import Array.ArrayLibrary;

public class Array77 {
    public static void main(String[] args) {
        int[] massiv = new int[6];
        ArrayLibrary.massiv_toldirish(massiv);
        ArrayLibrary.showArray(massiv);
        System.out.println();
        local_min(massiv);
        ArrayLibrary.showArray(massiv);

    }

    static int[] local_min(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1] && array[i] < array[i + 1])
                array[i] *= array[i];
        }
        return array;
    }

}
