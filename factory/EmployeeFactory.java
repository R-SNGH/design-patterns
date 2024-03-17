package designpatterns.factory;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        if("WEB".equals(empType)){
            return new WebDev();
        }
        else if("ANDROID".equals(empType)){
            return new AndroidDev();
        }
        else return null;
    }
}
