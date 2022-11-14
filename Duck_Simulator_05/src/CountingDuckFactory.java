public class CountingDuckFactory implements AbstractFactory{
    public Duck createDuck(String duckType){
        if (duckType == "Alabio"){
            Duck duck = new CounterDecorator(new AlabioDuck());
            return duck;
        }
        else if(duckType == "Mallard"){
            Duck duck = new CounterDecorator(new MallardDuck());
            return duck;
        }
        else return null;
    }
}
