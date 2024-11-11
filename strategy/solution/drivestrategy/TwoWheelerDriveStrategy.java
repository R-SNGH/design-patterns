package designpatterns.strategy.solution.drivestrategy;

public class TwoWheelerDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Two wheeler driving...");
    }
}
