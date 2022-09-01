package main;

public class QuackClass implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Which Duck made the Quacking Sound ?");
    }
}
