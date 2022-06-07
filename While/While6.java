package While;

import javax.swing.plaf.TreeUI;

public class While6 {
    public static void main(String[] args) {
        int sum = 1;
        int n = 22;
        while (n > 0) {
            sum *= n;
            n -= 2;
        }
        System.out.println(sum);
    }
}
