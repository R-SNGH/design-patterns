package designpatterns.singleton;

import java.io.Serializable;

public class Writer implements Cloneable, Serializable {

    private static Writer writer;

    private Writer(){

    }

    public static Writer getWriter(){
        if(writer==null){
            writer=new Writer();
        }
        return writer;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return new Writer();
    }

}
