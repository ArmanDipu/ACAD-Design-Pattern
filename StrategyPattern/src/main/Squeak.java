package main;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Rubber Duck is Squeaking.");
    }
}
