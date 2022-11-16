public class DuckFactory implements AbstractDuckFactory {

    @Override
    public Quackable createDuck(String duckType) {
        if (duckType.equals("Alabio")){
            System.out.println("Creating Alabio Duck in Duck Factory.");
            return new AlabioDuck();
        }
        else if(duckType.equals("Mallard")){
            System.out.println("Creating Mallard Duck in Duck Factory.");
            return new MallardDuck();
        }
        else return null;
    }

    @Override
    public Quackable createCountingDuck(String duckType) {
        return null;
    }
}
