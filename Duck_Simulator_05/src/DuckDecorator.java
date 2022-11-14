public class DuckDecorator extends Duck{
    private Duck wrappee;

    DuckDecorator(Duck duck){
        this.wrappee = duck;
    }

    public void quack() {
        wrappee.quack();
    }

    public void display(){
        wrappee.display();
    }
}
