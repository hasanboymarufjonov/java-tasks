package Array;

import java.util.Random;

public class ArrayLibrary {
    public static void main(String[] args) {
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void massiv_toldirish(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
        }
    }

    public static void katta_kichik_index(int[] massiv) {
        int min = massiv[0];
        int max = massiv[0];
        int m = 0, k = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (min > massiv[i]) {
                min = massiv[i];
                m = i;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            if (max < massiv[i]) {
                max = massiv[i];
                k = i;
            }
        }
    }
}
