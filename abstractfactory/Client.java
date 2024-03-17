package designpatterns.abstractfactory;

import designpatterns.factory.EmployeeFactory;

public class Client {
    public static void main(String[] args) {
        Employeee e1= (Employeee) EmployeeeFactory.getEmployee(new AndroidDeveloper());
    }
}
