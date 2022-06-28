package Array;

import java.util.Random;

public class Array24B {
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

        int d = Array[1] - Array[0];
        for (int i = 0; i < Array.length; i++) {
            if ((Array[i + 1] - Array[i]) != d) {
                return 0;
            }
        }
        return d;
    }
}