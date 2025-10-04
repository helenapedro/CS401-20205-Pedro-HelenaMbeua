package labs.lab5.prob2.models.behavior;

import labs.lab5.prob2.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override public void quack() { System.out.println("squeaking"); }
}