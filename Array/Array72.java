package Array;

import Array.ArrayLibrary;

public class Array72 {
    public static void main(String[] args) {
        int[] massiv = new int[6];
        ArrayLibrary.massiv_toldirish(massiv);
        ArrayLibrary.showArray(massiv);
        System.out.println();
        sorting3(massiv, 2, 5);
        ArrayLibrary.showArray(massiv);

    }

    static void sorting3(int[] array, int k, int h) {
        int length = h - k;
        for (int i = k; i <= length; i++) {
            int t = array[i];
            array[i] = array[h];
            array[h] = t;
            k++;
            h--;
        }
    }
}
