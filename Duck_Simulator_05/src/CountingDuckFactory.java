public class CountingDuckFactory implements AbstractDuckFactory {
    public Duck createDuck(String duckType){
       return null;
    }

    @Override
    public Quackable createCountingDuck(String duckType) {
        if (duckType == "Alabio"){
            System.out.println("Creating Alabio Duck in Counting Duck Factory.");
            Duck duck = new CounterDecorator(new AlabioDuck());
            return duck;
        }
        else if(duckType == "Mallard"){
            System.out.println("Creating Mallard Duck in Counting Duck Factory.");
            Duck duck = new CounterDecorator(new MallardDuck());
            return duck;
        }
        else return null;
    }
}
