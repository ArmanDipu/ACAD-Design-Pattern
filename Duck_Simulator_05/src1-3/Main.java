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

        System.out.println("===== Task2 =====");
        Goose goose = new Goose();
        GooseAdapter gooseAdapter = new GooseAdapter(goose);
        gooseAdapter.display();
        gooseAdapter.swim();
        gooseAdapter.quack();

        System.out.println("===== Task3 =====");
        DuckDecorator duck1 = new CounterDecorator(new MallardDuck());
        duck1.quack();
        duck1.quack();
        duck1.quack();

    }
}