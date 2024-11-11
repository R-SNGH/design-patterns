package designpatterns.observer.rough;

import java.util.ArrayList;

public class Observable {
    private String someProperty;
    private ArrayList<Observer> observers;

    public Observable(String someProperty, ArrayList<Observer> observers) {
        this.someProperty = someProperty;
        this.observers = observers;
    }

    public void addObservor(Observer observor){
        observers.add(observor);
    }
    public void removeObservor(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservors(){
        for(Observer o : observers){
            o.observe();
        }
    }
    public void updateData(){
        this.someProperty="modified";
        for(Observer o : observers){
            o.observe();
        }
    }
}
