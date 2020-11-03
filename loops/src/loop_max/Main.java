package loop_max;

import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);
    public static void main(String[] args) {
        int max = 0;
        int i = 1;
        while(i <= 5){
            System.out.println("Введите "+i+" число");
            int num = ff.nextInt();
            if(num > max) max = num;
            i++;
        }
        System.out.println("введите число " + max);
    }
}
