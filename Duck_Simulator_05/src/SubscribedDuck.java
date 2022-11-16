public class SubscribedDuck implements Quackable{
    public QuackPublisherService quackPublisherService = new QuackPublisherService();

    @Override
    public void quack() {
        System.out.println("Duck is Quacking");
        quackPublisherService.notifySubscriber();
    }
}
