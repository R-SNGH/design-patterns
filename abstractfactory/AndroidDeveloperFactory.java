package designpatterns.abstractfactory;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employeee createEmployee() {
        return (Employeee) new AndroidDeveloper();
    }
}
