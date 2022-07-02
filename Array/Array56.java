package Array;

public class Array56 {
    public static void main(String[] args) {
        // shart operatori ishlatmasdan yangi massiv hosil qilish kerak
        int[] massiv = { 1, 6, 8, 9, -4, 81, -45, 12, 47 };
        // avval juft indexlari keyin esa toq indexlari chiqarish kerak
        // result -> 1 8 -4 -45 47 6 9 81 12

        index(massiv);
    }

    static void index(int[] mass) {
        int[] b = new int[mass.length];
        int k = 0;
        for (int i = 0; i < mass.length; i += 2) {
            b[k] = mass[i];
            System.out.print(b[k] + "  ");
            k++;
        }

        for (int i = 1; i < mass.length; i += 2) {
            b[k] = mass[i];
            System.out.print(b[k] + "  ");
            k++;
        }
        System.out.println("\n");
        System.out.print("kiritilgan massivda " + k + " ta element mavjud");
        System.out.println("\n");
    }

}
