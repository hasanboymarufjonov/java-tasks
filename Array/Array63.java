package Array;

public class Array63 {

    public static void main(String[] args) {
        // sonlar aralash berilgan bo'lsa, o'sish tartibida saralanadi
        // dublikatlarsiz yangi massiv hosil qilinadi

        int[] a = { -2, -2, 2, 3, 5 }; // ai=5
        // -2 -2 1 1 2 3 5 8 9 9
        int[] b = { 1, 1, 8, 9, 9 }; // bi=2
        // 0 1 2 2 4 5 8 9 9 10
        int[] c = solution(a, b);
        ArrayUtil.show(c);
    }

    public static int[] solution(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int aIndex = 0, bIndex = 0, cIndex = 0;
        while (cIndex < c.length) { // c.length = 10
            if (aIndex == a.length)// a massivda tekshiriladigan qiymat qolmadi
                for (int i = bIndex; i < b.length; i++) {
                    c[cIndex++] = b[i];
                }
            else if (bIndex == b.length) // b massivda tekshiriladigan qiymat qolmadi
                for (int i = aIndex; i < a.length; i++) {
                    c[cIndex++] = a[i];
                }
            else {
                if (a[aIndex] <= b[bIndex]) {
                    c[cIndex] = a[aIndex++];
                } else {
                    c[cIndex] = b[bIndex++];
                }
                cIndex++;
            }
        }

        return c;
    }
}
