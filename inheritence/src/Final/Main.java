package Final;

public class Main {
    public static void main(String[] args) {
        final int x = 10;
        //x++;
        System.out.println(x);
        Human h1 = new Human("artem", "Порика 18", 24, 24);
        Human h2 = new Human( 45);
        final Human h3 = new Human ( 8);
        Human [] h = {h1, h2, h3};
        for (Human temp : h){
            System.out.println(temp);
        }
        //h3.birthday = 23;
        final int x1 = fabrica ( 100);
        //x1++;
        System.out.println(x1);
    }
     static int fabrica(int range){
        return (int)(Math.random()*range);
    }


}
class Human{
    static final String NAME = "Danyil";
    String address;
    int weight;
    int birthday;

    public Human(String NAME, String address, int weight, int birthday) {
        this.address = address;
        this.weight = weight;
        this.birthday = birthday;
    }

    Human (int birthday){
        this.birthday = birthday;
    }

}