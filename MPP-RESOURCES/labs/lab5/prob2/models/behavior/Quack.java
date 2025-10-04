package labs.lab5.prob2.models.behavior;

import labs.lab5.prob2.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override public void quack() { System.out.println("quacking"); }
}