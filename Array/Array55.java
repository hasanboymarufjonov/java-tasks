package Array;

public class Array55 {
    public static void main(String[] args) {
        int[] a_arr = { 4, 5, 78, -9, 14, 2, 36, 15, 78, 19 };
        // result ->
        // toq indexlari soni 5 ta
        // ular -> 5 -9 2 15 19
        aniqla(a_arr);

    }

    static void aniqla(int[] arr) {
        int count = arr.length / 2;
        System.out.println(count + " ta toq index mavjud");
        int[] b = new int[count];
        System.out.println("ular quyidagilar :");
        for (int i = 1; i < arr.length; i += 2) {
            int k = 0;
            b[k] = arr[i];
            System.out.print(b[k] + "  ");
            k++;
        }

    }

}
