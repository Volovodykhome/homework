package loop1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static void main(String[] args) {
        //Вывод таблицы умножения через While
        /*System.out.println("Введите параметр таблицы умножения");
        int a = tt.nextInt();
        int n = 1;
        while (n<=10){
            System.out.println(a + " * " + n + " = " + a*n);
            n++;
        }
        //Вывод таблицы умножения через Do
        System.out.println("Введите параметр таблицы умножения");
        int a1 = tt.nextInt();
        int n1 = 1;
        do {
            System.out.println(a1 + " * " + n1 + " = " + a1 * n1);
            n1++;
        }
        while(n1<=10);
    }*/
        //Ввод таблицы умножения через For
        System.out.println("Введите параметр таблицы умножения");
        int a2 = tt.nextInt();
        for (int n2 = 1; n2 <= 10; n2++) {
            System.out.println(a2 + " * " + n2 + " = " + a2 * n2);

        }
    }
}
