package labs.lab5.prob2.models.duck;

import labs.lab5.prob2.models.behavior.CannotFly;
import labs.lab5.prob2.models.behavior.MuteQuack;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        this.flyBehavior = new CannotFly();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("displaying");
    }
}
