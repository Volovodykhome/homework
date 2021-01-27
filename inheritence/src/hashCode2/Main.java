package hashCode2;

//import Final.Animal;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.hashCode());
        a.age = 5;
        a.name = "Rex";
        System.out.println(a.hashCode());
    }
}
