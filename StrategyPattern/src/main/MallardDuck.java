package main;
//DuckType

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new QuackClass();
        flyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("I can see a Mallard Duck.");
    }
}
