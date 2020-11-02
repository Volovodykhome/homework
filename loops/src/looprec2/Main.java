package looprec2;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static int stepen(double a){
        if(a==1){
            return (int) a;
        }
        return (int) (a % 10 + stepen (a/10));
    }
    public static void main(String[] args) {

        System.out.println("Введите число");
        int a = tt.nextInt();
        System.out.println ( a % 10 + stepen (a/10));
    }
}
