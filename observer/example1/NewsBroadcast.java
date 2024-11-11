package designpatterns.observer.example1;

public interface NewsBroadcast {
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscriber();
    public void publishArticle();
}
