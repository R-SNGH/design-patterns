package com.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class BreakingSingletonDemo {
    public static void main(String[] args) throws Exception {
        //updated
        SingletonLazy singletonLazy1 = SingletonLazy.getSingleton();
        SingletonLazy singletonLazy2 = SingletonLazy.getSingleton();

        System.out.println("Initial Status: Singleton entact? "+ (singletonLazy2.hashCode()==singletonLazy1.hashCode()));

        System.out.println("Now Breaking Singleton by using reflection... ");

        Constructor<SingletonLazy> constructor = SingletonLazy.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazy singletonLazy3 = constructor.newInstance();
        SingletonLazy singletonLazy4 = constructor.newInstance();
        System.out.println("After Reflection. Singleton entact? "+ (singletonLazy3.hashCode()==singletonLazy4.hashCode()));


    }
}
