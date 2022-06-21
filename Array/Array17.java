package Array;

public class Array17 {
    public static void main(String[] args) {
        solution(new int[] { 5, 1, 8, 9, 12, 6, 5, 48, 7, -2, -3 });
        /*
         * int[] array = new int[]{5, 1, 8, 9, 12, 32, 6, 5, 48, 7, -2, -3};
         * solution(array);
         */
    }
    // 5 1 8 9 12 32 6 5 48 7 -2 -3
    // 5 1 15 -3 8 9 -2 7 12 32 48 5 6
    // a[0] a[1] a[n-1] a[n-2] a[2] a[3] a[n-3] a[n-4]
    // 1 - a[0], a[1]
    // 2 - a[n-1] a[n-2]
    // 1 - a[2], a[3]
    // 2 - a[n-3] a[n-4]
    // 1 - a[4], a[5]
    // 2 - a[n-5] a[n-6]
    // ..... elementlari qolmasa, jarayot to'xtatiladi

    public static void solution(int[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        // 5, 1, 8, 9, 12, 32, 100, 6, 5, 48, 7, -2, -3
        while (true) {
            if (leftIndex <= rightIndex) { // chap tomon qiymati o'ng tomonda foydalanilmagan
                System.out.print(array[leftIndex] + " ");
                leftIndex++; // keyingisini tekshirish uchun
            } else
                break;
            if (leftIndex <= rightIndex) {
                System.out.print(array[leftIndex] + " ");
                leftIndex++;
            } else
                break;

            if (leftIndex <= rightIndex) {
                System.out.print(array[rightIndex] + " ");
                rightIndex--;
            } else
                break;
            if (leftIndex <= rightIndex) {
                System.out.print(array[rightIndex] + " ");
                rightIndex--;
            } else
                break;
        }
    }
}
