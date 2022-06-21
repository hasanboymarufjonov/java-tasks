package Array;

public class Array3 {
    public static void main(String[] args) {
        func(10, 2, 5);
    }

    // a, d, n - ai = ai-1 + d

    public static void func(int n, int a1, int d) {
        int arr[] = new int[n];
        arr[0] = a1;
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + d;
            System.out.println(arr[i]);
        }

    }
}
