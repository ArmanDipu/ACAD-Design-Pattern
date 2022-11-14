public class Duck implements Quackable{
    void swim(){
        System.out.println("Duck is Swimming.");
    }
    void display(){
        System.out.println("This is a Duck.");
    }

    @Override
    public void quack() {
        System.out.println("Duck is Quacking.");
    }
}
