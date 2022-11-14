public class CounterDecorator extends DuckDecorator{
    CounterDecorator(Quackable quackable) {
        super(quackable);
    }

    int QuackCounter = 0;
    @Override
    public void quack(){
        System.out.println("Duck is Quacking");
        QuackCounter++;
        countQuack();
    }

    public void countQuack(){
        System.out.println("Duck has Quacked "+QuackCounter+" times. ");
    }
}
