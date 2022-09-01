package main;
//SuperClass

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();
    public void swim(){
        System.out.println("Duck is Swimming or is It Floating?");
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
}
