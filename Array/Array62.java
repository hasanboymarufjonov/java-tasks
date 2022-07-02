package Array;

public class Array62 {
    public static void main(String[] args) {
        // a massiv berilgan
        // bu massiv elementlaridan musbatlarini b massivga
        // manfiylarini esa c massivga toplab
        // ekranga chiqaramiz
        int[] array = { 1, 4, -5, 7, -8, 9, -4 };
        // result -> 1 4 7 9
        // result -> -5 -8 -4
        int musbat = 0, manfiy = 0;
        showarray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                musbat++;
            else
                manfiy++;
        }
        int t = 0, m = 0;
        int[] b = new int[musbat];
        int[] c = new int[manfiy];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                b[t] = array[i];
                System.out.print(b[t] + "  ");
                t++;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                c[m] = array[i];
                System.out.print(c[m] + "  ");
                m++;
            }
        }
        System.out.println();
        System.out.println("musbat elementlari " + musbat);
        System.out.print("manfiy elementlari " + manfiy);
    }

    public static void showarray(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "  ");
        }
    }

}
