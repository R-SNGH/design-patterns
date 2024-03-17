package designpatterns.singleton;

public class Demo {
    public static void main(String[] args) {
        Writer jane = Writer.getWriter();
        Writer dostoevsky =Writer.getWriter();
        System.out.println(jane.hashCode());
        System.out.println(dostoevsky.hashCode());
        System.out.println("The hashcodes are equal. Therefore, its a singleton class.");

    }
}
