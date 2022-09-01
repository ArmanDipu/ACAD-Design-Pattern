package main;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Wooden Duck can't make Noise.");
    }
}
