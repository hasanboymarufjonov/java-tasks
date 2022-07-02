package Array;

import Array.ArrayLibrary;

public class Array78 {
    public static void main(String[] args) {
        int[] mass = new int[6];
        ArrayLibrary.massiv_toldirish(mass);
        ArrayLibrary.showArray(mass);
        System.out.println();

        arifmetik(mass);
        ArrayLibrary.showArray(mass);
    }

    static int[] arifmetik(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = ((array[i + 1] + array[i]) / 2);
        }
        return array;
    }

}
