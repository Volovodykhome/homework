package line1;

import java.util.Scanner;

public class lesson_21_09_1 {
    static Scanner t = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите двухзначное число");
        int a = t.nextInt();
        int a1 = a / 10;
        int a2 = a % 10;
        System.out.println(a1 + a2);
        System.out.println(a1 * a2);
    }
}
