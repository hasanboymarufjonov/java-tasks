package Array;

public class Array34 {
    public static void main(String[] args) {
        int[] tekshir = { 1, 5, 7, 9, 8, 78, 35, 114 };
        // result -> 35
        System.out.println(analys(tekshir));

    }

    public static int analys(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1] && max < arr[i])
                max = arr[i];
        }
        return max;
    }

}
