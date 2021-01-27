package Groups;

import instanceofs.Animal;
import instanceofs.Cat;
import instanceofs.Dog;

public class Main {
    public static void main(String[] args) {
        Band ba = new Band();
        Students s = new Students();
        Teachers t = new Teachers();
        Band bs = new Students();
        Band bt = new Teachers();

        boolean p = s instanceof Students;
        System.out.println(p);
        if (s instanceof Band) {
            ba = s;
            System.out.println("alright ba = s");

        }
        boolean  pp = t instanceof Teachers;
        System.out.println(pp);
        if (pp) {
            System.out.println("alright");
            ba = t;
        }else{
            System.out.println("mastakes");
        }
    }
}
