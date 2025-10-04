package labs.lab5.prob2.models.duck;

import labs.lab5.prob2.models.behavior.CannotFly;
import labs.lab5.prob2.models.behavior.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        this.flyBehavior = new CannotFly();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
