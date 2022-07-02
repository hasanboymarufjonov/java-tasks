package Array;

public class Array35 {
    public static void main(String[] args) {
        int[] tekshir = { 1, 5, 7, 9, 8, 78, 35, 114 };
        // lokal maxsimum ni kichigi
        // 9 78
        // result -> 9
        System.out.println(check(tekshir));

    }

    public static int check(int[] arr) {
        int min;
        min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && min > arr[i])
                min = arr[i];
        }
        return min;
    }

}
