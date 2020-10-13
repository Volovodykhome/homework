package looprec1;

public class Main {
    public static String recursion (int n) {
        if (n==1){
            return "1";
            }
            return n + " " + recursion (n-1);
        }

    public static void main(String[] args) {
        System.out.println("Вывод чисел методом рекурсия");
        System.out.println(recursion(12));
        System.out.println("Вычесление факториала методом рекурсия");
        System.out.println(factorial(8));
    }
    public static int factorial(int a){
        if (a == 1){
            return 1;
        }
        return a*factorial(a - 1);
    }
    }

