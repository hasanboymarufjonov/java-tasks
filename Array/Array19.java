package Array;

import java.util.Random;

public class Array19 {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            Random input = new Random();

            arr[i] = input.nextInt(100);
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[n - 1] && arr[i] > arr[0]) {
                System.out.println("Answer" + arr[i]);
                break;
            }
        }
    }
}
