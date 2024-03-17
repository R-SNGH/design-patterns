package designpatterns.abstractfactory;

import designpatterns.factory.Employee;

public class EmployeeeFactory {
    public static Employeee getEmployee(EmployeeAbstractFactory factory){
        return (Employeee) factory.createEmployee();
    }
}
