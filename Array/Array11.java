package Array;

public class Array11 {
    public static void main(String[] args) {

        int[] arr = { 10, 13, 26, 21, 19, 1, 2, 8, 14, 19 };
        solution(arr, 2);
    }

    public static void solution(int[] array, int k) {

        for (int i = 0; i < array.length; i++) {
            if (i % k == 0)
                System.out.print(array[i] + "\t");
        }

    }
}
