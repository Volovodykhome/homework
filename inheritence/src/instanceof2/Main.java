package instanceof2;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m  instanceof  Main);
        Main m1 = null;
        System.out.println(m1 instanceof Main);
        //класс группа, класс студент и клас преподаватель группе пренадлежат преподаватели и студенты.
        //преподаватель является елементом группы и студент являются елементами группы.
    }

}
