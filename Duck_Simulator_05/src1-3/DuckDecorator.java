public class DuckDecorator implements Quackable{
    private Quackable wrappee;

    DuckDecorator(Quackable quackable){
        this.wrappee = quackable;
    }
    @Override
    public void quack() {
        wrappee.quack();
    }
}
