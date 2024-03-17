package designpatterns.abstractfactory;

public class WebDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employeee createEmployee() {
        return (Employeee) new WebDeveloper();
    }
}
