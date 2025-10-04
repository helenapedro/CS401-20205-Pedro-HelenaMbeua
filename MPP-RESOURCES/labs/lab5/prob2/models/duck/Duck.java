package labs.lab5.prob2.models.duck;

import labs.lab5.prob2.interfaces.FlyBehavior;
import labs.lab5.prob2.interfaces.QuackBehavior;

abstract public class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("swimming");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
