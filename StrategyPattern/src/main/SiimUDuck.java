package main;
//Driver Code

public class SiimUDuck {
    public static void main(String[] args) {
        MallardDuck d0 = new MallardDuck();
        d0.display();
        d0.swim();
        d0.performQuack();
        d0.performFly();

        System.out.println("=========================================================================================");

        DecoyDuck d1 = new DecoyDuck();
        d1.display();
        d1.swim();
        d1.performQuack();
        d1.performFly();

        System.out.println("=========================================================================================");

        RubberDuck d2 = new RubberDuck();
        d2.display();
        d2.swim();
        d2.performQuack();
        d2.performFly();
        d2.setFlyBehavior(new FlyRocketPowered());
        d2.performFly();
    }
}
