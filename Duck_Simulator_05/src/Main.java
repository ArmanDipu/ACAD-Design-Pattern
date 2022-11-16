public class Main {
    public static void main(String[] args) {

        System.out.println("===== Task1 =====");
        AlabioDuck alabioDuck = new AlabioDuck();
        alabioDuck.display();
        alabioDuck.swim();
        alabioDuck.quack();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();

        System.out.println();
        System.out.println("===== Task2 =====");
        Goose goose = new Goose();
        GooseAdapter gooseAdapter = new GooseAdapter(goose);
        gooseAdapter.display();
        gooseAdapter.swim();
        gooseAdapter.quack();

        System.out.println();
        System.out.println("===== Task3 =====");
        Duck duck1 = new CounterDecorator(new MallardDuck());
        duck1.display();
        duck1.quack();
        duck1.quack();
        duck1.quack();

        System.out.println();
        System.out.println("===== Task4 =====");

        AbstractDuckFactory duckFactory = new DuckFactory();
        Quackable duck2 = duckFactory.createDuck("Alabio");
        duck2.quack();

        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        Quackable duck3 = countingDuckFactory.createCountingDuck("Mallard");
        duck3.quack();
        duck3.quack();
        duck3.quack();

        Duck[] ducks = new Duck[5];
        for(int i=0; i<5; i++){
            ducks[i] = (Duck) duckFactory.createDuck("Mallard");
        }

        System.out.println();
        System.out.println("===== Task5 =====");
        FlockOfDucks flockOfDucks = new FlockOfDucks(ducks);
        flockOfDucks.quack();
    }
}