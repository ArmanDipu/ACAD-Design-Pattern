package main;

public class SiimUDuck {
    public static void main(String[] args) {
        MallardDuck d0 = new MallardDuck();
        d0.display();
        d0.quackBehavior.quack();
        d0.flyBehavior.fly();
    }
}
