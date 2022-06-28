package Array;

public class Array24 {

    public static void main(String[] args) {
        // test1 ap
        // dastlabki haki 3, ayirmasi 7 10 haddan iborat
        int[] arr1 = ArrayUtil.generateArifProg(1000000, 3, 7);
        int test1 = solution1(arr1);
        System.out.println(test1);
        // test2 ap
        // dastlabki haki 3, ayirmasi 7 10 haddan iborat
        int test2 = solution2(arr1);
        System.out.println(test2);

        // Tal'atakadan so'raymiz
        // String.format()
        // java string time format
        // 72 -> 01:12

        // test3 ap
        // tasodifiy sonlar to'plami
        int[] arr2 = ArrayUtil.generateRand(1000000, 1, 100);
        int test3 = solution1(arr2);
        System.out.println(test3);
        // test4 ap
        // tasodifiy sonlar to'plami
        int test4 = solution2(arr2);
        System.out.println(test4);
    }

    // Arifmetik progressiya bo'lsa, ayirma qaytarilsin
    // aks holda 0 qaytarilsin
    // ayirma -> a(n) - a(n-1)
    // 20 10 0 -10 -20 => -10
    // 20 10 0 -1 -20 => 0
    public static int solution1(int[] array) {
        // 1 - Arifmetik progressiyami?
        // ha bo'lsa, return array[1]-array[0]
        // yo'q return 0;
        if (array.length == 0 || array.length == 1)
            return 0;
        // ....
        int d = array[1] - array[0];
        int counter = 1; // sikllar soni
        for (int i = 2; i < array.length; i++) {
            counter++;
            if (array[i] - array[i - 1] != d) {
                System.out.println("1-usul: " + counter);
                return 0; // arifmetik progressiya emas
            }
        }
        System.out.println("1-usul: " + counter);
        return d;

    }

    // Arifmetik progressiya bo'lsa, ayirma qaytarilsin
    // aks holda 0 qaytarilsin
    // ayirma -> a(n) - a(n-1)
    // 20 10 1 -10 -20 => -10
    // 20 10 0 -1 -20 => 0
    public static int solution2(int[] array) {
        // 1 - Arifmetik progressiyami?
        // ha bo'lsa, return array[1]-array[0]
        // yo'q return 0;
        if (array.length == 0 || array.length == 1)
            return 0;
        // ....
        int d = array[1] - array[0];
        int counter = 1;
        boolean bool = true; // massiv arifmetik progressiya bo'lsin
        for (int i = 2; i < array.length; i++) {
            counter++;
            bool = bool && array[i] - array[i - 1] == d;
        }

        System.out.println("2-usul: " + counter);
        if (bool)
            return d;
        else
            return 0;

    }
}
