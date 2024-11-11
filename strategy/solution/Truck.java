package designpatterns.strategy.solution;

import designpatterns.strategy.solution.drivestrategy.HeavyVehicleDriveStrategy;
import designpatterns.strategy.solution.drivestrategy.TwoWheelerDriveStrategy;

public class Truck extends Vehicle {
    public Truck(HeavyVehicleDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
