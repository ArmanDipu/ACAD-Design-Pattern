package main;

public class QuackClass implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Duck is Quacking");
    }
}
