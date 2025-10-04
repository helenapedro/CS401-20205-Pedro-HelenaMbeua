package labs.lab5.prob2;

import labs.lab5.prob2.models.duck.*;
import labs.lab5.prob2.models.duck.MallardDuck;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
                new MallardDuck(),
                new DecoyDuck(),
                new RedheadDuck(),
                new RubberDuck()
        };

        for (Duck d : ducks) {
            System.out.println(d.getClass().getSimpleName() + ":");
            d.display();   // "displaying"
            d.fly();       // "fly with wings" or "cannot fly"
            d.quack();     // "quacking" / "squeaking" / "cannot quack"
            d.swim();      // "swimming"
            System.out.println();
        }
    }
}
