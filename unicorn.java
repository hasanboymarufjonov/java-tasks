public class unicorn {
    public static void main(String[] args) {

        for (int i = 0; i < 9999; i++) {
            if (i % 4 == 3 && i % 9 == 0 && i % 10000 == i) {
                System.out.println(i);

            }
        }
    }
}
