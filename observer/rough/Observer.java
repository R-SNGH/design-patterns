package designpatterns.observer.rough;

public class Observer {
    private String observorNmae;

    public Observer(String observorNmae) {
        this.observorNmae = observorNmae;
    }

    public void observe(){
        System.out.println(observorNmae+" has been notified.");
    }
}
