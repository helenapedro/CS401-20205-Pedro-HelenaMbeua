package labs.lab5.prob2.models.behavior;

import labs.lab5.prob2.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override public void fly() { System.out.println("fly with wings"); }
}
