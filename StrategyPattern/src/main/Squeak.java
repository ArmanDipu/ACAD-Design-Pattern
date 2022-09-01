package main;
//Non-Identical Behavior Type1.

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("That Quack sounds Strange !");
    }
}
