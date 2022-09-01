package main;
//Non-Identical Behavior (newly added)

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Whoh ! That Duck is flying with a Rocket.");
    }
}
