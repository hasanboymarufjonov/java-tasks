package Integer;

import java.util.Scanner;

public class Integer3 {
    public static void main(String[] args) {
        int hb, hkb;
        Scanner input = new Scanner(System.in);
        System.out.println("Fayl hajmini baytda kiriting: ");
        hb = input.nextInt();
        hkb = hb / 1024;

        System.out.println(hb + " bayt to'liq " + hkb + " kilobaytga teng");
    }
}
