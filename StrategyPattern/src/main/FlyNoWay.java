package main;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("That duck is not Flying , Huh.");
    }
}
