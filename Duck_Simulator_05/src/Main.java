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

        AbstractFactory abstractFactory;
        abstractFactory = new CountingDuckFactory();
        Duck duck2 = abstractFactory.createDuck("Alabio");
        duck2.display();
        duck2.swim();
        duck2.quack();
        duck2.quack();

        System.out.println();
        System.out.println("===== Task5 =====");
        
    }
}