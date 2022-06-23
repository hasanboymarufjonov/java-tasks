package Array;

import java.util.Random;

public class Array22 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int l = 8;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            Random input = new Random();

            arr[i] = input.nextInt(100);
            sum += arr[i];
            System.out.println(arr[i]);
        }

        for (int i = k; i <= l; i++) {
            sum1 += arr[i];
        }
        sum2 = sum - sum1;
        System.out.println("Answer: " + sum2);
    }
}
