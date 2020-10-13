package looprec3;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static int stepen(double a) {
        if (a == 1) {
            return 1;
        } else if (a > 1 && a < 2) {
            return 0;
        } else {
            return stepen(a / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите число");
        double a = tt.nextInt();
        if (stepen(a) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}