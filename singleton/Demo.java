package designpatterns.singleton;
import com.designpatterns.singleton.SingletonLazy;
import com.designpatterns.singleton.SingletonEager;

public class Demo {
    public static void main(String[] args) {
        com.designpatterns.singleton.SingletonLazy singletonLazy1 = SingletonLazy.getSingleton();
        com.designpatterns.singleton.SingletonLazy singletonLazy2 = SingletonLazy.getSingleton();
        System.out.println(singletonLazy1.hashCode());
        System.out.println(singletonLazy2.hashCode());

        com.designpatterns.singleton.SingletonEager singletonEager1 = com.designpatterns.singleton.SingletonEager.getSingletonEager();
        com.designpatterns.singleton.SingletonEager singletonEager2 = com.designpatterns.singleton.SingletonEager.getSingletonEager();
        System.out.println(singletonEager1.hashCode());
        System.out.println(singletonEager2.hashCode());

        com.designpatterns.singleton.IsEnumSingleton isEnumSingleton1 = com.designpatterns.singleton.IsEnumSingleton.INSTANCE;
        com.designpatterns.singleton.IsEnumSingleton isEnumSingleton2 = com.designpatterns.singleton.IsEnumSingleton.INSTANCE;
        System.out.println("Testing enums... ");
        System.out.println(isEnumSingleton1.hashCode());
        System.out.println(isEnumSingleton2.hashCode());



    }
}
