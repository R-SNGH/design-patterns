package designpatterns.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {

        String newsItem ="some news";

        SubscriberImpl sub1 = new SubscriberImpl("subscriber 1");
        SubscriberImpl sub2 = new SubscriberImpl("subscriber 2");
        SubscriberImpl sub3 = new SubscriberImpl("subscriber 3");
        SubscriberImpl sub4 = new SubscriberImpl("subscriber 4");
        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(sub1);
        subscribers.add(sub2);

        Guardian guardian = new Guardian(newsItem, subscribers);
        guardian.addSubscriber(sub3);
        guardian.addSubscriber(sub4);
        guardian.publishArticle();
        guardian.removeSubscriber(sub2);
        guardian.notifySubscriber();

    }
}
