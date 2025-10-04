package labs.lab5.prob2.models.behavior;

import labs.lab5.prob2.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override public void quack() { System.out.println("cannot quack"); }
}