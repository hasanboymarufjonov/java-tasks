import java.util.Random;

// 39

public class Exam2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 8;

        int[] result = new int[n];

        while (true) {
            Random input = new Random();

            int temp = input.nextInt(1, m);

            boolean again = false;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < i; j++) {
                    if (result[j] == temp) {
                        again = true;
                    }

                    if (again == false) {
                        result[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    {

        for (

                int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }

    }

}
