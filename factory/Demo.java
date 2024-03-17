package designpatterns.factory;

public class Demo {
    public static void main(String[] args) {
        Employee e1= EmployeeFactory.getEmployee("WEB");
        Employee e2= EmployeeFactory.getEmployee("ANDROID");
    }
}
