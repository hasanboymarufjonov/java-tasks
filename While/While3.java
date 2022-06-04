package While;

public class While3 {
    public static void main(String[] args) {
        int a = 106;
        int b = 20; // 5 butun 6 qoldiq

        int count = 0;

        while (a > b) {
            a -= b;
            count++;

        }
        System.out.println(count + " butun");
        System.out.println(a + " qoldiq");

    }

}
