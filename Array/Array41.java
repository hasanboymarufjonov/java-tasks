package Array;

public class Array41 {
    public static void main(String[] args) {
        int[] yigindi = { 1, 5, 4, 6, 98, 4, 12, -98, 10, -54 };
        // ikki qoshni elementlari yigindisi eng katta boladigan elementlarni chiqarish
        // result -> 6 va 98
        func(yigindi);

    }

    static void func(int[] ar) {
        int a, b, c = 0, d = 0;
        a = ar[0] + ar[1];
        for (int i = 1; i < ar.length - 1; i++) {
            b = ar[i] + ar[i + 1];
            if (a < b) {
                a = b;
                c = ar[i];
                d = ar[i + 1];
            }
        }
        System.out.print(c + "  " + d);

    }

}
