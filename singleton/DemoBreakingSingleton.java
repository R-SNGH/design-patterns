package designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class DemoBreakingSingleton {
    public static void main(String[] args) throws Exception{
        Writer jane = Writer.getWriter();
        System.out.println(jane.hashCode());
        //Reflection
        System.out.println("Breaking Singleton via Reflection");
        Constructor<Writer> c= Writer.class.getDeclaredConstructor();
        c.setAccessible(true);
        Writer mary = c.newInstance();
        System.out.println(mary.hashCode());
        //Cloning
        System.out.println("Breaking Singleton via Cloning");
        Writer oscar = Writer.getWriter();
        System.out.println("oscar hashcode: "+oscar.hashCode());
        Writer john = (Writer)oscar.clone();
        System.out.println("john hashcode: "+john.hashCode());
        //Serialization
        System.out.println("Breaking Singleton via Serialization/Deserialization");
        Writer herman = Writer.getWriter();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
        oos.writeObject(herman);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
        Writer charles= (Writer)ois.readObject();
        System.out.println("herman hashcode: "+ herman.hashCode() + "; charles hashcode: "+ charles.hashCode());
    }
}
