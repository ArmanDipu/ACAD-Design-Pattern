import java.util.ArrayList;
import java.util.List;

public class QuackPublisherService implements PublisherService{
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscriber(){
        for(Subscriber subscriber: subscribers){
            subscriber.onEvent();
        }
    }
}
