package main;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new QuackClass();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("Rendered a Mallard Duck.");
    }
}
