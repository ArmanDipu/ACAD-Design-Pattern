package main;
//DuckType

public class RubberDuck extends Duck{
    RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I can see a Yellow Duck");
    }
}
