public class AlabioDuck extends Duck implements Quackable{
    @Override
    void display(){
        System.out.println("This is an Alabio Duck.");
    }
    @Override
    public void quack() {
        System.out.println("Duck is Quacking.");
    }
}
