package Array;

public class Array2 {
    public static void main(String[] args) {
        func(10);
    }

    public static void func(int n) {
        int arr[] = new int[n];
        arr[0] = 1;
        System.out.println(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = 2 * arr[i - 1];
            System.out.println(arr[i]);
        }

    }
}
