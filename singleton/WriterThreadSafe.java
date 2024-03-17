package designpatterns.singleton;

public class WriterThreadSafe {

    private static volatile WriterThreadSafe writer;

    private WriterThreadSafe (){
    }

    public static WriterThreadSafe getWriter(){
        if(writer==null){
            synchronized (WriterThreadSafe.class){
                if(writer==null){
                    writer=new WriterThreadSafe();
                }
            }
        }
        return writer;
    }
}
