package Array;

public class Array57 {
    public static void main(String[] args) {
        // massivninig ga karali indexlariga mos elementlar chiqarish kerak
        int[] a_massiv = { 1, 5, -8, 7, 14, 1001, 12, 201, 45 };
        // result -> 7 12
        index3(a_massiv);
    }

    static void index3(int[] array) {
        int[] b = new int[array.length / 3];
        int k = 0;
        for (int i = 3; i < array.length; i += 3) {
            b[k] = array[i];
            System.out.print(b[k] + "  ");
            k++;
        }
        System.out.println("\n");
        System.out.println("3 ga karrali indexlari soni " + k + "ta");

    }

}
