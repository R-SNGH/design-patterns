package designpatterns.abstractfactory;

import designpatterns.factory.Employee;

public class AndroidDeveloper implements Employeee {
    @Override
    public int getSalary() {
        return 96000;
    }
}
