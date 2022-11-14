public class CounterDecorator extends DuckDecorator{
    CounterDecorator(Duck duck) {
        super(duck);
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
