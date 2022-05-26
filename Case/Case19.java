package Case;

import java.util.Scanner;

public class Case19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int color, animal, year;
        System.out.print("Yil = ");
        year = input.nextInt();

        animal = (year - 1984) % 12;
        color = (year - 1984) % 5;

        switch (animal) {
            case 0 -> System.out.print(year + " - sichqon");
            case 1 -> System.out.print(year + " - sigir");
            case 2 -> System.out.print(year + " - yo'lbars");
            case 3 -> System.out.print(year + " - quyon");
            case 4 -> System.out.print(year + " - ajdar");
            case 5 -> System.out.print(year + " - ilon");
            case 6 -> System.out.print(year + " - ot");
            case 7 -> System.out.print(year + " - qo'y");
            case 8 -> System.out.print(year + " - maymun");
            case 9 -> System.out.print(year + " - tovuq");
            case 10 -> System.out.print(year + " - it");
            case 11 -> System.out.print(year + " - to'ng'iz");

        }

        switch (color) {
            case 0 -> System.out.print(", yashil");
            case 1 -> System.out.print(", qizil");
            case 2 -> System.out.print(", sariq");
            case 3 -> System.out.print(", oq");
            case 4 -> System.out.print(", qora");
        }

    }
}
