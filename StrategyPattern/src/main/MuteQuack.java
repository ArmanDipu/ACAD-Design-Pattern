package main;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Didn't heard a Noise from that duck yet !");
    }
}
