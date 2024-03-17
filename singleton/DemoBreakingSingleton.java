package designpatterns.singleton;

import java.lang.reflect.Constructor;

public class DemoBreakingSingleton {
    public static void main(String[] args) throws Exception{
        Writer jane = Writer.getWriter();
        System.out.println(jane.hashCode());
        //Reflection
        Constructor<Writer> c= Writer.class.getDeclaredConstructor();
        c.setAccessible(true);
        Writer mary = c.newInstance();
        System.out.println(mary.hashCode());


    }
}
