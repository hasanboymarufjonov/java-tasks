package Array;

import java.util.Random;

public class Array21 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int l = 8;
        int sum = 0;
        int sumaverage;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            Random input = new Random();

            arr[i] = input.nextInt(100);
            System.out.println(arr[i]);
        }

        for (int i = k; i <= l; i++) {
            sum += arr[i];
        }
        sumaverage = sum / (l - k);
        System.out.println("Answer: " + sumaverage);
    }
}
