package designpatterns.strategy.solution;

import designpatterns.strategy.solution.drivestrategy.TwoWheelerDriveStrategy;

public class MotorBike extends Vehicle {
    public MotorBike(TwoWheelerDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
