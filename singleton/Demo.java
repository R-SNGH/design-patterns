package com.designpatterns.singleton;

public class Demo {
    public static void main(String[] args) {
        SingletonLazy singletonLazy1 = SingletonLazy.getSingleton();
        SingletonLazy singletonLazy2 = SingletonLazy.getSingleton();
        System.out.println(singletonLazy1.hashCode());
        System.out.println(singletonLazy2.hashCode());

        SingletonEager singletonEager1 = SingletonEager.getSingletonEager();
        SingletonEager singletonEager2 = SingletonEager.getSingletonEager();
        System.out.println(singletonEager1.hashCode());
        System.out.println(singletonEager2.hashCode());

        IsEnumSingleton isEnumSingleton1 = IsEnumSingleton.INSTANCE;
        IsEnumSingleton isEnumSingleton2 = IsEnumSingleton.INSTANCE;
        System.out.println("Testing enums... ");
        System.out.println(isEnumSingleton1.hashCode());
        System.out.println(isEnumSingleton2.hashCode());



    }
}
