package designpatterns.observer.example1;

public class SubscriberImpl implements Subscriber{

    private String subscriberName;

    public SubscriberImpl(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String newsArticle) {
        System.out.println(subscriberName +" has been updated.");
        //read news
    }
}
