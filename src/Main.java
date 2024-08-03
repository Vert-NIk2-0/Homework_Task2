import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        step1();

        System.out.println("2. Enter a number from 1 to 12: ");
        step2(sc.nextInt());

        System.out.println("Enter 3 numbers to get square root: ");
        step3(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
    }

    static void step1() {
        int count = 1;
        System.out.println("1. Numbers from 1 to 25 as an NxN matrix: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }

    static void step3(double a, double b, double c) {
        if (a < 0) {
            System.out.println("Корней нет");
        } else System.out.printf("%.2f\n", Math.sqrt(a));

        if (b < 0) {
            System.out.println("Корней нет");
        } else System.out.printf("%.2f\n", Math.sqrt(b));

        if (c < 0) {
            System.out.println("Корней нет");
        } else  System.out.printf("%.2f\n", Math.sqrt(c));
    }
}