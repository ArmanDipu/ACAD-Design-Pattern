package main;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Duck is Flying.");
    }
}
