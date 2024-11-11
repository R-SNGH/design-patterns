package designpatterns.strategy.solution;

import designpatterns.strategy.solution.drivestrategy.DriveStrategy;
import designpatterns.strategy.solution.drivestrategy.TwoWheelerDriveStrategy;

public class Scooty extends Vehicle {
    public Scooty(TwoWheelerDriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
