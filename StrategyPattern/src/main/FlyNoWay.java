package main;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Rubber Duck can't Fly.");
    }
}
