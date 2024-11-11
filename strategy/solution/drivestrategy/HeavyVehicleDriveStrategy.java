package designpatterns.strategy.solution.drivestrategy;

public class HeavyVehicleDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Heavy Vehicle driving...");
    }
}
