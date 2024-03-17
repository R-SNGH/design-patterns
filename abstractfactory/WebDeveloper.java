package designpatterns.abstractfactory;

import designpatterns.factory.Employee;

public class WebDeveloper implements Employeee {

    @Override
    public int getSalary() {
        return 45600;
    }
}
