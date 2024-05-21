package com.designpatterns.singleton;

public class SingletonLazy {

    private static SingletonLazy singletonlazy ;

    private SingletonLazy(){
        if(singletonlazy !=null)
            throw new RuntimeException("you cant break me! ");
    }

    public static SingletonLazy getSingleton(){
        if(singletonlazy == null){
            singletonlazy = new SingletonLazy();
        }
        return singletonlazy;
    }
}
