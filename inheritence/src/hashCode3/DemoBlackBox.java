package hashCode3;

public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5,10);
        BlackBox object2 = new BlackBox(5, 10);
        System.out.println(object1.equals(object2));// true
        System.out.println(object1.hashCode() == object2.hashCode());
    }
}
