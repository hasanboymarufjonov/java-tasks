package While;

import javax.swing.plaf.TreeUI;

public class While6 {
    public static void main(String[] args) {
        int n = 67;
        while (n > 0) {
            n *= n;
            n -= 2;
        }
        System.out.println(n);
    }
}
