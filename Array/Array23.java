package Array;

import java.util.Random;

public class Array23 {
    public static void main(String[] args) {
        int n = 10;
        int k = 3;
        int l = 8;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sumaverage;
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            Random input = new Random();

            arr[i] = input.nextInt(100);
            sum += arr[i];
            System.out.print(arr[i] + "\t");

        }

        for (int i = k; i <= l; i++) {
            sum1 += arr[i];
        }
        sum2 = sum - sum1;
        sumaverage = sum2 / (n - (l - k));
        System.out.println("Answer: " + sumaverage);
    }
}
