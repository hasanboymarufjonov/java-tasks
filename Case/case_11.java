package gita.foundation.problems_5;

import java.util.Scanner;

public class case_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("s: shimol, j: janub, q: sharq, g: g'arb");
        char y = input.next().charAt(0);
        System.out.println("0: o'ng, 1: chap, 2: 180 burilish");
        int k = input.nextInt();
        int k2 = input.nextInt();



        switch (y) {
            case 's' -> {
                switch (k) {
                    case 0 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Janub");
                            case 1 -> System.out.println("Shimol");
                            case 2 -> System.out.println("G'arb");
                            default -> System.out.println("error");
                        }
                    }
                    case 1 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Shimol");
                            case 1 -> System.out.println("Janub");
                            case 2 -> System.out.println("Sharq");
                            default -> System.out.println("error");
                        }
                    }
                    case 2 -> {
                        switch (k2) {
                            case 0 -> System.out.println("G'arb");
                            case 1 -> System.out.println("Sharq");
                            case 2 -> System.out.println("Shimol");
                            default -> System.out.println("error");
                        }
                    }

                    default -> System.out.println("error");
                }
            }
            case 'j' -> {                       // 0: o'ng, 1: chap, 2: 180 burilish  janub g'arb
                switch (k) {
                    case 0 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Shimol");
                            case 1 -> System.out.println("Janub");
                            case 2 -> System.out.println("Sharq");
                            default -> System.out.println("error");
                        }
                    }
                    case 1 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Janub");
                            case 1 -> System.out.println("Shimol");
                            case 2 -> System.out.println("G'arb");
                            default -> System.out.println("error");
                        }
                    }
                    case 2 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Sharq");
                            case 1 -> System.out.println("G'arb");
                            case 2 -> System.out.println("Janub");
                            default -> System.out.println("error");
                        }
                    }

                    default -> System.out.println("error");
                }
            }
            case  'q' -> {
                switch (k) {  // 0: o'ng, 1: chap, 2: 180 burilish  sharq janub g'arb | shimol -> sharq -> janub -> g'arb
                    case 0 -> {
                        switch (k2) {
                            case 0 -> System.out.println("G'arb");
                            case 1 -> System.out.println("Sharq");
                            case 2 -> System.out.println("Shimol");
                            default -> System.out.println("error");
                        }
                    }
                    case 1 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Sharq");
                            case 1 -> System.out.println("G'arb");
                            case 2 -> System.out.println("Janub");
                            default -> System.out.println("error");
                        }
                    }
                    case 2 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Shimol");
                            case 1 -> System.out.println("Janub");
                            case 2 -> System.out.println("Sharq");
                            default -> System.out.println("error");
                        }
                    }

                    default -> System.out.println("error");
                }
            }
            case 'g' -> {
                switch (k) {  // 0: o'ng, 1: chap, 2: 180 burilish  sharq janub g'arb | shimol -> sharq -> janub -> g'arb
                    case 0 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Sharq");
                            case 1 -> System.out.println("G'arb");
                            case 2 -> System.out.println("Janub");
                            default -> System.out.println("error");
                        }
                    }
                    case 1 -> {
                        switch (k2) {
                            case 0 -> System.out.println("G'arb");
                            case 1 -> System.out.println("Sharq");
                            case 2 -> System.out.println("Shimol");
                            default -> System.out.println("error");
                        }
                    }
                    case 2 -> {
                        switch (k2) {
                            case 0 -> System.out.println("Janub");
                            case 1 -> System.out.println("Shimol");
                            case 2 -> System.out.println("G'arb");
                            default -> System.out.println("error");
                        }
                    }

                    default -> System.out.println("error");
                }
            }
            default -> System.out.println("Error");
        }
    }
}
