package Case;

public class Case20Method2 {
    public static void main(String[] args) {
        solution(3, 2);
    }

    public static void solution(int day, int month) {
        int kun = number(day, month); // yilning shu sanadagi nechanchi kun ekani
        // masala: 5-fevral -> number = 36
        // qovg'a
        if (number(20, 1) <= kun && kun <= number(18, 2)) {
            System.out.println("Qovg'a");
        } else if (number(19, 2) <= kun && kun <= number(20, 3)) {
            System.out.println("Baliq");
        } else if (number(19, 2) <= kun && kun <= number(20, 3)) {
            System.out.println();
        }

    }

    // D-kun M-oy berilgan
    // shu sana yilning nechanchi kuniga mos keladi?
    // (Kabisa bo'lmagan yil uchun)
    // masalan: 23.3 -> 82 = 31 + 28 + 23
    public static int number(int day, int month) {
        int number = 0;
        switch (month) {
            case 1 -> number = day;
            case 2 -> number = 31 + day;
            case 3 -> number = 31 + 28 + day;
            case 4 -> number = 31 + 28 + 31 + day;
            case 5 -> number = 31 + 28 + 31 + 30 + day;
            case 6 -> number = 31 + 28 + 31 + 30 + 31 + day;
            case 7 -> number = 31 + 28 + 31 + 30 + 31 + 30 + day;
            case 8 -> number = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
            case 9 -> number = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
            case 10 -> number = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
            case 11 -> number = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
            case 12 -> number = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
        }
        return number;
    }
}
