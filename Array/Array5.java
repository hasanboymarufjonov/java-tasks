package Array;

public class Array5 {
    public static void main(String[] args) {
        func(10, 1, 1);
    }

    // Fi = Fi-1 + F-2

    public static void func(int n, int f1, int f2) {
        int arr[] = new int[n];
        arr[0] = f1;
        arr[1] = f2;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }

    }
}
