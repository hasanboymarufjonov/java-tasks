package For;

// N natural sonining bo'luvchilarini chiqaruvchi programma tuzilsin

public class ForAdd {
    public static void input(int N) {
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        input(30);
    }
}
