package com.designpatterns.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafe;
    private SingletonThreadSafe(){}

    public static SingletonThreadSafe getSingletonThreadSafe(){
        if(singletonThreadSafe == null){
            synchronized (SingletonThreadSafe.class){
                if(singletonThreadSafe == null){
                    singletonThreadSafe = new SingletonThreadSafe();
                }
            }
        }
        return singletonThreadSafe;
    }
}
