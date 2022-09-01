package main;
//Non-Identical Behavior Type

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("That Duck is Flying. Quick shoot It !");
    }
}
