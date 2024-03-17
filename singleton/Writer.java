package designpatterns.singleton;

public class Writer {

    private static Writer writer;

    private Writer(){

    }

    public static Writer getWriter(){
        if(writer==null){
            writer=new Writer();
        }
        return writer;
    }


}
