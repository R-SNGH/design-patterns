package com.designpatterns.singleton;

public class SingletonEager {
    private static  SingletonEager singletonEager= new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getSingletonEager(){
        return singletonEager;
    }
}
