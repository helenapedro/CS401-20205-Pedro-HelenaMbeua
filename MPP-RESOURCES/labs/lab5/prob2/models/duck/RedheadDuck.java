package labs.lab5.prob2.models.duck;

import labs.lab5.prob2.models.behavior.FlyWithWings;
import labs.lab5.prob2.models.behavior.Quack;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
