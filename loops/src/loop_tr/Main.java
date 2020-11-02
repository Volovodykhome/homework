package loop_tr;

public class Main {
    public static void main(String[] args) {
        //мой первый треугольник средний возраст от 10 до 1
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //мой второй треугольник средний возраст от 1 до 10
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //мой третий треугольничек
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // мой четвертый треугольник
        for (int i = 10; i > 0; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

