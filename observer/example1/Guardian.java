package designpatterns.observer.example1;

import java.util.List;

public class Guardian implements NewsBroadcast{
    private String newsArticle;
    List<Subscriber> subscribers;

    public Guardian(String newsArticle, List<Subscriber> subscribers) {
        this.newsArticle = newsArticle;
        this.subscribers = subscribers;
    }

    @Override
    public void addSubscriber(Subscriber newSubscriber) {
        subscribers.add(newSubscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber sub: subscribers){
            sub.update(newsArticle);
        }
    }

    @Override
    public void publishArticle() {
        this.newsArticle="news item";
        notifySubscriber();
    }
}
