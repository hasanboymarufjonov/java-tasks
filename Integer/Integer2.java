package Integer;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        int mkg, mt;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Vaznni kilogramda kiriting: ");
            mkg = input.nextInt();
        }
        mt = mkg / 1000;

        System.out.println(mkg + " kg to'liq " + mt + " t ga teng");
    }
}
