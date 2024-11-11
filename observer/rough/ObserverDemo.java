package designpatterns.observer.rough;

import java.util.ArrayList;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer o1 = new Observer("Observer 1");
        Observer o2 = new Observer("Observer 2");

        ArrayList<Observer> observerList = new ArrayList<>();
        observerList.add(o1);
        observerList.add(o2);
        Observable observable = new Observable("original", observerList);

        Observer o3 = new Observer("Observer 3");
        observable.addObservor(o3);
        observable.updateData();
        observable.removeObservor(o2);
        observable.notifyObservors();

    }

}
