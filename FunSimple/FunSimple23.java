package FunSimple;

public class FunSimple23 {
    public static void main(String[] args) {
        quarter(5, 3);
        quarter(-7, -3);
        quarter(-9, 8);
        quarter(10, -8);

    }

    static void quarter(int x, int y) {
        if (x > 0) {
            if (y > 0)
                System.out.println(" I chorak ");
            else
                System.out.println(" IV chorak ");
        } else {
            if (y > 0)
                System.out.println(" II chorak");
            else
                System.out.println(" III chorak ");
        }

    }
}
