package main;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void quackBehavior(){
        quackBehavior.quack();
    }
}
