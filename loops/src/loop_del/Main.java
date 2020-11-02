package loop_del;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("введите произвольное число");
        int a = tt.nextInt(); //само число
        int b = 1; //счётчик цикла
        int n = 0; //количество делителей
        while (b <= a){
            int r = a % b;
            if (r == 0){
                n+=1;
            }
            b += 1;
        }
        System.out.println("число имеет " + n + " делителей");
    }
}
