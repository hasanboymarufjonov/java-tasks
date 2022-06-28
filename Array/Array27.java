package Array;

import java.util.Random;

public class Array27 {
    /*
     * N ta elementda tashkil topgan massiv berilgan. Massiv elementlari atifmetik
     * progressiyani tashkil qilsa ayirmani,
     * aks holda 0 ni chiqatuvchi programma tuzing
     */

    /* a2 = a1 + d, a3 = a2 + d */
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        System.out.println(AriphmeticProgression(arr));
    }

    public static void ArrayValue(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            Random input = new Random(100);

            Array[i] = input.nextInt();
        }
    }

    public static int AriphmeticProgression(int Array[]) {

        for (int i = 0; i < Array.length; i++) {
            if ((Array[i + 1] > 0 && Array[i] < 0) || (Array[i + 1] > 0 && Array[i] % 2 < 0)) {
                return 0;
            } else {
                return Array[i];
            }
        }
        return 1;

    }
}