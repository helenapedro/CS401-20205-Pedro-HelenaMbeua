package labs.lab5.prob2.models.duck;

import labs.lab5.prob2.models.behavior.FlyWithWings;
import labs.lab5.prob2.models.behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
