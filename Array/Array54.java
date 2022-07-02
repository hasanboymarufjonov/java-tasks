package Array;

public class Array54 {
    public static void main(String[] args) {
        int[] a_arr = { 1, 6, 9, 7, 14, 45, 12, 22 };
        // result -> 6 14 12 22
        // soni -> 4 ta
        juft(a_arr);
    }

    static void juft(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        System.out.println(count + " juft elementi bor ");
        System.out.println("ular quyidagilar :");
        int[] b = new int[count];
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            if (arr[i] % 2 == 0) {
                b[k] = arr[i];
                System.out.print(b[k] + "  ");
                k++;
            }
        }

    }

}
