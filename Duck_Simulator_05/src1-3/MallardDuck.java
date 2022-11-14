public class MallardDuck extends Duck implements Quackable{
    @Override
    void display(){
        System.out.println("This is an Mallard Duck.");
    }
    @Override
    public void quack() {
        System.out.println("Duck is Quacking.");
    }
}
